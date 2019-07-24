package cn.proxy;

interface IUserDao {
    void save();
}

class UserDao implements IUserDao{
    @Override
    public void save() {
        System.out.println("模拟:保存一个用户");
    }
}

class UserDaoProxy implements IUserDao{

    private IUserDao userDao = new UserDao();

    @Override
    public void save() {
        System.out.println("代理.....");
        userDao.save();
        System.out.println("代理.....");
    }
}

public class StaticProxy{
    public static void main(String[] args) {
        IUserDao userDao = new UserDaoProxy();
        userDao.save();
    }
}
