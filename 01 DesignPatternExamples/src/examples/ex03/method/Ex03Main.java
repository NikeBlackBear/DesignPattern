package examples.ex03.method;

public class Ex03Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello");
        AbstractDisplay d3 = new StringDisplay("안녕하세요.");
        d1.display();
        d2.display();
        d3.display();
    }
}
