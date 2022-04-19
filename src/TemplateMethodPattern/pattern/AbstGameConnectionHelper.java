package TemplateMethodPattern.pattern;

public abstract class AbstGameConnectionHelper {

	protected abstract String doSecurity(String str);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String name);
	protected abstract String connection(String info);

	public String requestConnection(String encodedInfo) throws Exception {
		String decodedInfo = doSecurity(encodedInfo);
		//id, pw 가져옴
		String id = "a";
		String password = "b";

		if (!authentication(id, password)) {
			throw new Exception("정보 불일치");
		}

		String name = "c";
		int auth = authorization(name);

		switch (auth) {
			case -1:
				throw new Error();
			case 0:
				System.out.println("GM");
				break;
			case 1:
				System.out.println("무료유저");
				break;
			case 2:
				System.out.println("유료유저");
				break;
			case 3:
				System.out.println("권한없음");
				break;
			default:
				System.out.println("기타");
				break;
		}
		String info = "";
		return connection(info);
	}

}
