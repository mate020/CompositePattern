import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	String name;

	List<Component> components = new ArrayList<>();

	public Composite(String name) {
		super();
		this.name = name;
	}

	public void addComponent(Component e) {
		components.add(e);
	}

	@Override
	public void showName() {
		for (Component a : components) {
			a.showName();
		}
	}

	@Override
	public void showOlympics() {
		for(Component a: components) {
			a.showOlympics();
		}
	}

}
