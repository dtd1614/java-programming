package abstract_factory2.mac_fatory;

import abstract_factory2.factory.Checkbox;

public class MacCheckbox implements Checkbox{
	
	@Override
	public void paint() {
		System.out.println("Paint Mac Checkbox");
	}
}
