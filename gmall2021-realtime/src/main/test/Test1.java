import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

/**
 * @author fada.yu
 * @version 1.0
 * @date 2021/8/12 19:07
 * @Desc:
 */
public class Test1 {
    public static void main(String[] args) throws JsonProcessingException {
        ArrayList<String> list = new ArrayList<>();
        list.add("yu");
        list.add("fa");
        list.add("da");
        ObjectMapper objectMapper = new ObjectMapper();
                 String   value = objectMapper.writeValueAsString(list);
        System.out.println(list);
        System.out.println(value);
    }
}
