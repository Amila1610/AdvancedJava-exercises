package one.box;

public class BoxTester {
    public static void main(String[] args) {

        Box<String> b1= new Box<String>("Favourite String..");
        b1.setField("Love String");
        System.out.println("Box b1 "+ b1.getField());

        Box<Integer> b2=new Box<>(131);
        b2.setField(131);
    }
}
