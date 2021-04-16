package one.box;

public class boxTester {
    public static void main(String[] args) {

        Box<String> box1= new Box<>("Favourite string");
        box1.setField("Layla");
        Box<Integer> box2= new Box<>(31);
        box2.setField(1351);
    }
}
