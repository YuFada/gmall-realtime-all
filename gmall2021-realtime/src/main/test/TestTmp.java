import com.alibaba.fastjson.JSONObject;

import java.util.Set;

/**
 * @author fada.yu
 * @version 1.0
 * @date 2021/8/25 16:13
 * @Desc:
 */
public class TestTmp {
    public static void main(String[] args) {
        String jsonStr="{\"feature\": \"user_im_p_start_chats_30m\", \"all_count\": \"257708\", \"all_key\": \"226932\", \"last_time\": \"2021-08-24 16:39:57\", \"check_type\": \"3\", \"feature_type\": \"m\", \"data_type\": \"stream\", \"check_time\": \"2021-08-25 16:06:20\", \"send_time\": 1629878784066}";
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        Set<String> strings = jsonObject.keySet();
        System.out.println(strings);
    }
}
