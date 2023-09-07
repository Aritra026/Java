import java.util.Scanner;
class Tv {
    int channel;
    int volumelevel;
    boolean on;
    public Tv()
    {
       on=false;
       channel=1;
       volumelevel=4;
    }
    public void turnon()
    {
        on=true;
        System.out.println("The Tv is now on");
    }
    public void turnoff()
    {
        on=false;
        System.out.println("The Tv is now off");
    }
    public void setchannel(int newchannel)
    {
        if( on && newchannel >=1 && newchannel<=120)
        {
            channel=newchannel;
            System.out.println("channel set to :"+channel);
        }

    }
    public void setvolumelevel(int newvolumelevel)
    {
         if(on && newvolumelevel >=1 && newvolumelevel<=7)
         {
            volumelevel=newvolumelevel;
            System.out.println("volumelevel set to :"+volumelevel);
         }
    }
    public void channelup()
    {
        if(on && channel<120)
        {
            channel++;
            System.out.println("The channel is changed to :"+channel);
        }
    }
    public void channeldown()
    {
        if(on && channel>1)
        {
            this.channel--;
            System.out.println("The channel is changed to :"+channel);
        }
    }
    public void volumeup()
    {
        if(on && volumelevel<7)
        {
            volumelevel++;
            System.out.println("The volumelevel is increased: "+volumelevel);
        }
        else
        {
            System.out.println("Out of range!");
        }
    }
    public void volumedown()
    {
        if(on && volumelevel>1)
        {
            volumelevel--;
            System.out.println("The volumelevel is decreased: "+volumelevel);
        }
    }

}
public class TelivisionControlSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tv tv = new Tv();
        System.out.println("Welcome to the TelivisionControlSystem!");
        while(true)
        {
            System.out.println("\nMenu:");
            System.out.println("1.Turn the Tv on.");
            System.out.println("2.Turn the Tv off.");
            System.out.println("3.Set the channel.");
            System.out.println("4.Change the channel up.");
            System.out.println("5.Change the channel down.");
            System.out.println("6.Set the volumelevel.");
            System.out.println("7.Increase the volume.");
            System.out.println("8.Decrease the volume.");
            System.out.println("9.Exit the program.");

            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                tv.turnon();
                break;
                case 2:
                tv.turnoff();
                break;
                case 3:
                System.out.println("Enter the channel:");
                int a = sc.nextInt();
                tv.setchannel(a);
                break;
                case 4:
                tv.channelup();
                break;
                case 5:
                tv.channeldown();
                break;
                case 6:
                System.out.println("Enter the volumelevel:");
                int volumelevel= sc.nextInt();
                tv.setvolumelevel(volumelevel);
                break;
                case 7:
                tv.volumeup();
                break;
                case 8:
                tv.volumedown();
                break;
                case 9:
                System.out.println("Thank you for using TelivisionControlSystem!Goodbye.");
                sc.close();
                System.exit(0);
                default:
                System.out.println("Invalid choice!");

            }
        }

    }
}

