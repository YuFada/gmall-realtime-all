package com.alibaba.utils;

import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author fada.yu
 * @version 1.0
 * @date 2021/12/7 17:26
 * @Desc: IK分词工具类
 *
 * 所以我们需要根据把长文本分割成一个一个的词，这种分词技术，在搜索引擎中可能会用到。
 * 对于中文分词，现在的搜索引擎基本上都是使用的第三方分词器，咱们在计算数据中也可以，
 * 使用和搜索引擎中一致的分词器，IK。
 */
public class KeywordUtil {
    //使用IK分词器对字符串进行分词
    public static List<String> analyze(String text)   {

        StringReader sr = new StringReader(text);
        IKSegmenter ik = new IKSegmenter(sr, true);
        Lexeme lex=null;
        ArrayList<String> keywordList  = new ArrayList<>();
        while (true){
            try {
                if ((lex = ik.next()) != null) {
                    String lexemeText = lex.getLexemeText();
                    keywordList.add(lexemeText);
                }else {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return keywordList;

    }

    public static void main(String[] args) {
        System.out.println(analyze("小米插线板自营包邮"));
    }
}
