package com.order.shiro;
import com.order.bean.ShiroUser;
import com.order.bean.User;
import com.order.dao.UserDao;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

public class ShiroDbRealm extends AuthorizingRealm {
    @Autowired
    private UserDao userDao;

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        User user = (User) principalCollection.getPrimaryPrincipal();
        String role = String.valueOf(user.getRoleId());
        info.addRole(role);
        System.out.println("info==================="+info.toString());
        return info;
    }

    /**
     * 认证登录
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        User temp = new User();
        String userName = token.getUsername();
        temp.setUserName(userName);
        User user = userDao.selectOne(userName);
        if (user == null){
            throw new CredentialsException();
        }

        SimpleAuthenticationInfo authInfo = new SimpleAuthenticationInfo(user,
                user.getPassword(), ByteSource.Util.bytes(user.getSalt()), getName());
        return authInfo;
    }
}
