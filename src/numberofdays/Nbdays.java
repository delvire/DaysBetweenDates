package numberofdays;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class Nbdays {
    public static void main(String[] args) {

        long oneDay;
        long val;
        long res;
        Date toDay;
        Date fdate1;
        Date fdate2;
        Scanner scDate;
        String date=null;

        oneDay=1000*60*60*24;

        scDate=new Scanner(System.in);

        toDay=new Date();
        fdate1=new Date();
        fdate2=new Date();

        System.out.print("Enter the first date (MM/DD/YYYY) : ");
        date=scDate.nextLine();

        try {
            DateFormat format=new SimpleDateFormat("MM/dd/yyyy");
            fdate1=format.parse(date);
            System.out.println(fdate1.toString());
        } catch (ParseException pe) {
            pe.printStackTrace();
        }

        System.out.print("Enter the second date (MM/DD/YYYY) : ");
        date=scDate.nextLine();

        if (date=="") {
            fdate2=toDay;
            System.out.println(fdate2.toString());
        }
        else {
            try {
                DateFormat format=new SimpleDateFormat("MM/dd/yyyy");
                fdate2=format.parse(date);
                System.out.println(fdate2.toString());
            } catch (ParseException pe) {
                pe.printStackTrace();
            }
        }

        val=fdate2.getTime()-fdate1.getTime();
        res=val/oneDay;
        System.out.println("Days between the two dates : "+res);

    }
}