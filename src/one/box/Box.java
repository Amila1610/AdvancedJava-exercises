package one.box;

public class Box<T> {
    private T field;

    public Box(T f){
        field=f;
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }
}
