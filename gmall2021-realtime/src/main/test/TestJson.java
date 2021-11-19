import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author fada.yu
 * @version 1.0
 * @date 2021/9/8 11:31
 * @Desc:
 */
public class TestJson {

    public static void main(String[] args) {
        String jsonStr="{\n" +
                "\"code\": 200,\n" +
                "\"data\": {\n" +
                "\"endYear\": -1,\n" +
                "\"experience\": [\n" +
                "\"应届生\"\n" +
                "],\n" +
                "\"startYear\": -1\n" +
                "},\n" +
                "\"time\": \"2021-10-25 14:35:22\",\n" +
                "\"message\": \"成功\",\n" +
                "\"taskId\": \"a362788620c749f2bfe734ef4393c17d\"\n" +
                "}";


        JSONObject jsonObject = JSON.parseObject(jsonStr);
        String res = jsonObject.getJSONObject("data").getString("experience");
        if (res.contains("[")&& res.contains("]")){
            System.out.println(JSON.parseArray(res).contains("应届生"));
        }


    }
}
