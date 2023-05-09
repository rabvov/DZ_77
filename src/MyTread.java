import java.util.Date;

public class MyTread extends Thread{
    public void run(){
        Date date = new Date();
        System.out.println(date);
    }
}
