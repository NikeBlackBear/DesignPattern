package examples.ex04.factory.idcard;

import examples.ex04.factory.framwork.Product;

public class IDcard extends Product {
    private String owner;
    private int serial;
    IDcard(String owner, int serial){
        System.out.printf("%s(%d)의 카드를 만듭니다.\n", owner, serial);
        this.owner = owner;
        this.serial = serial;
    }
    public void use(){
        System.out.printf("%s(%d)의 카드를 사용합니다.\n", owner, serial);
    }
    public String getOwner(){
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}