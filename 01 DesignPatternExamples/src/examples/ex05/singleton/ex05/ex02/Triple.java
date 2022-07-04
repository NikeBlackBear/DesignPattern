package examples.ex05.singleton.ex05.ex02;

public class Triple {
    private static Triple[] triple =new Triple[]{
        new Triple(0),
        new Triple(1),
        new Triple(2)
    };

    private int id;
    private Triple(int id){
        System.out.printf("The instance %d is created.\n", id);
        this.id = id;
    }

    public static Triple getIntance(int id) {
        return triple[id];
    }

    @Override
    public String toString(){
        return String.format("[Tripe id = %d]\n", id);
    }
}
