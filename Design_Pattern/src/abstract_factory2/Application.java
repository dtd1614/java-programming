package abstract_factory2;

import abstract_factory2.factory.Button;
import abstract_factory2.factory.Checkbox;
import abstract_factory2.factory.GUIFactory;

public class Application {
	private GUIFactory factory;
	private Button button;
	private Checkbox checkbox;
	
	public Application(String os) {
		this.factory = GUIFactory.getFactory(os);
	}
	
	public void createUI() {
		this.button = factory.createButton();
		this.checkbox = factory.createCheckbox();
	}
	
	public void paint() {
		button.paint();
		checkbox.paint();
	}
}
