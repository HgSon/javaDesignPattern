package CompositePattern;

public class Main {
	public static void main(String[] args) {
		Folder
		root = new Folder("root"),
				home = new Folder("home"),
				garam = new Folder("garam"),
				music = new Folder("music"),
				picture = new Folder("picture"),
				doc = new Folder("doc"),
				usr = new Folder("usr");

		File
		track1 = new File("track1"),
				track2 = new File("track2"),
				pic1 = new File("pic1"),
				doc1 = new File("doc1"),
				java = new File("java");

		root.addChild(home);
		root.addChild(usr);
		home.addChild(garam);
		usr.addChild(java);
		garam.addChild(music);
		garam.addChild(picture);
		garam.addChild(doc);
		music.addChild(track1);
		music.addChild(track2);
		picture.addChild(pic1);
		doc.addChild(doc1);

		show(root);

	}

	private static void show(Component component) {
		System.out.println(component.getClass().getName() + " | " + component.getName());

		if(component instanceof Folder) {
			for(Component c : ((Folder)component).getChildren()) {
				show(c);
			}
		}
	}
}
