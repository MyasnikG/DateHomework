import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Resource r = new Resource();
        r.setDate(new Date());
        System.out.println(r.getDate().toLocaleString());

        long time = r.getDate().getTime();
        time+=60000;
        r.getDate().setTime(time);

        System.out.println(r.getDate().toLocaleString());
        System.out.println(r.getDate().toLocaleString());
    }
}