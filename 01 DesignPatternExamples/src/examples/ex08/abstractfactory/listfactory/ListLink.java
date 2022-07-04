package examples.ex08.abstractfactory.listfactory;

import examples.ex08.abstractfactory.factory.Link;

public class ListLink extends Link {


    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href=\\"+url+"\\>" + caption + "</a></li>\n";
    }
}
