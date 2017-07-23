//用户输入数字，给出大或小的 反馈。直到猜对为止，记录猜测次数，游戏要有开始，退出，再来一次选项。 
import java.util.Scanner;

import javax.net.ssl.ExtendedSSLSession;

public class week_2
{
   public static void main(String[] args)
   {
       System.out.println("猜数字游戏，计算机随机生成0-100的数字，输入数字，计算机提示大小");
       Ranking newRanking=new Ranking();
       while(true)
       {
           System.out.println("输入1开始游戏，输入2退出游戏，输入3再来一次");
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
                System.out.println("输入有误，请重新输入");
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
                System.out.println("偏小");
            }
            else if(innum>number)
            {
                System.out.println("偏大");
            }
            else if(innum==number)
            {
                System.out.println("猜对啦，一共猜了"+sum+"次");
                return sum;
            }
            else
            {
                System.out.println("输入有误，请重新输入");
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
        System.out.println("游戏开始");
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
        System.out.println("排行榜：");
        for(int i=size-1;i>=0;i--)
        {
	    if(degree[i]!=0)
            {
               System.out.println(degree[i]+"次");
            }
            
        }
    }

}