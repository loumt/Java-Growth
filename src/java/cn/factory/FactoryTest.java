package cn.factory;

import java.util.Date;

//定义一个抽象工厂
abstract class AbstractFactory{
    abstract Product generate();
}
//定义第一个实现工厂
class NormalFactory1 extends AbstractFactory{
    @Override
    Product generate() {
        return new NormalProduct1();
    }
}

//定义第二个实现工厂
class NormalFactory2 extends AbstractFactory{
    @Override
    Product generate() {
        return new NormalProduct2();
    }
}


//定义产品抽象
interface Product{
    String getName();
    Date getCreateTime();
    void show();
}
//定义产品1
class NormalProduct1 implements Product{
    private static final String NAME = "产品1";
    private Date createTime;

    public NormalProduct1(){
        this.createTime = new Date();
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void show() {
        System.out.println(this.getName() + " 生产了 生产日期(" + this.getCreateTime() + ")");
    }
}
//定义产品2
class NormalProduct2 implements Product{
    private static final String NAME = "产品2";
    private Date createTime;

    public NormalProduct2(){
        this.createTime = new Date();
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void show() {
        System.out.println(this.getName() + " 生产了 生产日期(" + this.getCreateTime() + ")");
    }
}


public class FactoryTest {
    public static void main(String[] args) {
        NormalFactory1 normalFactory1 = new NormalFactory1();
        normalFactory1.generate().show();

        NormalFactory2 normalFactory2 = new NormalFactory2();
        normalFactory2.generate().show();
    }
}
