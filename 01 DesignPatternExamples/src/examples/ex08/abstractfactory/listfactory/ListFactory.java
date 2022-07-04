package examples.ex08.abstractfactory.listfactory;

import examples.ex08.abstractfactory.factory.Factory;
import examples.ex08.abstractfactory.factory.Link;
import examples.ex08.abstractfactory.factory.Page;
import examples.ex08.abstractfactory.factory.Tray;

public class ListFactory extends Factory {

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
