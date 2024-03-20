package abstract_factory1.listfactory;

import abstract_factory1.factory.Factory;
import abstract_factory1.factory.Link;
import abstract_factory1.factory.Page;
import abstract_factory1.factory.Tray;

public class ListFactory extends Factory{

	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}

}
