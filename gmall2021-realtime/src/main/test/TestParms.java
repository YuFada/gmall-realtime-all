import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;

/**
 * @author fada.yu
 * @version 1.0
 * @date 2021/9/13 15:20
 * @Desc:
 */
public class TestParms {

    public static String test(String... parms) {
        String rootOrgId = "";
        String id = "";
        String includingSources = "";
        if (parms.length == 2) {
            rootOrgId = parms[0];
            id = parms[1];
            includingSources = "true";
        } else if (parms.length == 3) {
            rootOrgId = parms[0];
            id = parms[1];
            includingSources = parms[2];
            if (!"true".equals(includingSources) && !"false".equals(includingSources)) {
                includingSources = "true";
            }
        } else {
            return "";
        }

        if (StringUtils.isBlank(rootOrgId) || StringUtils.isBlank(id)) {
            return "";
        }
        JSONObject jsonObject = new JSONObject();
        // TODO: 2021/9/13  {"rootOrgId": 122431534,"id": 606,"includingSources": "true"}

        jsonObject.put("rootOrgId", rootOrgId);
        jsonObject.put("id", id);
        jsonObject.put("includingSources", includingSources);


        return jsonObject.toJSONString();
    }

    public static void main(String[] args) {
        String reslut = test("129052548", "6402913313");
        System.out.println(reslut);

    }

}