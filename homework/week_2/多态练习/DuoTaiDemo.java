
abstract class Animal
{
    abstract void eat();
}

class Cat extends Animal
{
    public void eat()
    {
        System.out.println("吃鱼");
    }
    public void catchMouse()
    {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal
{
    public void eat()
    {
        System.out.println("吃骨头");
    }
    public void kanjia()
    {
        System.out.println("看家");
    }
}

class Pig extends Animal
{
    public void eat()
    {
        System.out.println("饲料");
    }
    public void gongDi()
    {
        System.out.println("拱地");
    }
}

class DuoTaiDemo
{
    public static void main(String [] args)
    {
        System.out.println("Hello World!");
        Cat c= new Cat();
        c.eat();

        Dog d = new Dog();
        d.eat();
        Cat c1 = new Cat();
        function(c1);

        function(new Dog());
        function(new Pig());

        Animal c2 = new Cat();//多态在程序中的表现,类型提升，向上转型
        c2.eat();

        Cat c3=(Cat) c2;//强制将父类的引用转成子类类型。向下转型。
        c3.catchMouse();

        function(new Cat());
        function(new Dog());
        function(new Pig());
    }
    public static void function(Animal a)
    {
        a.eat();
        if(a instanceof Cat)
        {
            Cat c = (Cat)a;
        c.catchMouse();
        }
    else if(a instanceof Dog)
    {
        Dog c = (Dog)a;
        c.kanjia();
    }
       
    }
    public static void function(Cat c)
    {
        c.eat();
    }
    public static void function(Dog c)
    {
        c.eat();
    }
    public static void function(Pig p)
    {
        p.eat();
    }
}