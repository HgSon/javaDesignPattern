package TemplateMethodPattern;

import TemplateMethodPattern.pattern.AbstGameConnectionHelper;
import TemplateMethodPattern.pattern.DefaultGameConnectionHelper;

public class Main {

	public static void main(String[] args) {
		AbstGameConnectionHelper helper = new DefaultGameConnectionHelper();
		try {
			helper.requestConnection("test");
		} catch(Exception e) {

		}
	}



}
