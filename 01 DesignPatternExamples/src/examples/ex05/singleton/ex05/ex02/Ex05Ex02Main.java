package examples.ex05.singleton.ex05.ex02;

public class Ex05Ex02Main {
    public static void main(String[] args) {
        System.out.println("Start");
        for (int i = 0; i<9; i++){
            Triple triple = Triple.getIntance(i%3);
            System.out.printf("%d : %s", i , triple);
        }
        System.out.println("End");
    }
}
