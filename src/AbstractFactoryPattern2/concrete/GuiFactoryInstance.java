package AbstractFactoryPattern2.concrete;

import AbstractFactoryPattern2.abst.Button;
import AbstractFactoryPattern2.abst.GuiFactory;
import AbstractFactoryPattern2.abst.TextArea;

public class GuiFactoryInstance {
	public static GuiFactory getGuiFactory() {
		int osCode = getOsCode();
		switch (osCode) {
			case 0:
				return new WinGuiFactory();
			case 1:
				return new LinuxGuiFactory();
			default:
				System.out.println("일치하는 os가 없습니다");
				return null;
		}
	}

	public static int getOsCode() {
		String os = System.getProperty("os.name").toLowerCase();
		if (os.contains("windows")) {
			return 0;
		} else if (os.contains("linux")) {
			return 1;
		} else if (os.contains("mac")) {
			return 3;
		} else {
			return -1;
		}

	}
}

class LinuxGuiFactory implements GuiFactory {
	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		return new LinuxTextArea();
	}

	protected LinuxGuiFactory(){

	}
}

class LinuxButton implements Button {
	@Override
	public void click() {
		System.out.println("[linux button] click");
	}
}

class LinuxTextArea implements TextArea {

	private String text;

	@Override
	public String getText() {
		return "[linux text area] getText";
//		return text;
	}
}

class WinButton implements Button {
	@Override
	public void click() {
		System.out.println("[win button] click");
	}
}

class WinGuiFactory implements GuiFactory {
	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public TextArea createTextArea() {
		return new WinTextArea();
	}

	protected WinGuiFactory(){

	}
}

class WinTextArea implements TextArea {

	private String text;

	@Override
	public String getText() {
		return "[win text area] getText";
//		return text;
	}
}
