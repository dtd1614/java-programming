package abstract_factory2.mac_fatory;

import abstract_factory2.factory.Button;

public class MacButton implements Button{
	
	@Override
	public void paint() {
		System.out.println("Paint Mac Button");
	}
}
