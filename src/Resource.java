import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Resource {

    private Date date;

    public Date getDate() {
        Date d = new Date();
        date = d;
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
