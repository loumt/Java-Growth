package cn.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface IUserDao2 {
    void save();
}

class UserDao2 implements IUserDao2{
    @Override
    public void save() {
        System.out.println("模拟:保存一个用户");
    }
}

class UserDaoProxy2 implements IUserDao2{

    private IUserDao2 userDao = new UserDao2();

    @Override
    public void save() {
        System.out.println("代理.....");
        userDao.save();
        System.out.println("代理.....");
    }
}

class ProxyMain{
    //接收一个目标对象
    private Object target;

    public ProxyMain(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String methodName = method.getName();

                        Object result = null;
                        if("find".equals(methodName)){
                            result = method.invoke(target,args);
                        }else{
                            System.out.println("代理..........");
                            result = method.invoke(target,args);
                            System.out.println("代理..........");
                        }
                        return proxy;
                    }
                });
        return proxy;
    }
}

public class DynamicProxy {
    public static void main(String[] args) {
        IUserDao2 userDao = new UserDao2();
        System.out.println("目标对象:" + userDao.getClass());

        IUserDao2 proxy = (IUserDao2) new ProxyMain(userDao).getProxyInstance();
        System.out.println("代理对象: "  + proxy.getClass());
        proxy.save();
    }
}


