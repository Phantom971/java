//�����&���̿��ƵĲ�����ϰ
public class week_1
{
    public static void main(String[] args)
    {
       int a=0,b=2;
       //�������
        if(a<0)
        {
            System.out.println("�������,a="+a);
        }
        else if(a>0&b<=0)
        {
            System.out.println("�������,a>0&b<=0");
        }else
        {
            System.out.println("�������,a="+a+",b="+b);
        }
        //ѭ�����
        while(b<5)
        {
            System.out.println("ѭ�����,b="+b);
            b++;
        }
        //do/.whileѭ�����
        do
        {
            System.out.println("do/.whileѭ�����,a="+a);
            a+=b;
        }
        while(a<20);
        //ȷ��ѭ��
        for(int i=10;i>0;i--)
        {
            System.out.println("forѭ��,print\"hello world\""+i+"//10");
        }
        //����ѡ��
        switch (a)
        {
            case 20:
                System.out.println("����ѡ��,Switch is ok");
                break;
            default:
                System.out.println("Switch is default");
                break;
        }

    }
}
