import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author fada.yu
 * @version 1.0
 * @date 2021/10/11 18:21
 * @Desc:
 */
public class TestJsonArray {
    public static void main(String[] args) {
        String jsonStr="[\n" +
                "\t{\n" +
                "\t\t\"featureCode\": \"1YwzD9\",\n" +
                "\t\t\"upperLevel1\": {\n" +
                "\t\t\t\"featureCode\": \"1WLBwc\",\n" +
                "\t\t\t\"kgID\": \"1e760bc639315c28e378564aa1629bb8\",\n" +
                "\t\t\t\"level\": \"1\",\n" +
                "\t\t\t\"weight\": 1,\n" +
                "\t\t\t\"word\": \"销售方式\"\n" +
                "\t\t},\n" +
                "\t\t\"kgID\": \"5532c5f1d88fc72526fa50e13de5ed7c\",\n" +
                "\t\t\"level\": \"2\",\n" +
                "\t\t\"conceptType\": \"sales_category_including_telemarketing_6_SalesMethod\",\n" +
                "\t\t\"conceptTypeName\": \"销售方式\",\n" +
                "\t\t\"wordLength\": 0,\n" +
                "\t\t\"weight\": 1,\n" +
                "\t\t\"upperLevel2\": {\n" +
                "\t\t\t\"featureCode\": \"1YwzD9\",\n" +
                "\t\t\t\"kgID\": \"5532c5f1d88fc72526fa50e13de5ed7c\",\n" +
                "\t\t\t\"level\": \"2\",\n" +
                "\t\t\t\"weight\": 1,\n" +
                "\t\t\t\"word\": \"网络销售\"\n" +
                "\t\t},\n" +
                "\t\t\"word\": \"网络销售\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"featureCode\": \"z4Onz\",\n" +
                "\t\t\"upperLevel1\": {\n" +
                "\t\t\t\"featureCode\": \"1WLBwc\",\n" +
                "\t\t\t\"kgID\": \"1e760bc639315c28e378564aa1629bb8\",\n" +
                "\t\t\t\"level\": \"1\",\n" +
                "\t\t\t\"weight\": 1,\n" +
                "\t\t\t\"word\": \"销售方式\"\n" +
                "\t\t},\n" +
                "\t\t\"kgID\": \"c53a9b71fea3e37e2fc48d145b659ce8\",\n" +
                "\t\t\"level\": \"2\",\n" +
                "\t\t\"conceptType\": \"sales_category_including_telemarketing_6_SalesMethod\",\n" +
                "\t\t\"conceptTypeName\": \"销售方式\",\n" +
                "\t\t\"wordLength\": 0,\n" +
                "\t\t\"weight\": 1,\n" +
                "\t\t\"upperLevel2\": {\n" +
                "\t\t\t\"featureCode\": \"z4Onz\",\n" +
                "\t\t\t\"kgID\": \"c53a9b71fea3e37e2fc48d145b659ce8\",\n" +
                "\t\t\t\"level\": \"2\",\n" +
                "\t\t\t\"weight\": 1,\n" +
                "\t\t\t\"word\": \"面销\"\n" +
                "\t\t},\n" +
                "\t\t\"word\": \"面销\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"featureCode\": \"1Izgsk\",\n" +
                "\t\t\"upperLevel1\": {\n" +
                "\t\t\t\"featureCode\": \"1WLBwc\",\n" +
                "\t\t\t\"kgID\": \"1e760bc639315c28e378564aa1629bb8\",\n" +
                "\t\t\t\"level\": \"1\",\n" +
                "\t\t\t\"weight\": 1,\n" +
                "\t\t\t\"word\": \"销售方式\"\n" +
                "\t\t},\n" +
                "\t\t\"kgID\": \"77efe0a408c26915153fb14580ef2e7c\",\n" +
                "\t\t\"level\": \"2\",\n" +
                "\t\t\"conceptType\": \"sales_category_including_telemarketing_6_SalesMethod\",\n" +
                "\t\t\"conceptTypeName\": \"销售方式\",\n" +
                "\t\t\"wordLength\": 0,\n" +
                "\t\t\"weight\": 1,\n" +
                "\t\t\"upperLevel2\": {\n" +
                "\t\t\t\"featureCode\": \"1Izgsk\",\n" +
                "\t\t\t\"kgID\": \"77efe0a408c26915153fb14580ef2e7c\",\n" +
                "\t\t\t\"level\": \"2\",\n" +
                "\t\t\t\"weight\": 1,\n" +
                "\t\t\t\"word\": \"渠道销售\"\n" +
                "\t\t},\n" +
                "\t\t\"word\": \"渠道销售\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"featureCode\": \"2wYof\",\n" +
                "\t\t\"upperLevel1\": {\n" +
                "\t\t\t\"featureCode\": \"1WLBwc\",\n" +
                "\t\t\t\"kgID\": \"1e760bc639315c28e378564aa1629bb8\",\n" +
                "\t\t\t\"level\": \"1\",\n" +
                "\t\t\t\"weight\": 1,\n" +
                "\t\t\t\"word\": \"销售方式\"\n" +
                "\t\t},\n" +
                "\t\t\"kgID\": \"49aadfa754334ac3aa8314cb29fe011c\",\n" +
                "\t\t\"level\": \"2\",\n" +
                "\t\t\"conceptType\": \"sales_category_including_telemarketing_6_SalesMethod\",\n" +
                "\t\t\"conceptTypeName\": \"销售方式\",\n" +
                "\t\t\"wordLength\": 0,\n" +
                "\t\t\"weight\": 1,\n" +
                "\t\t\"upperLevel2\": {\n" +
                "\t\t\t\"featureCode\": \"2wYof\",\n" +
                "\t\t\t\"kgID\": \"49aadfa754334ac3aa8314cb29fe011c\",\n" +
                "\t\t\t\"level\": \"2\",\n" +
                "\t\t\t\"weight\": 1,\n" +
                "\t\t\t\"word\": \"店面销售\"\n" +
                "\t\t},\n" +
                "\t\t\"word\": \"店面销售\"\n" +
                "\t}\n" +
                "]";

        JSONArray jsonArray = JSONObject.parseArray(jsonStr);
        System.out.println(jsonArray.getJSONObject(0));

        //System.out.println(jsonArray);
    }
}
