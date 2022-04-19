package TemplateMethodPattern.pattern;

public class DefaultGameConnectionHelper extends AbstGameConnectionHelper {
	@Override
	protected String doSecurity(String str) {
		System.out.println("보안");
		return str;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("인증");
		return true;
	}

	@Override
	protected int authorization(String name) {
		System.out.println("권한");
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("최종 접속!");
		return info;
	}
}
