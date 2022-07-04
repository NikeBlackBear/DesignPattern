package examples.ex02.adapter.forclass;

public class Ex02ClassMain {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
