package examples.ex02.adapter.forinstance;

public class Ex02IterfaceMain {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
