package proxydemo4;

import proxydemo2.UserService;
import proxydemo2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(userService);
        //动态生成代理类
        UserService proxy = (UserService) proxyInvocationHandler.getProxy();
        proxy.delete();
    }

}
