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
                "\t\"searchList\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_current_status\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"7f8f616940a34d2ca3b09ed6c5648e48\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_unified_admit_flag\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"2c66ef9e1dca415e89b7b4069647afbb\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_max_education_level\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"e784d9b10fbb4eda8eb5817dffdd449a\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_employment_type\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"aabd42ff01cb475ea866749da1a7ca1b\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_login_cnts_time_distribution\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"18f55cfc1b6947a38d68670ad4db8a18\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_im_replies_time_distribution\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"d675b22be6ca46a090018aca0fec5e2f\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_apply_single_applications_time_distribution\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"044ff2edb8d34e42b7878239965ac93b\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_second_new_industry\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"2cb6b91d00564699b2c134ed90508314\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_third_new_industry\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"91d481071fd74ea19944006635e7c04d\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_quality_score\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"f5ed0d7d1370409d931422f128563869\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_search_cnts_time_distribution\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"089b7aff82f34907b9fbddfff8952f6a\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_view_cnts_time_distribution\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"872562785c8e4c86b8b790632c13f36b\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_apply_applications_time_distribution\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"636a139571c84a4e9ec6b7f4a2806345\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_current_industry\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"7c3ede1ffc194d7a89cef7720ad945e6\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_current_min_salary\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"63e8fed5ac2246aab35beb20bb9425ac\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_first_min_salary\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"3e58952f9c08418d9e422c74ca463bcc\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_im_start_chats_time_distribution\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"573ad6cac3a040538422e3c925c10a69\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_current_job_type\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"ee791063589d4bb7a86b0feaa5d7aca6\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_release_source_type\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"c737be28692f444b87447d3ac987bd9c\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_first_max_salary\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"3cb24a348bc2431cab7c39f55a6f4d81\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_second_max_salary\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"c61e308ba2cd4f6dbc93cebb9be48fc6\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_third_max_salary\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"c1da30727890465f837ca4bf400b7166\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_live_district\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"ff6ceac279ba4921917e024635361101\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_top_status\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"98d8a62a0dfa44b39e2d62ba99a8ba79\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_second_min_salary\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"7f661fa624554dc0a86e956dddbf8995\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_third_min_salary\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"465a91a342ca43b78fd438f808e21252\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_hukou_province\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"b9f0687195644086bcadecf4f2ffb5ca\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_gender\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"d2aca0be49d44e3db5e9cd1ba0d6535d\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_hukou_city\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"b8f9c52d1aac488cbb9118448a4978f7\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_first_city\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"ce4354113c3a402da4a0d58d8917cf8d\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_last_active_time\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"79493def2a914f88acebbc42dc68a1dd\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_live_province\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"991d677953434e2898afcd1f885d99a6\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_live_city\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"e4bb81bfb2a443f4aa7d76d6d4ec8706\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_first_province\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"22627d1208dd4349ad36f3b31db23d38\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_marriage_status\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"218e7995285349d3b01cdf2f8681e88c\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_first_new_industry\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"e39a324f6bc847dfbaee9527274dc74c\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_first_district\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"af359e978b094983a7914a21eb7fdc3a\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_second_city\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"fdc9e5fe37d149b3a52b15fa2d6a051c\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_second_district\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"bdd9c05ea91044f3b83b9e50aa8e74ec\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_second_job_type\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"f92135a8c9b04bc4ba8e6eb39071da35\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_birthday\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"4f3cd8a15297417c9baed6dd954c3116\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_second_province\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"95bd10f135c045ec90b1d4d7d39273b4\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_third_province\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"81769f35bda74dfe9621009275652e06\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_third_district\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"79e9f379addd48adb0f8887d6c01100b\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_third_job_type\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"4db949a816bf4cd484370f16097586eb\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_third_city\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"40ad633890fb476784075881c9395f25\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_desired_first_job_type\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"1065bd874c824805817ec2566b9984d8\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_major_type\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"87a3fff4b51f48eaad23a4cd0722dc51\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_major_small_type\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"8565ba8ea62d4bb1ba0ac6e89c512bb3\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"c_key\": \"USER_DEFINED_FEATURE\",\n" +
                "\t\t\t\"c_value\": \"cv_modify_last_time\",\n" +
                "\t\t\t\"c_is_effective\": \"1\",\n" +
                "\t\t\t\"c_comment\": \"cv conf\",\n" +
                "\t\t\t\"id\": \"c6935be574724ae7ad8c4796f40840ec\"\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}";


        JSONObject jsonObject = JSON.parseObject(jsonStr);
        JSONArray searchList = jsonObject.getJSONArray("searchList");
        String s = JSONObject.toJSONString(searchList);
        JSONArray objects = JSONObject.parseArray(s);
        System.out.println(objects);

    }
}
