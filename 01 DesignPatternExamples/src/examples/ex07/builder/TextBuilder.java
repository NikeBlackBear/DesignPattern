package examples.ex07.builder;

public class TextBuilder implements Builder{
    private StringBuffer buffer = new StringBuffer();
    public void makeTitle(String tile){
        buffer.append("======================\n");
        buffer.append("『" + tile + "』\n");
        buffer.append("\n");
    }
    public void makeString(String str){
        buffer.append('■'+str+"\n");
        buffer.append("\n");
    }
    public void makeItems(String[] items){
        for (int i =0; i< items.length; i++){
            buffer.append(" •" + items[i] + "\n");
        }
        buffer.append("\n");
    }
    public void close(){
        buffer.append("======================\n");
    }
    public String getResult(){
        return buffer.toString();
    }
}
