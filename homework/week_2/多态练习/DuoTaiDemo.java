
abstract class Animal
{
    abstract void eat();
}

class Cat extends Animal
{
    public void eat()
    {
        System.out.println("����");
    }
    public void catchMouse()
    {
        System.out.println("ץ����");
    }
}

class Dog extends Animal
{
    public void eat()
    {
        System.out.println("�Թ�ͷ");
    }
    public void kanjia()
    {
        System.out.println("����");
    }
}

class Pig extends Animal
{
    public void eat()
    {
        System.out.println("����");
    }
    public void gongDi()
    {
        System.out.println("����");
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

        Animal c2 = new Cat();//��̬�ڳ����еı���,��������������ת��
        c2.eat();

        Cat c3=(Cat) c2;//ǿ�ƽ����������ת���������͡�����ת�͡�
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