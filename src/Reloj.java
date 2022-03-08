import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Reloj 
{
    String Hora, Minutos, Segundos, AmPm;
    Calendar Cal;
    
    public Reloj()
    {
        Cal = new GregorianCalendar();
        Date Fecha = new Date();
        Cal.setTime(Fecha);
        AmPm = Cal.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
        if(AmPm.equals("PM"))
        {
            int H = Cal.get(Calendar.HOUR_OF_DAY)-12;
            Hora = H>9?""+H:"0"+H;
        }
        else
        {
            Hora = Cal.get(Calendar.HOUR_OF_DAY)>9?""+Cal.get(Calendar.HOUR_OF_DAY):"0"+Cal.get(Calendar.HOUR_OF_DAY);
        }
        Minutos = Cal.get(Calendar.MINUTE)>9?""+Cal.get(Calendar.MINUTE):"0"+Cal.get(Calendar.MINUTE);
        Segundos = Cal.get(Calendar.SECOND)>9?""+Cal.get(Calendar.SECOND):"0"+Cal.get(Calendar.SECOND);
    }
}