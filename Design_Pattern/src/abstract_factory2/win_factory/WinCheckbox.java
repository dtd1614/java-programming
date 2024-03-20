package abstract_factory2.win_factory;

import abstract_factory2.factory.Checkbox;

public class WinCheckbox implements Checkbox{

	@Override
	public void paint() {
		System.out.println("Paint Windows Checkbox");
	}
}
