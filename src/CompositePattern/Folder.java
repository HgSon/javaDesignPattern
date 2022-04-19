package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
	List<Component> children = new ArrayList<>();

	public Folder(String name) {
		super(name);
	}

	public boolean addChild(Component component) {
		return children.add(component);
	}

	public boolean removeChild(Component component) {
		return children.remove(component);
	}

	public List<Component> getChildren() {
		return children;
	}

}
