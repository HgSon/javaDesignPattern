package AbstractFactoryPattern2;

import AbstractFactoryPattern2.abst.Button;
import AbstractFactoryPattern2.abst.GuiFactory;
import AbstractFactoryPattern2.abst.TextArea;
import AbstractFactoryPattern2.concrete.GuiFactoryInstance;


public class Main {
	public static void main(String[] args) {
//		GuiFactory factory = new LinuxGuiFactory();
//		GuiFactory factory = new WinGuiFactory();
		GuiFactory factory = GuiFactoryInstance.getGuiFactory();
		Button button = factory.createButton();
		TextArea area = factory.createTextArea();

		button.click();
		System.out.println(area.getText());

		System.out.println(System.getProperty("os.name"));
	}
}
