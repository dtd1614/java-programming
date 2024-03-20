package abstract_factory2.mac_fatory;

import abstract_factory2.factory.Button;
import abstract_factory2.factory.Checkbox;
import abstract_factory2.factory.GUIFactory;

public class MacFactory implements GUIFactory{
	
	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}
	
}
