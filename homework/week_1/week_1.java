//运算符&流程控制的操作练习
public class week_1
{
    public static void main(String[] args)
    {
       int a=0,b=2;
       //条件语句
        if(a<0)
        {
            System.out.println("条件语句,a="+a);
        }
        else if(a>0&b<=0)
        {
            System.out.println("条件语句,a>0&b<=0");
        }else
        {
            System.out.println("条件语句,a="+a+",b="+b);
        }
        //循环语句
        while(b<5)
        {
            System.out.println("循环语句,b="+b);
            b++;
        }
        //do/.while循环语句
        do
        {
            System.out.println("do/.while循环语句,a="+a);
            a+=b;
        }
        while(a<20);
        //确定循环
        for(int i=10;i>0;i--)
        {
            System.out.println("for循环,print\"hello world\""+i+"//10");
        }
        //多重选择
        switch (a)
        {
            case 20:
                System.out.println("多重选择,Switch is ok");
                break;
            default:
                System.out.println("Switch is default");
                break;
        }

    }
}
