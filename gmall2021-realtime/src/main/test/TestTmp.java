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
        String jsonStr="{\n" +
                "\t\"job\": {\n" +
                "\t\t\"airefresh\": 0,\n" +
                "\t\t\"applicationmethod\": 1,\n" +
                "\t\t\"benefit\": \"10000,10014,10017,10021,10002\",\n" +
                "\t\t\"benefitDisplay\": \"五险一金,带薪年假,定期体检,节日福利,绩效奖金\",\n" +
                "\t\t\"benefitName\": [\n" +
                "\t\t\t\"五险一金\",\n" +
                "\t\t\t\"带薪年假\",\n" +
                "\t\t\t\"定期体检\",\n" +
                "\t\t\t\"节日福利\",\n" +
                "\t\t\t\"绩效奖金\"\n" +
                "\t\t],\n" +
                "\t\t\"businessArea\": 0,\n" +
                "\t\t\"campus\": false,\n" +
                "\t\t\"channelTypes\": [\n" +
                "\t\t\t\"SEARCH\"\n" +
                "\t\t],\n" +
                "\t\t\"chatWindow\": 10,\n" +
                "\t\t\"city\": 530,\n" +
                "\t\t\"cityName\": \"北京\",\n" +
                "\t\t\"contactor\": \"1\",\n" +
                "\t\t\"cqId\": 0,\n" +
                "\t\t\"createTime\": 1547426756031,\n" +
                "\t\t\"departmentid\": 0,\n" +
                "\t\t\"downLineTime\": 0,\n" +
                "\t\t\"duration\": 0,\n" +
                "\t\t\"editid\": 475899414,\n" +
                "\t\t\"educationName\": \"大专\",\n" +
                "\t\t\"emaillist\": \"\",\n" +
                "\t\t\"endDate\": 1639324800000,\n" +
                "\t\t\"eventType\": \"BATCH_SYNC\",\n" +
                "\t\t\"filepage\": 0,\n" +
                "\t\t\"filterid\": 475899414,\n" +
                "\t\t\"follow\": false,\n" +
                "\t\t\"groupid\": 475899414,\n" +
                "\t\t\"highpin\": false,\n" +
                "\t\t\"hostid\": 0,\n" +
                "\t\t\"illegal\": false,\n" +
                "\t\t\"internalRecommend\": false,\n" +
                "\t\t\"intoreview\": 0,\n" +
                "\t\t\"isshowlicence\": 0,\n" +
                "\t\t\"jobAddress\": \"北京市通州区车站路48号东方宾馆写字楼C座五层\",\n" +
                "\t\t\"jobAture\": 2,\n" +
                "\t\t\"jobAtureName\": \"全职\",\n" +
                "\t\t\"jobDescription\": \"<div> 职位描述： <br></div><div> <p>协助项目经理，依据招标投标法和政府采购法等相关法律法规，圆满完成各类招标采购项目工作，包括但不限于以下工作：</p> <p>1、协助项目经理编写招标采购方案，编写招标公告和招标文件，发布各类公告，参与组织开标评标会议，接受投标报名，发出各类书面通知等；</p> <p>2、协助项目经理准备和提供工作中所需的各类资料、信息；</p> <p>3、协助项目经理与甲方、投标人、监管部门等项目相关方进行沟通；</p> <p>4、提报、协调公司内部流程事务；</p> <p>5、协助项目经理收集、整理项目资料、移交归档。</p> <p></p> <p></p> <p>任职资格：</p> <p>1、大学本科及以上学历，工程管理、项目管理、机械、建筑、采购管理、贸易、法律等相关专业，具有2年以上招标代理机构工作经验，英语四级以上；</p> <p>2、熟悉招标投标法、政府采购法及相关法律法规；</p> <p>3、勤奋好学，抗压能力强，对专业知识有较强的钻研精神；</p> <p>4、工作认真负责，善于沟通，有良好的组织性和纪律性；</p> <p>5、熟练使用Word、Excel、PPT等常用办公软件；</p> <p>6、能够接受公司安排的出差工作。</p></div>\",\n" +
                "\t\t\"jobSummary\": \"职位描述：协助项目经理，依据招标投标法和政府采购法等相关法律法规，圆满完成各类招标采购项目工作，包括但不限于以下工作：1、协助项目经理编写招标采购方案，编写招标公告和招标文件，发布各类公告，参与组织开标评标会议，接受投标报名，发出各类书面通知等；2、协助项目经理准备和提供工作中所需的各类资料、信息；3、协助项目经理与甲方、投标人、监管部门等项目相关方进行沟通；4、提报、协调公司内部流程事务；5、协...\",\n" +
                "\t\t\"jobTitle\": \"招标专员\",\n" +
                "\t\t\"jobType\": \"201300,2080\",\n" +
                "\t\t\"jobTypeName\": \"项目管理/项目协调,项目招投标\",\n" +
                "\t\t\"jobTypeSource\": 0,\n" +
                "\t\t\"jobid\": 105023815,\n" +
                "\t\t\"jobnumber\": \"CZ844990010J00105023815\",\n" +
                "\t\t\"jobpublish\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"downLineTime\": 0,\n" +
                "\t\t\t\t\"duration\": 30,\n" +
                "\t\t\t\t\"enddate\": 1639324800000,\n" +
                "\t\t\t\t\"jobtype\": 0,\n" +
                "\t\t\t\t\"modifeidstaffid\": 0,\n" +
                "\t\t\t\t\"module\": 0,\n" +
                "\t\t\t\t\"province\": 0,\n" +
                "\t\t\t\t\"refreshdate\": 1594002869652,\n" +
                "\t\t\t\t\"startdate\": 1636706458352,\n" +
                "\t\t\t\t\"state\": 0,\n" +
                "\t\t\t\t\"status\": 30,\n" +
                "\t\t\t\t\"subjobtype\": 0\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"jobstyle\": 0,\n" +
                "\t\t\"jobtime\": 30,\n" +
                "\t\t\"jobtimetop\": 0,\n" +
                "\t\t\"largeType\": 201300,\n" +
                "\t\t\"largeTypeName\": \"项目管理/项目协调\",\n" +
                "\t\t\"lastestsnapid\": 0,\n" +
                "\t\t\"latitude\": \"39.902777\",\n" +
                "\t\t\"location\": {\n" +
                "\t\t\t\"city\": 530,\n" +
                "\t\t\t\"cityName\": \"北京\",\n" +
                "\t\t\t\"province\": 489,\n" +
                "\t\t\t\"provinceName\": \"全国\"\n" +
                "\t\t},\n" +
                "\t\t\"locatoinDisplay\": \"北京\",\n" +
                "\t\t\"longitude\": \"116.662692\",\n" +
                "\t\t\"maxSalary\": 10000,\n" +
                "\t\t\"minEducation\": 5,\n" +
                "\t\t\"minSalary\": 6001,\n" +
                "\t\t\"minYear\": 305,\n" +
                "\t\t\"minYearName\": \"3-5年\",\n" +
                "\t\t\"modifeidstaffid\": 1087439910,\n" +
                "\t\t\"modifieddate\": 1637164966955,\n" +
                "\t\t\"module\": \"0\",\n" +
                "\t\t\"orderCustom\": 0,\n" +
                "\t\t\"orgGroup\": 0,\n" +
                "\t\t\"orgId\": 84499001,\n" +
                "\t\t\"packages\": 0,\n" +
                "\t\t\"platsource\": 0,\n" +
                "\t\t\"positionSourceType\": 1,\n" +
                "\t\t\"quantity\": 5,\n" +
                "\t\t\"refreshDate\": 1594002869652,\n" +
                "\t\t\"releaseCityId\": 530,\n" +
                "\t\t\"reviewType\": 0,\n" +
                "\t\t\"roomNumber\": \"\",\n" +
                "\t\t\"rootorgid\": 84499001,\n" +
                "\t\t\"rpoProxied\": false,\n" +
                "\t\t\"rpoProxy\": false,\n" +
                "\t\t\"salaryMonths\": 0,\n" +
                "\t\t\"salaryNegotiable\": false,\n" +
                "\t\t\"salaryStructure\": \"\",\n" +
                "\t\t\"salarywhite\": 0,\n" +
                "\t\t\"skillLabel\": \"300160433,300128019,270059700,270059757,300010963,300000975\",\n" +
                "\t\t\"skillLabelNames\": [\n" +
                "\t\t\t\"招标文件制作\",\n" +
                "\t\t\t\"招投标经验\",\n" +
                "\t\t\t\"office\",\n" +
                "\t\t\t\"商务知识\",\n" +
                "\t\t\t\"沟通力\",\n" +
                "\t\t\t\"抗压能力\"\n" +
                "\t\t],\n" +
                "\t\t\"skillTags\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"attributes\": {\n" +
                "\t\t\t\t\t\"registerValue\": \"招标文件制作\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t\"intKey\": 300160433,\n" +
                "\t\t\t\t\"standard\": false,\n" +
                "\t\t\t\t\"strKey\": \"300160433\",\n" +
                "\t\t\t\t\"tagValue\": \"招标文件制作\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"attributes\": {\n" +
                "\t\t\t\t\t\"registerValue\": \"招投标经验\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t\"intKey\": 300128019,\n" +
                "\t\t\t\t\"standard\": false,\n" +
                "\t\t\t\t\"strKey\": \"300128019\",\n" +
                "\t\t\t\t\"tagValue\": \"招投标经验\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"attributes\": {\n" +
                "\t\t\t\t\t\"shortPinyin\": \"office\",\n" +
                "\t\t\t\t\t\"registerValue\": \"OFFICE\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t\"intKey\": 270059700,\n" +
                "\t\t\t\t\"standard\": true,\n" +
                "\t\t\t\t\"strKey\": \"270059700\",\n" +
                "\t\t\t\t\"tagValue\": \"office\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"attributes\": {\n" +
                "\t\t\t\t\t\"shortPinyin\": \"swzs\",\n" +
                "\t\t\t\t\t\"registerValue\": \"商务知识\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t\"intKey\": 270059757,\n" +
                "\t\t\t\t\"standard\": true,\n" +
                "\t\t\t\t\"strKey\": \"270059757\",\n" +
                "\t\t\t\t\"tagValue\": \"商务知识\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"attributes\": {\n" +
                "\t\t\t\t\t\"registerValue\": \"沟通力\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t\"intKey\": 300010963,\n" +
                "\t\t\t\t\"standard\": false,\n" +
                "\t\t\t\t\"strKey\": \"300010963\",\n" +
                "\t\t\t\t\"tagValue\": \"沟通力\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"attributes\": {\n" +
                "\t\t\t\t\t\"registerValue\": \"抗压能力\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t\"intKey\": 300000975,\n" +
                "\t\t\t\t\"standard\": false,\n" +
                "\t\t\t\t\"strKey\": \"300000975\",\n" +
                "\t\t\t\t\"tagValue\": \"抗压能力\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"smallType\": 2080,\n" +
                "\t\t\"smallTypeName\": \"项目招投标\",\n" +
                "\t\t\"sourceid\": 2,\n" +
                "\t\t\"startDate\": 1636706458352,\n" +
                "\t\t\"state\": 30,\n" +
                "\t\t\"substatus\": 2,\n" +
                "\t\t\"superJobType\": {\n" +
                "\t\t\t\"firstLevel\": {\n" +
                "\t\t\t\t\"id\": 2000000000000,\n" +
                "\t\t\t\t\"level\": \"1\",\n" +
                "\t\t\t\t\"name\": \"物流/采购/供应链\",\n" +
                "\t\t\t\t\"sourceRoot\": false\n" +
                "\t\t\t},\n" +
                "\t\t\t\"jobTypeSource\": 2,\n" +
                "\t\t\t\"secondLevel\": {\n" +
                "\t\t\t\t\"id\": 2000100000000,\n" +
                "\t\t\t\t\"level\": \"2\",\n" +
                "\t\t\t\t\"name\": \"采购/供应链/材料管理\",\n" +
                "\t\t\t\t\"sourceRoot\": false\n" +
                "\t\t\t},\n" +
                "\t\t\t\"thirdLevel\": {\n" +
                "\t\t\t\t\"id\": 2000100110000,\n" +
                "\t\t\t\t\"level\": \"3\",\n" +
                "\t\t\t\t\"name\": \"项目招投标\",\n" +
                "\t\t\t\t\"sourceRoot\": false\n" +
                "\t\t\t}\n" +
                "\t\t},\n" +
                "\t\t\"totalcount\": 0,\n" +
                "\t\t\"traveloption\": 0,\n" +
                "\t\t\"url\": \"http://jobs.zhaopin.com/CZ844990010J00105023815.htm\",\n" +
                "\t\t\"userId\": 1087439910,\n" +
                "\t\t\"versionnum\": 0,\n" +
                "\t\t\"zoomLevel\": 3\n" +
                "\t},\n" +
                "\t\"jobExtend\": {\n" +
                "\t\t\"businessDetail\": {\n" +
                "\t\t\t\"jdPaidRefreshTime\": 1594002869652,\n" +
                "\t\t\t\"jobPaidFlag\": 0,\n" +
                "\t\t\t\"productTypes\": [],\n" +
                "\t\t\t\"rankingPackage\": [],\n" +
                "\t\t\t\"refreshLevel\": 0\n" +
                "\t\t},\n" +
                "\t\t\"campusJob\": false,\n" +
                "\t\t\"companyBest\": false,\n" +
                "\t\t\"companyScore\": 0.0,\n" +
                "\t\t\"descTermWeight\": {\n" +
                "\t\t\t\"招标\": 0.060325112,\n" +
                "\t\t\t\"法规\": 0.014482934,\n" +
                "\t\t\t\"办公\": 0.010981606,\n" +
                "\t\t\t\"政府采购法\": 0.024995118,\n" +
                "\t\t\t\"法律法规\": 0.019209836,\n" +
                "\t\t\t\"代理\": 0.010181738,\n" +
                "\t\t\t\"管理\": 0.014868462,\n" +
                "\t\t\t\"英语\": 0.009405037,\n" +
                "\t\t\t\"招标代理\": 0.03555398,\n" +
                "\t\t\t\"经验\": 0.007437795,\n" +
                "\t\t\t\"投标人\": 0.017391091,\n" +
                "\t\t\t\"招标投标\": 0.028899627,\n" +
                "\t\t\t\"建筑\": 0.010812491,\n" +
                "\t\t\t\"流程事务\": 0.016070884,\n" +
                "\t\t\t\"投标\": 0.033008248,\n" +
                "\t\t\t\"协调\": 0.01198107,\n" +
                "\t\t\t\"招标投标法\": 0.021654064,\n" +
                "\t\t\t\"安排\": 0.008741459,\n" +
                "\t\t\t\"方案\": 0.008141791,\n" +
                "\t\t\t\"办公软件\": 0.014009814,\n" +
                "\t\t\t\"信息\": 0.011598292,\n" +
                "\t\t\t\"书面通知\": 0.017121488,\n" +
                "\t\t\t\"采购管理\": 0.027256662,\n" +
                "\t\t\t\"能力\": 0.008041139,\n" +
                "\t\t\t\"书面\": 0.0153666735,\n" +
                "\t\t\t\"政府采购\": 0.03612116,\n" +
                "\t\t\t\"机械\": 0.009980636,\n" +
                "\t\t\t\"移交归档\": 0.016912585,\n" +
                "\t\t\t\"word\": 0.008455634,\n" +
                "\t\t\t\"工程管理\": 0.022283057,\n" +
                "\t\t\t\"文件\": 0.017864866,\n" +
                "\t\t\t\"资料\": 0.0093108015,\n" +
                "\t\t\t\"项目管理\": 0.020214664,\n" +
                "\t\t\t\"贸易\": 0.011540465,\n" +
                "\t\t\t\"编写\": 0.011757923,\n" +
                "\t\t\t\"开标评标\": 0.027416693,\n" +
                "\t\t\t\"工程\": 0.015482787,\n" +
                "\t\t\t\"评标\": 0.026709558,\n" +
                "\t\t\t\"采购\": 0.019043772,\n" +
                "\t\t\t\"沟通\": 0.011283754,\n" +
                "\t\t\t\"英语四级\": 0.009180877,\n" +
                "\t\t\t\"发布\": 0.010120068,\n" +
                "\t\t\t\"提报\": 0.014630962,\n" +
                "\t\t\t\"招标采购\": 0.05864718,\n" +
                "\t\t\t\"归档\": 0.014795365,\n" +
                "\t\t\t\"法律\": 0.016855326,\n" +
                "\t\t\t\"招标公告\": 0.04983632,\n" +
                "\t\t\t\"excel\": 0.00994306,\n" +
                "\t\t\t\"善于沟通\": 0.009079166,\n" +
                "\t\t\t\"ppt\": 0.010063271,\n" +
                "\t\t\t\"软件\": 0.010468776,\n" +
                "\t\t\t\"投标报名\": 0.021929506,\n" +
                "\t\t\t\"采购法\": 0.01720174,\n" +
                "\t\t\t\"投标法\": 0.013292261,\n" +
                "\t\t\t\"事务\": 0.01204129\n" +
                "\t\t},\n" +
                "\t\t\"duplicated\": 0,\n" +
                "\t\t\"duplicatedSource\": 0,\n" +
                "\t\t\"featurePayloadsTermCount\": {\n" +
                "\t\t\t\"companyNameTermCount\": 8,\n" +
                "\t\t\t\"contentTermCount\": 259,\n" +
                "\t\t\t\"jobTitleTermCount\": 2,\n" +
                "\t\t\t\"positionNameQueryTermCount\": 4\n" +
                "\t\t},\n" +
                "\t\t\"feedbackRation\": {\n" +
                "\t\t\t\"feedbackRate\": 0.9545,\n" +
                "\t\t\t\"feedbackTime\": 2461,\n" +
                "\t\t\t\"resumeLastViewTime\": 0\n" +
                "\t\t},\n" +
                "\t\t\"futureJob\": false,\n" +
                "\t\t\"intCompanyBest\": 0,\n" +
                "\t\t\"interview\": 0,\n" +
                "\t\t\"jobAlgorithmIndustryTermWeight\": {\n" +
                "\t\t\t\"contentWords\": [],\n" +
                "\t\t\t\"titleWords\": []\n" +
                "\t\t},\n" +
                "\t\t\"jobAlgorithmJobTypeTermWeight\": {\n" +
                "\t\t\t\"contentFeatures\": {\n" +
                "\t\t\t\t\"extraKwTerms3\": {},\n" +
                "\t\t\t\t\"extraKwTermsNorm4\": {},\n" +
                "\t\t\t\t\"mainKwTerms1\": {},\n" +
                "\t\t\t\t\"mainKwTermsNorm2\": {}\n" +
                "\t\t\t},\n" +
                "\t\t\t\"titleFeatures\": {\n" +
                "\t\t\t\t\"extraKwTerms3\": {},\n" +
                "\t\t\t\t\"extraKwTermsNorm4\": {},\n" +
                "\t\t\t\t\"mainKwTerms1\": {},\n" +
                "\t\t\t\t\"mainKwTermsNorm2\": {}\n" +
                "\t\t\t}\n" +
                "\t\t},\n" +
                "\t\t\"jobAlgorithmKeyWordV3\": {\n" +
                "\t\t\t\"keywords\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"weight\": 32.75,\n" +
                "\t\t\t\t\t\"word\": \"招标\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"weight\": 26.59,\n" +
                "\t\t\t\t\t\"word\": \"招标文件\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"weight\": 25.25,\n" +
                "\t\t\t\t\t\"word\": \"招标采购\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"weight\": 17.54,\n" +
                "\t\t\t\t\t\"word\": \"招标公告\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"weight\": 12.61,\n" +
                "\t\t\t\t\t\"word\": \"编写招标\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"weight\": 11.97,\n" +
                "\t\t\t\t\t\"word\": \"评标\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"weight\": 11.3,\n" +
                "\t\t\t\t\t\"word\": \"开标评标\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"weight\": 10.92,\n" +
                "\t\t\t\t\t\"word\": \"招标投标法\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"weight\": 10.66,\n" +
                "\t\t\t\t\t\"word\": \"投标\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"weight\": 8.98,\n" +
                "\t\t\t\t\t\"word\": \"招标代理\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t]\n" +
                "\t\t},\n" +
                "\t\t\"jobAlgorithmSkillV3\": {\n" +
                "\t\t\t\"skills\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"weight\": 0.10543,\n" +
                "\t\t\t\t\t\"word\": \"英语\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"weight\": 0.01176,\n" +
                "\t\t\t\t\t\"word\": \"office\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t]\n" +
                "\t\t},\n" +
                "\t\t\"jobAlgorithmTitleTermWeightV3\": {\n" +
                "\t\t\t\"titleTermWeights\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"weight\": 0.97963,\n" +
                "\t\t\t\t\t\"word\": \"招标\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"weight\": 0.02037,\n" +
                "\t\t\t\t\t\"word\": \"专员\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t]\n" +
                "\t\t},\n" +
                "\t\t\"jobBusinessRefresh\": {\n" +
                "\t\t\t\"items\": [],\n" +
                "\t\t\t\"jobNumber\": \"CZ844990010J00105023815\",\n" +
                "\t\t\t\"jobSuperExposure\": {\n" +
                "\t\t\t\t\"exposureDate\": 1637251200000,\n" +
                "\t\t\t\t\"jobNumber\": \"CZ844990010J00105023815\",\n" +
                "\t\t\t\t\"multiples\": 0\n" +
                "\t\t\t},\n" +
                "\t\t\t\"refreshSource\": 1\n" +
                "\t\t},\n" +
                "\t\t\"jobCertificate\": {\n" +
                "\t\t\t\"certificateNames\": [],\n" +
                "\t\t\t\"types\": []\n" +
                "\t\t},\n" +
                "\t\t\"jobCompeteInfo\": {\n" +
                "\t\t\t\"order\": 0\n" +
                "\t\t},\n" +
                "\t\t\"jobDesc\": \"职位描述： 协助项目经理，依据招标投标法和政府采购法等相关法律法规，圆满完成各类招标采购项目工作，包括但不限于以下工作： 1、协助项目经理编写招标采购方案，编写招标公告和招标文件，发布各类公告，参与组织开标评标会议，接受投标报名，发出各类书面通知等； 2、协助项目经理准备和提供工作中所需的各类资料、信息； 3、协助项目经理与甲方、投标人、监管部门等项目相关方进行沟通； 4、提报、协调公司内部流程事务； 5、协助项目经理收集、整理项目资料、移交归档。 任职资格： 1、大学本科及以上学历，工程管理、项目管理、机械、建筑、采购管理、贸易、法律等相关专业，具有2年以上招标代理机构工作经验，英语四级以上； 2、熟悉招标投标法、政府采购法及相关法律法规； 3、勤奋好学，抗压能力强，对专业知识有较强的钻研精神； 4、工作认真负责，善于沟通，有良好的组织性和纪律性； 5、熟练使用Word、Excel、PPT等常用办公软件； 6、能够接受公司安排的出差工作。\",\n" +
                "\t\t\"jobDescAgeLimit\": {\n" +
                "\t\t\t\"maxAge\": -1,\n" +
                "\t\t\t\"minAge\": -1\n" +
                "\t\t},\n" +
                "\t\t\"jobDescEducationLimit\": {\n" +
                "\t\t\t\"maxDegree\": \"\",\n" +
                "\t\t\t\"maxDegreeName\": \"\",\n" +
                "\t\t\t\"minDegree\": \"4\",\n" +
                "\t\t\t\"minDegreeName\": \"本科\"\n" +
                "\t\t},\n" +
                "\t\t\"jobDescIndustryInfo\": {\n" +
                "\t\t\t\"industryTypes\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"id\": \"800000000\",\n" +
                "\t\t\t\t\t\"level\": 1,\n" +
                "\t\t\t\t\t\"name\": \"专业服务\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"id\": \"800090000\",\n" +
                "\t\t\t\t\t\"level\": 2,\n" +
                "\t\t\t\t\t\"name\": \"商业代理服务\",\n" +
                "\t\t\t\t\t\"parentId\": \"800000000\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"keywords\": {\n" +
                "\t\t\t\t\"招投标管理\": 0.5,\n" +
                "\t\t\t\t\"专业服务\": 0.125,\n" +
                "\t\t\t\t\"招标代理\": 1.0,\n" +
                "\t\t\t\t\"商业代理服务\": 0.25\n" +
                "\t\t\t}\n" +
                "\t\t},\n" +
                "\t\t\"jobFilter\": {\n" +
                "\t\t\t\"haveFilter\": false\n" +
                "\t\t},\n" +
                "\t\t\"jobIdentityInfo\": {\n" +
                "\t\t\t\"graduationEndYear\": -1,\n" +
                "\t\t\t\"graduationStartYear\": -1\n" +
                "\t\t},\n" +
                "\t\t\"jobKnowledgeFeatures\": [],\n" +
                "\t\t\"jobLanguage\": [],\n" +
                "\t\t\"jobLevel3JdRatio\": 0.00113873,\n" +
                "\t\t\"jobListPageOpAdList\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"adHyperLinkContent\": {\n" +
                "\t\t\t\t\t\"hyperLinkName\": \"入选《项目招投标·最新发布职位榜》\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t\"adType\": 2,\n" +
                "\t\t\t\t\"adWeightType\": \"1\",\n" +
                "\t\t\t\t\"deliveryBeginTime\": 1634814264000,\n" +
                "\t\t\t\t\"reportData\": \"{\\\"listid\\\":642611,\\\"listcity\\\":\\\"北京\\\",\\\"jdname\\\":\\\"招标专员\\\",\\\"workexp\\\":\\\"3-5年\\\",\\\"jd3rdlevel\\\":\\\"项目招投标\\\",\\\"bizid\\\":300173,\\\"worktype\\\":\\\"全职\\\",\\\"jdno\\\":\\\"CZ844990010J00105023815\\\"}\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"jobNatureOfAlgorithm\": 30,\n" +
                "\t\t\"jobPaidApplyFlag\": -1,\n" +
                "\t\t\"jobParticipleFeature\": {\n" +
                "\t\t\t\"titleIsNominalization\": false\n" +
                "\t\t},\n" +
                "\t\t\"jobSearchTermStatistics\": {\n" +
                "\t\t\t\"queryApplyTerms\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"投标专员\": 1\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"queryViewTerms\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"招标\": 6\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"北京德聚招标有限公司\": 4\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"招标代理\": 3\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"招标专员\": 2\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"招标代理专员\": 2\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"投标专员\": 1\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"政府采购招标代理\": 1\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"招标代理项目经理\": 1\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"北京德聚\": 1\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"建筑公司采购\": 1\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"recomeApplyTerms\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"行政专员\": 1\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"客服专员\": 1\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"试验室主任\": 1\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"市场部专员\": 1\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"文员\": 1\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"销售助理\": 1\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"人事助理\": 1\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"招投标专员\": 1\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"物业管理员\": 1\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"支付宝二维码的推广\": 1\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"recomeViewTerms\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"投标专员\": 4\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"招投标专员\": 3\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"预算员\": 3\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"销售助理\": 2\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"项目协调\": 2\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"综合文员\": 2\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"商务专员\": 2\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"标书制作\": 2\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"招标员\": 2\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"项目助理\": 2\n" +
                "\t\t\t\t}\n" +
                "\t\t\t]\n" +
                "\t\t},\n" +
                "\t\t\"jobSkillKeyWord\": {\n" +
                "\t\t\t\"jobKeyWords\": \"招标 招标 招标投标法 采购 政府采购 采购法 政府采购法 法律 招标 采购 招标采购 采购项目 编写 编写招标 招标 采购 招标采购 编写 编写招标 招标 招标公告 招标 招标文件 评标 开标评标 投标 投标报名 书面通知 资料 甲方 投标人 监管 提报 流程事务 收集 项目资料 资料 移交归档 归档 工程管理 项目管理 机械 采购 采购管理 贸易 法律 招标 招标代理 代理机构 机构工作 英语 英语四级 招标 招标投标法 采购 政府采购 采购法 政府采购法 法律\",\n" +
                "\t\t\t\"jobSkillWords\": \"招标 招标 招标投标法 采购 政府采购 采购法 政府采购法 法律 招标 采购 招标采购 采购项目 编写 编写招标 招标 采购 招标采购 编写 编写招标 招标 招标公告 招标 招标文件 评标 开标评标 投标 投标报名 书面通知 资料 甲方 投标人 监管 提报 流程事务 收集 项目资料 资料 移交归档 归档 工程管理 项目管理 机械 采购 采购管理 贸易 法律 招标 招标代理 代理机构 机构工作 英语 英语四级 招标 招标投标法 采购 政府采购 采购法 政府采购法 法律\",\n" +
                "\t\t\t\"jobTitleKeyWords\": \"招标\",\n" +
                "\t\t\t\"jobTitleNormalize\": [\n" +
                "\t\t\t\t\"招标专员\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"jobTitleSkillWords\": \"招标\"\n" +
                "\t\t},\n" +
                "\t\t\"jobSoftSkill\": {\n" +
                "\t\t\t\"softSkill\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"key\": \"善于沟通\",\n" +
                "\t\t\t\t\t\"score\": 1.0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"key\": \"纪律性\",\n" +
                "\t\t\t\t\t\"score\": 1.0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"key\": \"项目管理\",\n" +
                "\t\t\t\t\t\"score\": 1.0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"key\": \"能力强\",\n" +
                "\t\t\t\t\t\"score\": 1.0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"key\": \"工作认真负责\",\n" +
                "\t\t\t\t\t\"score\": 1.0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"key\": \"专业知识\",\n" +
                "\t\t\t\t\t\"score\": 1.0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"key\": \"钻研精神\",\n" +
                "\t\t\t\t\t\"score\": 1.0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"key\": \"勤奋好学\",\n" +
                "\t\t\t\t\t\"score\": 1.0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"key\": \"组织性\",\n" +
                "\t\t\t\t\t\"score\": 1.0\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"softSkillClassify\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"key\": \"沟通协作能力\",\n" +
                "\t\t\t\t\t\"score\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"key\": \"业务能力\",\n" +
                "\t\t\t\t\t\"score\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"key\": \"爱岗敬业\",\n" +
                "\t\t\t\t\t\"score\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"key\": \"认真踏实\",\n" +
                "\t\t\t\t\t\"score\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"key\": \"服从力\",\n" +
                "\t\t\t\t\t\"score\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"key\": \"组织管理\",\n" +
                "\t\t\t\t\t\"score\": 0.5\n" +
                "\t\t\t\t}\n" +
                "\t\t\t]\n" +
                "\t\t},\n" +
                "\t\t\"jobSoftware\": {\n" +
                "\t\t\t\"softClassify\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"key\": \"办公软件\",\n" +
                "\t\t\t\t\t\"score\": 0.25\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"key\": \"常用办公软件\",\n" +
                "\t\t\t\t\t\"score\": 0.125\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"softwareInfo\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"key\": \"excel\",\n" +
                "\t\t\t\t\t\"score\": 1.0\n" +
                "\t\t\t\t}\n" +
                "\t\t\t]\n" +
                "\t\t},\n" +
                "\t\t\"jobTag\": {\n" +
                "\t\t\t\"searchTag\": \"招标文件制作,招投标经验,office,商务知识,沟通力,抗压能力,五险一金,带薪年假,定期体检,节日福利,绩效奖金\",\n" +
                "\t\t\t\"showTag\": {\n" +
                "\t\t\t\t\"chatWindow\": 10,\n" +
                "\t\t\t\t\"jobLight\": [\n" +
                "\t\t\t\t\t\"五险一金\",\n" +
                "\t\t\t\t\t\"带薪年假\",\n" +
                "\t\t\t\t\t\"定期体检\",\n" +
                "\t\t\t\t\t\"节日福利\",\n" +
                "\t\t\t\t\t\"绩效奖金\"\n" +
                "\t\t\t\t],\n" +
                "\t\t\t\t\"refreshLevel\": 0,\n" +
                "\t\t\t\t\"skill\": [\n" +
                "\t\t\t\t\t\"招标文件制作\",\n" +
                "\t\t\t\t\t\"招投标经验\",\n" +
                "\t\t\t\t\t\"office\",\n" +
                "\t\t\t\t\t\"商务知识\",\n" +
                "\t\t\t\t\t\"沟通力\",\n" +
                "\t\t\t\t\t\"抗压能力\"\n" +
                "\t\t\t\t]\n" +
                "\t\t\t}\n" +
                "\t\t},\n" +
                "\t\t\"jobTagCollection\": {\n" +
                "\t\t\t\"extractNormalizedTag\": [\n" +
                "\t\t\t\t\"excel\",\n" +
                "\t\t\t\t\"工程管理\",\n" +
                "\t\t\t\t\"大学英语四级\",\n" +
                "\t\t\t\t\"powerpoint/ppt\",\n" +
                "\t\t\t\t\"office\",\n" +
                "\t\t\t\t\"word\",\n" +
                "\t\t\t\t\"标书制作\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"extractSkillTag\": [\n" +
                "\t\t\t\t\"excel\",\n" +
                "\t\t\t\t\"工程管理\",\n" +
                "\t\t\t\t\"大学英语四级\",\n" +
                "\t\t\t\t\"powerpoint/ppt\",\n" +
                "\t\t\t\t\"office\",\n" +
                "\t\t\t\t\"word\",\n" +
                "\t\t\t\t\"标书制作\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"simHashCode\": {\n" +
                "\t\t\t\t\"descSimHashCode\": \"1011101000110010010000110110000000100010011000001111110111100000\",\n" +
                "\t\t\t\t\"titleSimHashCode\": \"0001110000000010000000100010000010001011100000000100000100000001\"\n" +
                "\t\t\t},\n" +
                "\t\t\t\"subways\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"distance\": 1474,\n" +
                "\t\t\t\t\t\"latitude\": 39.910031,\n" +
                "\t\t\t\t\t\"lineID\": 100118,\n" +
                "\t\t\t\t\t\"lineName\": \"6号线\",\n" +
                "\t\t\t\t\t\"longitude\": 116.677139,\n" +
                "\t\t\t\t\t\"stationID\": 100124,\n" +
                "\t\t\t\t\t\"stationName\": \"通运门\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"distance\": 1459,\n" +
                "\t\t\t\t\t\"latitude\": 39.890278,\n" +
                "\t\t\t\t\t\"lineID\": 100323,\n" +
                "\t\t\t\t\t\"lineName\": \"八通线\",\n" +
                "\t\t\t\t\t\"longitude\": 116.657533,\n" +
                "\t\t\t\t\t\"stationID\": 100333,\n" +
                "\t\t\t\t\t\"stationName\": \"九棵树\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t]\n" +
                "\t\t},\n" +
                "\t\t\"jobTitleChunkText\": {\n" +
                "\t\t\t\"bra\": [],\n" +
                "\t\t\t\"cla\": [\n" +
                "\t\t\t\t\"专员\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"dir\": {},\n" +
                "\t\t\t\"fun\": {\n" +
                "\t\t\t\t\"招标\": 0.45314\n" +
                "\t\t\t},\n" +
                "\t\t\t\"ind\": {},\n" +
                "\t\t\t\"lev\": [],\n" +
                "\t\t\t\"org\": {},\n" +
                "\t\t\t\"pro\": []\n" +
                "\t\t},\n" +
                "\t\t\"jobTitleDuty\": {\n" +
                "\t\t\t\"jobTitleDuty\": [\n" +
                "\t\t\t\t\"专员\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"jobTitleLevel\": []\n" +
                "\t\t},\n" +
                "\t\t\"jobTitleIndustryInfo\": {\n" +
                "\t\t\t\"industryTypes\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"id\": \"800000000\",\n" +
                "\t\t\t\t\t\"level\": 1,\n" +
                "\t\t\t\t\t\"name\": \"专业服务\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"id\": \"800090000\",\n" +
                "\t\t\t\t\t\"level\": 2,\n" +
                "\t\t\t\t\t\"name\": \"商业代理服务\",\n" +
                "\t\t\t\t\t\"parentId\": \"800000000\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"keywords\": {\n" +
                "\t\t\t\t\"招投标管理\": 0.5,\n" +
                "\t\t\t\t\"专业服务\": 0.125,\n" +
                "\t\t\t\t\"招标行业\": 1.0,\n" +
                "\t\t\t\t\"商业代理服务\": 0.25\n" +
                "\t\t\t}\n" +
                "\t\t},\n" +
                "\t\t\"jobTypeAlgorithm\": {\n" +
                "\t\t\t\"jobtype\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"score\": 0.036146436,\n" +
                "\t\t\t\t\t\"type1Id\": \"2000000000000\",\n" +
                "\t\t\t\t\t\"type1Name\": \"物流/采购/供应链\",\n" +
                "\t\t\t\t\t\"type2Id\": \"2000100000000\",\n" +
                "\t\t\t\t\t\"type2Name\": \"采购/供应链/材料管理\",\n" +
                "\t\t\t\t\t\"type3Id\": \"2000100110000\",\n" +
                "\t\t\t\t\t\"type3Name\": \"项目招投标\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"score\": 0.00987656,\n" +
                "\t\t\t\t\t\"type1Id\": \"2000000000000\",\n" +
                "\t\t\t\t\t\"type1Name\": \"物流/采购/供应链\",\n" +
                "\t\t\t\t\t\"type2Id\": \"2000100000000\",\n" +
                "\t\t\t\t\t\"type2Name\": \"采购/供应链/材料管理\",\n" +
                "\t\t\t\t\t\"type3Id\": \"2000100030000\",\n" +
                "\t\t\t\t\t\"type3Name\": \"工程招投标\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"score\": 0.0020035051,\n" +
                "\t\t\t\t\t\"type1Id\": \"7000000000000\",\n" +
                "\t\t\t\t\t\"type1Name\": \"房地产/工程/建筑\",\n" +
                "\t\t\t\t\t\"type2Id\": \"7000200000000\",\n" +
                "\t\t\t\t\t\"type2Name\": \"工程管理\",\n" +
                "\t\t\t\t\t\"type3Id\": \"7000200170000\",\n" +
                "\t\t\t\t\t\"type3Name\": \"工程造价\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"score\": 0.0019521983,\n" +
                "\t\t\t\t\t\"type1Id\": \"3000000000000\",\n" +
                "\t\t\t\t\t\"type1Name\": \"产品/项目/高级管理\",\n" +
                "\t\t\t\t\t\"type2Id\": \"3000300000000\",\n" +
                "\t\t\t\t\t\"type2Name\": \"项目管理\",\n" +
                "\t\t\t\t\t\"type3Id\": \"3000300160000\",\n" +
                "\t\t\t\t\t\"type3Name\": \"项目专员\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"thirdJobTypeAlgorithm\": \"2000100110000^0.036146436 2000100030000^0.00987656 7000200170000^0.0020035051 3000300160000^0.0019521983\"\n" +
                "\t\t},\n" +
                "\t\t\"jobTypeAndBusinessWords\": {\n" +
                "\t\t\t\"experienceRequisites\": [],\n" +
                "\t\t\t\"jobTypeScoreCards\": []\n" +
                "\t\t},\n" +
                "\t\t\"jobTypeClassfications\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"level1Code\": \"2000000000000\",\n" +
                "\t\t\t\t\"level1Name\": \"物流/采购/供应链\",\n" +
                "\t\t\t\t\"level2Code\": \"2000100000000\",\n" +
                "\t\t\t\t\"level2Name\": \"采购/供应链/材料管理\",\n" +
                "\t\t\t\t\"level3Code\": \"2000100110000\",\n" +
                "\t\t\t\t\"level3Name\": \"项目招投标\",\n" +
                "\t\t\t\t\"score\": 0.343283\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"level1Code\": \"2000000000000\",\n" +
                "\t\t\t\t\"level1Name\": \"物流/采购/供应链\",\n" +
                "\t\t\t\t\"level2Code\": \"2000100000000\",\n" +
                "\t\t\t\t\"level2Name\": \"采购/供应链/材料管理\",\n" +
                "\t\t\t\t\"level3Code\": \"2000100030000\",\n" +
                "\t\t\t\t\"level3Name\": \"工程招投标\",\n" +
                "\t\t\t\t\"score\": 0.176152\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"level1Code\": \"3000000000000\",\n" +
                "\t\t\t\t\"level1Name\": \"产品/项目/高级管理\",\n" +
                "\t\t\t\t\"level2Code\": \"3000300000000\",\n" +
                "\t\t\t\t\"level2Name\": \"项目管理\",\n" +
                "\t\t\t\t\"level3Code\": \"3000300160000\",\n" +
                "\t\t\t\t\"level3Name\": \"项目专员\",\n" +
                "\t\t\t\t\"score\": 0.037941\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"level1Code\": \"7000000000000\",\n" +
                "\t\t\t\t\"level1Name\": \"房地产/工程/建筑\",\n" +
                "\t\t\t\t\"level2Code\": \"7000200000000\",\n" +
                "\t\t\t\t\"level2Name\": \"工程管理\",\n" +
                "\t\t\t\t\"level3Code\": \"7000200120000\",\n" +
                "\t\t\t\t\"level3Name\": \"工程资料管理\",\n" +
                "\t\t\t\t\"score\": 0.035462\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"jobTypeSkillTag\": 1,\n" +
                "\t\t\"jobTypeTop10Classfications\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"level1Code\": \"2000000000000\",\n" +
                "\t\t\t\t\"level1Name\": \"物流/采购/供应链\",\n" +
                "\t\t\t\t\"level2Code\": \"2000100000000\",\n" +
                "\t\t\t\t\"level2Name\": \"采购/供应链/材料管理\",\n" +
                "\t\t\t\t\"level3Code\": \"2000100110000\",\n" +
                "\t\t\t\t\"level3Name\": \"项目招投标\",\n" +
                "\t\t\t\t\"score\": 0.343283\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"level1Code\": \"2000000000000\",\n" +
                "\t\t\t\t\"level1Name\": \"物流/采购/供应链\",\n" +
                "\t\t\t\t\"level2Code\": \"2000100000000\",\n" +
                "\t\t\t\t\"level2Name\": \"采购/供应链/材料管理\",\n" +
                "\t\t\t\t\"level3Code\": \"2000100030000\",\n" +
                "\t\t\t\t\"level3Name\": \"工程招投标\",\n" +
                "\t\t\t\t\"score\": 0.176152\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"level1Code\": \"3000000000000\",\n" +
                "\t\t\t\t\"level1Name\": \"产品/项目/高级管理\",\n" +
                "\t\t\t\t\"level2Code\": \"3000300000000\",\n" +
                "\t\t\t\t\"level2Name\": \"项目管理\",\n" +
                "\t\t\t\t\"level3Code\": \"3000300160000\",\n" +
                "\t\t\t\t\"level3Name\": \"项目专员\",\n" +
                "\t\t\t\t\"score\": 0.037941\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"level1Code\": \"7000000000000\",\n" +
                "\t\t\t\t\"level1Name\": \"房地产/工程/建筑\",\n" +
                "\t\t\t\t\"level2Code\": \"7000200000000\",\n" +
                "\t\t\t\t\"level2Name\": \"工程管理\",\n" +
                "\t\t\t\t\"level3Code\": \"7000200120000\",\n" +
                "\t\t\t\t\"level3Name\": \"工程资料管理\",\n" +
                "\t\t\t\t\"score\": 0.035462\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"level1Code\": \"3000000000000\",\n" +
                "\t\t\t\t\"level1Name\": \"产品/项目/高级管理\",\n" +
                "\t\t\t\t\"level2Code\": \"3000300000000\",\n" +
                "\t\t\t\t\"level2Name\": \"项目管理\",\n" +
                "\t\t\t\t\"level3Code\": \"3000300150000\",\n" +
                "\t\t\t\t\"level3Name\": \"项目助理\",\n" +
                "\t\t\t\t\"score\": 0.023346\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"level1Code\": \"3000000000000\",\n" +
                "\t\t\t\t\"level1Name\": \"产品/项目/高级管理\",\n" +
                "\t\t\t\t\"level2Code\": \"3000300000000\",\n" +
                "\t\t\t\t\"level2Name\": \"项目管理\",\n" +
                "\t\t\t\t\"level3Code\": \"3000300110000\",\n" +
                "\t\t\t\t\"level3Name\": \"项目管理\",\n" +
                "\t\t\t\t\"score\": 0.020873\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"level1Code\": \"7000000000000\",\n" +
                "\t\t\t\t\"level1Name\": \"房地产/工程/建筑\",\n" +
                "\t\t\t\t\"level2Code\": \"7000200000000\",\n" +
                "\t\t\t\t\"level2Name\": \"工程管理\",\n" +
                "\t\t\t\t\"level3Code\": \"7000200170000\",\n" +
                "\t\t\t\t\"level3Name\": \"工程造价\",\n" +
                "\t\t\t\t\"score\": 0.019882\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"level1Code\": \"14000000000000\",\n" +
                "\t\t\t\t\"level1Name\": \"人事/行政/财务/法务\",\n" +
                "\t\t\t\t\"level2Code\": \"14000400000000\",\n" +
                "\t\t\t\t\"level2Name\": \"行政\",\n" +
                "\t\t\t\t\"level3Code\": \"14000400030000\",\n" +
                "\t\t\t\t\"level3Name\": \"行政专员\",\n" +
                "\t\t\t\t\"score\": 0.01875\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"level1Code\": \"2000000000000\",\n" +
                "\t\t\t\t\"level1Name\": \"物流/采购/供应链\",\n" +
                "\t\t\t\t\"level2Code\": \"2000100000000\",\n" +
                "\t\t\t\t\"level2Name\": \"采购/供应链/材料管理\",\n" +
                "\t\t\t\t\"level3Code\": \"2000100010000\",\n" +
                "\t\t\t\t\"level3Name\": \"采购专员/助理\",\n" +
                "\t\t\t\t\"score\": 0.018032\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"level1Code\": \"3000000000000\",\n" +
                "\t\t\t\t\"level1Name\": \"产品/项目/高级管理\",\n" +
                "\t\t\t\t\"level2Code\": \"3000300000000\",\n" +
                "\t\t\t\t\"level2Name\": \"项目管理\",\n" +
                "\t\t\t\t\"level3Code\": \"3000300210000\",\n" +
                "\t\t\t\t\"level3Name\": \"咨询项目管理\",\n" +
                "\t\t\t\t\"score\": 0.01629\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"jobTypeTop2Classfications\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"level1Code\": \"2000000000000\",\n" +
                "\t\t\t\t\"level1Name\": \"物流/采购/供应链\",\n" +
                "\t\t\t\t\"level2Code\": \"2000100000000\",\n" +
                "\t\t\t\t\"level2Name\": \"采购/供应链/材料管理\",\n" +
                "\t\t\t\t\"level3Code\": \"2000100110000\",\n" +
                "\t\t\t\t\"level3Name\": \"项目招投标\",\n" +
                "\t\t\t\t\"score\": 0.343283\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"level1Code\": \"2000000000000\",\n" +
                "\t\t\t\t\"level1Name\": \"物流/采购/供应链\",\n" +
                "\t\t\t\t\"level2Code\": \"2000100000000\",\n" +
                "\t\t\t\t\"level2Name\": \"采购/供应链/材料管理\",\n" +
                "\t\t\t\t\"level3Code\": \"2000100030000\",\n" +
                "\t\t\t\t\"level3Name\": \"工程招投标\",\n" +
                "\t\t\t\t\"score\": 0.176152\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"jobWorkYear\": {\n" +
                "\t\t\t\"jobWorkYearMax\": -1,\n" +
                "\t\t\t\"jobWorkYearMin\": 2\n" +
                "\t\t},\n" +
                "\t\t\"latitude\": \"39.902777\",\n" +
                "\t\t\"longitude\": \"116.662692\",\n" +
                "\t\t\"major\": {\n" +
                "\t\t\t\"majorFirst\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"建设工程管理类\",\n" +
                "\t\t\t\t\t\"weight\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"经济贸易类\",\n" +
                "\t\t\t\t\t\"weight\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"水利工程与管理类\",\n" +
                "\t\t\t\t\t\"weight\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"土木类\",\n" +
                "\t\t\t\t\t\"weight\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"自动化类\",\n" +
                "\t\t\t\t\t\"weight\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"法学类\",\n" +
                "\t\t\t\t\t\"weight\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"建筑设计类\",\n" +
                "\t\t\t\t\t\"weight\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"建筑设备类\",\n" +
                "\t\t\t\t\t\"weight\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"经济与贸易类\",\n" +
                "\t\t\t\t\t\"weight\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"工商管理类\",\n" +
                "\t\t\t\t\t\"weight\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"城乡规划与管理类\",\n" +
                "\t\t\t\t\t\"weight\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"法律执行类\",\n" +
                "\t\t\t\t\t\"weight\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"工业工程类\",\n" +
                "\t\t\t\t\t\"weight\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"机械类\",\n" +
                "\t\t\t\t\t\"weight\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"机械设计制造类\",\n" +
                "\t\t\t\t\t\"weight\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"法律实务类\",\n" +
                "\t\t\t\t\t\"weight\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"管理科学与工程类\",\n" +
                "\t\t\t\t\t\"weight\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"建筑类\",\n" +
                "\t\t\t\t\t\"weight\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"建筑材料类\",\n" +
                "\t\t\t\t\t\"weight\": 0.5\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"土建施工类\",\n" +
                "\t\t\t\t\t\"weight\": 0.5\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"majorSecond\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"工程管理\",\n" +
                "\t\t\t\t\t\"weight\": 1.0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"项目管理\",\n" +
                "\t\t\t\t\t\"weight\": 1.0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"机械\",\n" +
                "\t\t\t\t\t\"weight\": 1.0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"贸易\",\n" +
                "\t\t\t\t\t\"weight\": 1.0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"法律\",\n" +
                "\t\t\t\t\t\"weight\": 1.0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"建筑\",\n" +
                "\t\t\t\t\t\"weight\": 1.0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"采购管理\",\n" +
                "\t\t\t\t\t\"weight\": 1.0\n" +
                "\t\t\t\t}\n" +
                "\t\t\t]\n" +
                "\t\t},\n" +
                "\t\t\"maxSalary\": 10000,\n" +
                "\t\t\"minSalary\": 6001,\n" +
                "\t\t\"orgEvaluate\": {\n" +
                "\t\t\t\"interviewExpNum\": 0,\n" +
                "\t\t\t\"questionNum\": 0,\n" +
                "\t\t\t\"reviewNum\": 0,\n" +
                "\t\t\t\"reviewTotalScore\": 0,\n" +
                "\t\t\t\"salaryNum\": 0\n" +
                "\t\t},\n" +
                "\t\t\"orgFeedbackRation\": {\n" +
                "\t\t\t\"accountNumber\": \"0\",\n" +
                "\t\t\t\"cityId\": 530,\n" +
                "\t\t\t\"feedbackRate\": 0.9761,\n" +
                "\t\t\t\"feedbackScore\": 0.6983,\n" +
                "\t\t\t\"feedbackTime\": 5838,\n" +
                "\t\t\t\"feedbackTimeSecond\": 350304,\n" +
                "\t\t\t\"orgId\": 84499001,\n" +
                "\t\t\t\"rankNumber\": 0.0\n" +
                "\t\t},\n" +
                "\t\t\"orgNameInfo\": {\n" +
                "\t\t\t\"displayName\": \"北京德聚招标有限公司\",\n" +
                "\t\t\t\"licenceName\": \"北京德聚招标有限公司\",\n" +
                "\t\t\t\"orgName\": \"北京德聚招标有限公司\",\n" +
                "\t\t\t\"rootOrgId\": 84499001,\n" +
                "\t\t\t\"score\": 10.7955\n" +
                "\t\t},\n" +
                "\t\t\"orgWideFeature\": {},\n" +
                "\t\t\"overtimeTravel\": [\n" +
                "\t\t\t\"抗压吃苦\"\n" +
                "\t\t],\n" +
                "\t\t\"positionLabel\": \"{\\\"chatWindow\\\":10,\\\"jobLight\\\":[\\\"五险一金\\\",\\\"带薪年假\\\",\\\"定期体检\\\",\\\"节日福利\\\",\\\"绩效奖金\\\"],\\\"refreshLevel\\\":0,\\\"skill\\\":[\\\"招标文件制作\\\",\\\"招投标经验\\\",\\\"office\\\",\\\"商务知识\\\",\\\"沟通力\\\",\\\"抗压能力\\\"]}\",\n" +
                "\t\t\"rankingWord\": \"\",\n" +
                "\t\t\"recentAndTotal\": {\n" +
                "\t\t\t\"applyRecent\": 0,\n" +
                "\t\t\t\"applyTotal\": 4,\n" +
                "\t\t\t\"clickRecent\": 0,\n" +
                "\t\t\t\"clickTotal\": 182,\n" +
                "\t\t\t\"exposureRecent\": 0,\n" +
                "\t\t\t\"exposureTotal\": 241\n" +
                "\t\t},\n" +
                "\t\t\"rewriteResults\": {\n" +
                "\t\t\t\"results\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"normResult\": \"招标专员\",\n" +
                "\t\t\t\t\t\"rewriteVersion\": \"v0\",\n" +
                "\t\t\t\t\t\"score\": 3.9110186240362925,\n" +
                "\t\t\t\t\t\"termWeight\": {\n" +
                "\t\t\t\t\t\t\"招标\": 0.9868487,\n" +
                "\t\t\t\t\t\t\"专员\": 0.01315231\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"normResult\": \"招标专员\",\n" +
                "\t\t\t\t\t\"rewriteResult\": \"招标员\",\n" +
                "\t\t\t\t\t\"rewriteVersion\": \"v1\",\n" +
                "\t\t\t\t\t\"score\": 0.38499999046325686,\n" +
                "\t\t\t\t\t\"synonymItem\": {\n" +
                "\t\t\t\t\t\t\"sub\": \"专员\",\n" +
                "\t\t\t\t\t\t\"org\": \"员\",\n" +
                "\t\t\t\t\t\t\"ctx\": \"招标\"\n" +
                "\t\t\t\t\t},\n" +
                "\t\t\t\t\t\"termWeight\": {\n" +
                "\t\t\t\t\t\t\"招标\": 0.9543319,\n" +
                "\t\t\t\t\t\t\"员\": 0.04566794\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"normResult\": \"招标专员\",\n" +
                "\t\t\t\t\t\"rewriteResult\": \"招投标专员\",\n" +
                "\t\t\t\t\t\"rewriteVersion\": \"v2\",\n" +
                "\t\t\t\t\t\"score\": 0.5322,\n" +
                "\t\t\t\t\t\"synonymItem\": {\n" +
                "\t\t\t\t\t\t\"synonym\": \"招标专员\",\n" +
                "\t\t\t\t\t\t\"target\": \"招投标专员\"\n" +
                "\t\t\t\t\t},\n" +
                "\t\t\t\t\t\"termWeight\": {\n" +
                "\t\t\t\t\t\t\"招投标\": 0.9928089,\n" +
                "\t\t\t\t\t\t\"专员\": 0.007192543\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"normResult\": \"招标专员\",\n" +
                "\t\t\t\t\t\"rewriteResult\": \"招投标专员\",\n" +
                "\t\t\t\t\t\"rewriteVersion\": \"v1\",\n" +
                "\t\t\t\t\t\"score\": 0.3610000014305115,\n" +
                "\t\t\t\t\t\"synonymItem\": {\n" +
                "\t\t\t\t\t\t\"sub\": \"招标\",\n" +
                "\t\t\t\t\t\t\"org\": \"招投标\",\n" +
                "\t\t\t\t\t\t\"ctx\": \"专员\"\n" +
                "\t\t\t\t\t},\n" +
                "\t\t\t\t\t\"termWeight\": {\n" +
                "\t\t\t\t\t\t\"招投标\": 0.9928089,\n" +
                "\t\t\t\t\t\t\"专员\": 0.007192543\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"normResult\": \"招标专员\",\n" +
                "\t\t\t\t\t\"rewriteResult\": \"投标专员\",\n" +
                "\t\t\t\t\t\"rewriteVersion\": \"v2\",\n" +
                "\t\t\t\t\t\"score\": 0.5112,\n" +
                "\t\t\t\t\t\"synonymItem\": {\n" +
                "\t\t\t\t\t\t\"synonym\": \"招标专员\",\n" +
                "\t\t\t\t\t\t\"target\": \"投标专员\"\n" +
                "\t\t\t\t\t},\n" +
                "\t\t\t\t\t\"termWeight\": {\n" +
                "\t\t\t\t\t\t\"专员\": 0.009201269,\n" +
                "\t\t\t\t\t\t\"投标\": 0.9908003\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"normResult\": \"招标专员\",\n" +
                "\t\t\t\t\t\"rewriteResult\": \"招标项目负责人\",\n" +
                "\t\t\t\t\t\"rewriteVersion\": \"v1\",\n" +
                "\t\t\t\t\t\"score\": 0.35600000619888308,\n" +
                "\t\t\t\t\t\"synonymItem\": {\n" +
                "\t\t\t\t\t\t\"sub\": \"专员\",\n" +
                "\t\t\t\t\t\t\"org\": \"项目负责人\",\n" +
                "\t\t\t\t\t\t\"ctx\": \"招标\"\n" +
                "\t\t\t\t\t},\n" +
                "\t\t\t\t\t\"termWeight\": {\n" +
                "\t\t\t\t\t\t\"招标\": 0.8226274,\n" +
                "\t\t\t\t\t\t\"项目负责人\": 0.1773727\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"srcTitle\": \"招标专员\"\n" +
                "\t\t},\n" +
                "\t\t\"saleType\": 0,\n" +
                "\t\t\"schoolTypeLevel\": {\n" +
                "\t\t\t\"schoolCategory\": [],\n" +
                "\t\t\t\"schoolTypeLowerLimit\": [],\n" +
                "\t\t\t\"schoolTypeLowerLimitCodes\": [],\n" +
                "\t\t\t\"schoolTypeUpperLimit\": [],\n" +
                "\t\t\t\"schoolTypeUpperLimitCodes\": []\n" +
                "\t\t},\n" +
                "\t\t\"shortDesc\": \"职位描述： 协助项目经理，依据招标投标法和政府采购法等相关法律法规，圆满完成各类招标采购项目工作，包括但不限于以下工作： 1、协助项目经理编写招标采购方案，编写招标公告和招标文件，发布各类公告，参与组织开标评标会议，接受投标报名，发出各类书面通知等； 2、协助项目经理准备和提供工作中所需的各类资料、信息； 3、协助项目经理与甲方、投标人、监管部门等项目相关方进行沟通； 4、提报、协调公司内部流程事务； 5、协助项目经理收集、整理项目资料、移交归档。 任职资格： 1、大学本科及以上学历，工程管理、项目管理、机械、建筑、采购管理、贸易、法律等相关专业，具有2年以上招标代理机构工作经验，英语四级以上\",\n" +
                "\t\t\"showBenefitTag\": \"五险一金,带薪年假,定期体检,节日福利,绩效奖金\",\n" +
                "\t\t\"tags\": [],\n" +
                "\t\t\"titleTermWeight\": {\n" +
                "\t\t\t\"招标\": 0.9999985,\n" +
                "\t\t\t\"专员\": 0.0000014476077\n" +
                "\t\t},\n" +
                "\t\t\"urgentRecruitmentScore\": 19.5\n" +
                "\t},\n" +
                "\t\"org\": {\n" +
                "\t\t\"address\": \"北京市通州区车站路48号东方宾馆写字楼C座\",\n" +
                "\t\t\"benefits\": [\n" +
                "\t\t\t10000,\n" +
                "\t\t\t10001,\n" +
                "\t\t\t10002\n" +
                "\t\t],\n" +
                "\t\t\"businesslicenceurl\": \"https://storage-public.zhaopin.cn/org/file/verify/1602755740902538584/WeChat%20Image_20201015175137.jpg\",\n" +
                "\t\t\"businesslicenceurlname\": \"北京德聚招标有限公司\",\n" +
                "\t\t\"cityid\": 530,\n" +
                "\t\t\"companyName\": \"北京德聚招标有限公司\",\n" +
                "\t\t\"countryid\": 0,\n" +
                "\t\t\"cqid\": 0,\n" +
                "\t\t\"createTime\": 1547195707000,\n" +
                "\t\t\"createstaffid\": 1022788005,\n" +
                "\t\t\"endtime\": 1656518399000,\n" +
                "\t\t\"establishedTime\": 1483286400000,\n" +
                "\t\t\"eventType\": \"CHANGE\",\n" +
                "\t\t\"financingStage\": 1,\n" +
                "\t\t\"financingStageDisplayFlag\": true,\n" +
                "\t\t\"financingStageName\": \"未融资\",\n" +
                "\t\t\"illegal\": false,\n" +
                "\t\t\"industry\": \"200300\",\n" +
                "\t\t\"industryFilledSource\": 1,\n" +
                "\t\t\"industryid\": \"200300\",\n" +
                "\t\t\"introurl\": \"http://company.zhaopin.com/CZ844990010.htm\",\n" +
                "\t\t\"iscompany\": \"y\",\n" +
                "\t\t\"latitude\": \"39.902777\",\n" +
                "\t\t\"limitcount\": 100,\n" +
                "\t\t\"loginPointType\": 0,\n" +
                "\t\t\"logourl\": \"https://fileihr.zhaopin.com/084/499/084499001/logo/29bac504-8038-45af-8aec-d828958c1e4b.jpg\",\n" +
                "\t\t\"longitude\": \"116.662692\",\n" +
                "\t\t\"modifystaffid\": 1087439910,\n" +
                "\t\t\"newIndustry\": {\n" +
                "\t\t\t\"largeIndustryNames\": [\n" +
                "\t\t\t\t\"专业服务\",\n" +
                "\t\t\t\t\"建筑业\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"largeIndustrys\": [\n" +
                "\t\t\t\t400000000,\n" +
                "\t\t\t\t200000000\n" +
                "\t\t\t],\n" +
                "\t\t\t\"smallIndustryNames\": [\n" +
                "\t\t\t\t\"工程技术与设计服务\",\n" +
                "\t\t\t\t\"专业技术服务业\",\n" +
                "\t\t\t\t\"土木工程建筑业\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"smallIndustrys\": [\n" +
                "\t\t\t\t400080000,\n" +
                "\t\t\t\t400070000,\n" +
                "\t\t\t\t200010000\n" +
                "\t\t\t]\n" +
                "\t\t},\n" +
                "\t\t\"offWorkTime\": \"18:00\",\n" +
                "\t\t\"onWorkTime\": \"09:00\",\n" +
                "\t\t\"orgAddresses\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"address\": \"北京市通州区车站路48号东方宾馆写字楼C座\",\n" +
                "\t\t\t\t\"cityId\": 530,\n" +
                "\t\t\t\t\"cityName\": \"北京\",\n" +
                "\t\t\t\t\"latitude\": \"39.902777\",\n" +
                "\t\t\t\t\"longitude\": \"116.662692\",\n" +
                "\t\t\t\t\"regionId\": 0,\n" +
                "\t\t\t\t\"zoomLevel\": 0\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"orgAffiliatedCompanies\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"name\": \"北京德聚招标有限公司\",\n" +
                "\t\t\t\t\"relation\": \"控股\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"orgHonors\": [\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"name\": \"优质企业\",\n" +
                "\t\t\t\t\"url\": \"https://baike.baidu.com/item/\"\n" +
                "\t\t\t}\n" +
                "\t\t],\n" +
                "\t\t\"orgVipStatus\": true,\n" +
                "\t\t\"orgdescription\": \"<p>北京德聚招标有限公司</p> \\n<p>简介</p> \\n<p>德聚招标有限公司，是一家以招标代理为基础业务的综合型服务企业。公司实行现代企业管理制度，为各行业及各级政府提供专业的招标服务。</p> \\n<p>公司拥有国家发改委、住建部、财政部、工信部、商务部等机构颁发的各类招标代理资质。同时自主建立由各行业权威评审专家组成的评标专家库，具备强大的专业化运营及服务能力。</p> \\n<p>公司始终坚持为客户提供一站式招标解决方案与服务理念，始终追求一流的品质与服务。积极倡导和维护公开、公正、公平与诚实信用原则，在维护国家利益、社会公共利益和招投标当事人权益方面做出了卓越贡献。同时倡导稳健的发展过程，赢得了社会各界的充分信任与肯定。</p> \\n<p>经过数年发展，公司招标代理服务遍及国防军工、矿产冶炼、机械制造与能源化工民航、公路与港航工程、房屋建筑与市政工程、土地整理与农林水利、科教文卫、数据处理和网络技术应用等领域，专业严谨的服务为各项目实现节资率平均超过18%，并保持持续增长。</p> \\n<p>作为综合型服务企业，德聚招标将不断探索经营模式由单一向多元的转变，正加速向深度和广度发展。在未来的发展道路上，我们将充分整合优势资源，不断提高招标服务的专业水平，并以招标事业为轴心，辐射拓展多元化业务领域，在实现经济效益和社会效益的同时，为中国招标事业的发展作出卓越贡献！</p> \\n<p> </p> \\n<p>北京德聚招标有限公司</p> \\n<p><br></p>\",\n" +
                "\t\t\"orgid\": 84499001,\n" +
                "\t\t\"orgname\": \"北京德聚招标有限公司\",\n" +
                "\t\t\"orgnumber\": \"CZ844990010\",\n" +
                "\t\t\"orgnumber2\": \"CC844990010\",\n" +
                "\t\t\"orgsize\": 3,\n" +
                "\t\t\"orgtype\": 5,\n" +
                "\t\t\"overTimeCondition\": [],\n" +
                "\t\t\"parentid\": 84499001,\n" +
                "\t\t\"platsource\": 0,\n" +
                "\t\t\"postalcode\": \"\",\n" +
                "\t\t\"provinceid\": 530,\n" +
                "\t\t\"rddepid\": 0,\n" +
                "\t\t\"rdorgid\": 0,\n" +
                "\t\t\"restTime\": [\n" +
                "\t\t\t10030\n" +
                "\t\t],\n" +
                "\t\t\"rootorgid\": 84499001,\n" +
                "\t\t\"sizeName\": \"100-299人\",\n" +
                "\t\t\"slaveDisplayOrgName\": \"北京德聚招标有限公司\",\n" +
                "\t\t\"sourceid\": 2,\n" +
                "\t\t\"staffid\": 0,\n" +
                "\t\t\"starttime\": 1549821652741,\n" +
                "\t\t\"status\": 30,\n" +
                "\t\t\"stockCode\": \"\",\n" +
                "\t\t\"superIndustryType\": {\n" +
                "\t\t\t\"mainIndustry\": {\n" +
                "\t\t\t\t\"largeCode\": 800000000,\n" +
                "\t\t\t\t\"largeName\": \"专业服务\",\n" +
                "\t\t\t\t\"smallCode\": 800120000,\n" +
                "\t\t\t\t\"smallName\": \"咨询服务\"\n" +
                "\t\t\t},\n" +
                "\t\t\t\"subIndustries\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"largeCode\": 800000000,\n" +
                "\t\t\t\t\t\"largeName\": \"专业服务\",\n" +
                "\t\t\t\t\t\"smallCode\": 800110000,\n" +
                "\t\t\t\t\t\"smallName\": \"专业技术服务\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"largeCode\": 800000000,\n" +
                "\t\t\t\t\t\"largeName\": \"专业服务\",\n" +
                "\t\t\t\t\t\"smallCode\": 800030000,\n" +
                "\t\t\t\t\t\"smallName\": \"工程技术与设计服务\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"typeSource\": 2\n" +
                "\t\t},\n" +
                "\t\t\"tags\": [\n" +
                "\t\t\t\"10000\",\n" +
                "\t\t\t\"10002\",\n" +
                "\t\t\t\"10001\",\n" +
                "\t\t\t\"10030\",\n" +
                "\t\t\t\"10015\"\n" +
                "\t\t],\n" +
                "\t\t\"total\": 100,\n" +
                "\t\t\"type\": 1002,\n" +
                "\t\t\"typeName\": \"民营\",\n" +
                "\t\t\"url\": \"https://baike.baidu.com/item/\",\n" +
                "\t\t\"userid\": 1,\n" +
                "\t\t\"vipDescription\": \"温馨提示：您的会员有效期非产品有效期，产品有效期请在控制面板-产品消费明细中查看。\",\n" +
                "\t\t\"vipEndtime\": 1656432000000,\n" +
                "\t\t\"vipName\": \"白银会员\",\n" +
                "\t\t\"workTimeType\": 1,\n" +
                "\t\t\"zoomlevel\": 0\n" +
                "\t},\n" +
                "\t\"staff\": {\n" +
                "\t\t\"authType\": 0,\n" +
                "\t\t\"authenticationsubtype\": 10,\n" +
                "\t\t\"authenticationtype\": 0,\n" +
                "\t\t\"avatar\": \"https://rd5-public.zhaopin.cn/imgs/avatar_f3.png\",\n" +
                "\t\t\"avatarModifytype\": 0,\n" +
                "\t\t\"businessLicenceApplyDate\": \"2020-10-15 17:55:44.992\",\n" +
                "\t\t\"businessLicenceUrl\": \"https://storage-public.zhaopin.cn/org/file/verify/1602755740902538584/WeChat%20Image_20201015175137.jpg\",\n" +
                "\t\t\"companyId\": 84499001,\n" +
                "\t\t\"createDate\": 1602751486852,\n" +
                "\t\t\"createUserId\": 1087439910,\n" +
                "\t\t\"ctimestamp\": 0,\n" +
                "\t\t\"customaudittime\": 1602751486954,\n" +
                "\t\t\"customcommittime\": 0,\n" +
                "\t\t\"defaultloginpoint\": 308160575,\n" +
                "\t\t\"dutyType\": -1,\n" +
                "\t\t\"gender\": 2,\n" +
                "\t\t\"invMode\": 0,\n" +
                "\t\t\"invUserId\": 0,\n" +
                "\t\t\"invtp\": 0,\n" +
                "\t\t\"job\": \"HR\",\n" +
                "\t\t\"lastLoginDate\": 1637219398217,\n" +
                "\t\t\"modifiedDate\": 1636695390225,\n" +
                "\t\t\"modifiedUsertid\": 1087439910,\n" +
                "\t\t\"nickName\": \"HR\",\n" +
                "\t\t\"noPassCode\": 0,\n" +
                "\t\t\"noPassMessage\": \"\",\n" +
                "\t\t\"orgHostId\": 0,\n" +
                "\t\t\"orgId\": 84499001,\n" +
                "\t\t\"orgReviewStatus\": 20,\n" +
                "\t\t\"orgReviewType\": -1,\n" +
                "\t\t\"passportUserHostId\": 0,\n" +
                "\t\t\"passportUserId\": 1087439910,\n" +
                "\t\t\"platSource\": 0,\n" +
                "\t\t\"signupSourceId\": 1,\n" +
                "\t\t\"sourceCompanyId\": 0,\n" +
                "\t\t\"sourceCompanyType\": 0,\n" +
                "\t\t\"sourceId\": 2,\n" +
                "\t\t\"staffAppealId\": 0,\n" +
                "\t\t\"staffAuditTime\": 1602756051888,\n" +
                "\t\t\"staffCommitTime\": 1602755745008,\n" +
                "\t\t\"staffId\": 1087439910,\n" +
                "\t\t\"staffName\": \"HR\",\n" +
                "\t\t\"staffPermission\": 64,\n" +
                "\t\t\"staffReviewStatus\": 20,\n" +
                "\t\t\"staffRole\": 101,\n" +
                "\t\t\"staffSource\": 10,\n" +
                "\t\t\"status\": 20,\n" +
                "\t\t\"subSourceId\": 1,\n" +
                "\t\t\"subStatus\": 0,\n" +
                "\t\t\"userId\": 0\n" +
                "\t}\n" +
                "}";
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        String string = jsonObject.getJSONObject("org").getJSONObject("newIndustry").getString("largeIndustrys");
        System.out.println(string);

    }
}
