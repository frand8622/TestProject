package com.frandstudio.validationstring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strInput = "abafewfadf";
		String strInput2 = "abafewfadf";
		
		if(strInput.matches(strInput2))
			System.out.println("yes");
		else
			System.out.println("no");

		Pattern p = Pattern.compile("wf");
		Matcher matcher = p.matcher(strInput);

		if (matcher.find()) {
			System.out.println(matcher.replaceFirst("WF123"));
		} else
			System.out.println("find nothing.");

		// 按指定模式在字符串查找
		String line = "This order was placed for QT3000! OK?";
		String pattern = "(\\D*)(\\d+)(.*)";

		// 创建 Pattern 对象
		Pattern r = Pattern.compile(pattern);

		// 现在创建 matcher 对象
		Matcher m = r.matcher(line);
		if (m.find()) {
			System.out.println("Found value: " + m.group(0));
			System.out.println("Found value: " + m.group(1));
			System.out.println("Found value: " + m.group(2));
		} else {
			System.out.println("NO MATCH");
		}

	}

}
