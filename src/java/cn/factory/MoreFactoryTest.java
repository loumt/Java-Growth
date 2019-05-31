package cn.factory;

interface Fruit{
    //成熟度
    Integer maturity();
    String getName();
    void eat();
    //出售
    Integer sell();
}
class Apple implements Fruit{
    private String name;
    private Integer price;
    private Integer maturity;

    public Apple() {
    }

    public Apple(Integer price, Integer maturity) {
        this.name = "苹果";
        this.price = price;
        this.maturity = maturity;
    }

    @Override
    public Integer maturity() {
        return maturity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println(this.name + " eat ......");
    }

    @Override
    public Integer sell() {
        return price;
    }
}
class Orange implements Fruit{
    private String name;
    private Integer price ;
    //表示成熟度
    private Integer maturity;

    public Orange(Integer price, Integer maturity) {
        this.name = "橘子";
        this.price = price;
        this.maturity = maturity;
    }

    @Override
    public Integer maturity() {
        return maturity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println(this.name + " eat ......");
    }

    @Override
    public Integer sell() {
        return price;
    }
}

class Animal{
    private String name;
    private Integer price;
    public Animal() {
    }

    public Animal(String name,Integer price) {
        this.name = name;
        this.price = price;
    }

    public void run() {
        System.out.println(this.name + " run ....");
    }
    public Integer sell() {
        return price;
    }
}
class Rabbit extends Animal{
    public Rabbit(Integer price) {
        super("兔子", price);
    }
}
class Duck extends Animal{

    public Duck(Integer price) {
       super("鸭子",price);
    }
}

abstract class AbsFactory{
    abstract Fruit generateFruit();
    abstract Animal generateAnimal();
}

class Factory1 extends AbsFactory{

    @Override
    Fruit generateFruit() {
        return new Apple(17,85);
    }

    @Override
    Animal generateAnimal() {
        return new Duck(52);
    }
}


class Factory2 extends AbsFactory{

    @Override
    Fruit generateFruit() {
        return new Orange(17,85);
    }

    @Override
    Animal generateAnimal() {
        return new Rabbit(52);
    }
}


public class MoreFactoryTest {

    public static void main(String[] args) {
        Factory1 factory1 = new Factory1();
        Factory2 factory2 = new Factory2();
        factory1.generateAnimal().run();
        factory1.generateFruit().eat();
        factory2.generateAnimal().run();
        factory2.generateFruit().eat();
    }
}
