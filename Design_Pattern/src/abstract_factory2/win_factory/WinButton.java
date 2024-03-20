package abstract_factory2.win_factory;

import abstract_factory2.factory.Button;

public class WinButton implements Button{
	
	@Override
	public void paint() {
		System.out.println("Paint Windows Button");
	}
}
