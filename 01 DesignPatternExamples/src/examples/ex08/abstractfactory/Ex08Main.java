package examples.ex08.abstractfactory;

import examples.ex08.abstractfactory.factory.Factory;
import examples.ex08.abstractfactory.factory.Link;
import examples.ex08.abstractfactory.factory.Page;
import examples.ex08.abstractfactory.factory.Tray;

public class Ex08Main {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Usage : java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: Java Main listfactory.ListFactory");
            System.out.println("Example 2: Java Main tablefactory.TableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);

        Link joins = factory.createLink("중앙일보", "http://www.joins.com/");
        Link chosun = factory.createLink("조선일보", "http://www.chosun.com/");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link naver = factory.createLink("Naver!", "http://www.naver.com/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray traynews = factory.createTray("신문");
        traynews.add(joins);
        traynews.add(chosun);

        Tray trayYahoo = factory.createTray("Yahoo!");
        trayYahoo.add(us_yahoo);
        traynews.add(naver);

        Tray traySearch = factory.createTray("검색엔진");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "영재닷컴");
        page.add(traynews);
        page.add(traySearch);
        page.output();
    }
}
