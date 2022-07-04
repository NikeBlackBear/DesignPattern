package examples.ex06.prototype;

public class MessageBox extends Product{

    private char decochar;
    public MessageBox(char decochar){
        this.decochar = decochar;
    }
    @Override
    public void use(String s) {
        int lenght = s.getBytes().length;
        for (int i = 0; i< lenght+4 ; i++){
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.printf("%c %s %c\n", decochar,s,decochar);
        for (int i=0; i<lenght+4; i++){
            System.out.print(decochar);
        }
        System.out.println("");
    }

}
