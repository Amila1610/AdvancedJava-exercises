package one.box;

public class Box<T>{
    private T field;

    public Box(T f){
        this.field=field;
    }

    public void  setField(T field){
        this.field=field;
    }

    public T getField(){
        return field;
    }
}
