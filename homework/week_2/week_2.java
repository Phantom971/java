//�û��������֣��������С�� ������ֱ���¶�Ϊֹ����¼�²��������ϷҪ�п�ʼ���˳�������һ��ѡ� 
import java.util.Scanner;

import javax.net.ssl.ExtendedSSLSession;

public class week_2
{
   public static void main(String[] args)
   {
       System.out.println("��������Ϸ��������������0-100�����֣��������֣��������ʾ��С");
       Ranking newRanking=new Ranking();
       while(true)
       {
           System.out.println("����1��ʼ��Ϸ������2�˳���Ϸ������3����һ��");
           int key;
           Scanner input = new Scanner(System.in);
           key = input.nextInt();
           if(key==1)
           {
               Game newgame=new Game();
               newRanking.setRank(newgame.StartGame());
           }
            else if(key==2)
            {
                newRanking.display();
                break;
            }
            else if(key==3)
            {
                continue;
            }
            else
            {
                System.out.println("������������������");
            }
       }
   }
}

class Game
{
    private int number;
    private int sum;
    private int innum;
    public Game()
    {
        sum=0;
        number=(int)(Math.random()*100);
    }
    public int StartGame()
    {
        while(true)
        {
            Scanner input = new Scanner(System.in);
            innum = input.nextInt();
            sum++;
            if(innum<number)
            {
                System.out.println("ƫС");
            }
            else if(innum>number)
            {
                System.out.println("ƫ��");
            }
            else if(innum==number)
            {
                System.out.println("�¶�����һ������"+sum+"��");
                return sum;
            }
            else
            {
                System.out.println("������������������");
            }
        }
    }
}
class Ranking
{
    private int [] degree = new int [100];
    int i=0;
    public Ranking()
    {
        System.out.println("��Ϸ��ʼ");
    }
    public void setRank (int times)
    {
        degree[i]=times;
        i++;
    }
    public void display()
    {
        int temp = 0;
        int size = degree.length;
        for(int i = 0 ; i < size-1; i ++)
        {
            for(int j = 0 ;j < size-1-i ; j++)
            { 
                if(degree[j] < degree[j+1])
                {
                    temp = degree[j];
                    degree[j] = degree[j+1];
                    degree[j+1] = temp;
                }
            }
        }
        System.out.println("���а�");
        for(int i=size-1;i>=0;i--)
        {
	    if(degree[i]!=0)
            {
               System.out.println(degree[i]+"��");
            }
            
        }
    }

}