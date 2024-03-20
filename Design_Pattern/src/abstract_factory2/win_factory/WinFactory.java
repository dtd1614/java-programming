package abstract_factory2.win_factory;

import abstract_factory2.factory.Button;
import abstract_factory2.factory.Checkbox;
import abstract_factory2.factory.GUIFactory;

public class WinFactory implements GUIFactory{
	
	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WinCheckbox();
	}
}
