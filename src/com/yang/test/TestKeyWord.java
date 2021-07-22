package com.yang.test;

import java.util.List;

import com.hankcs.hanlp.HanLP;

public class TestKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String title = "关键词抽取";
//		String content = "关键词自动提取是一种识别有意义且具有代表性片段或词汇的自动化技术。关键词自动提取在文本挖掘域被称为关键词抽取，在计算语言学领域通常着眼于术语自动识别，在信息检索领域，就是指自动标引。";
//		System.out.println(TextRank.getKeyword(title, content));
		String content = "您好，你想要借多少钱？";
        List<String> keywordList = HanLP.extractKeyword(content, 5);
        System.out.println(keywordList);

	}

}
