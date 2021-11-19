import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author fada.yu
 * @version 1.0
 * @date 2021/11/18 14:50
 * @Desc:
 */
public class TestSimpleDateFormate {
    private static final SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");


    @Test
    public  void test1() throws ParseException {
        Date date = new Date();
        String formatStr = sdf.format(date);
        System.out.println(formatStr);

        if ("java.net.SocketTimeoutException: Read timed out".contains("Read timed out")){
            System.out.println("true");
        }


    }
}
