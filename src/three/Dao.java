package three;

import java.util.List;

public interface Dao<T> {
    public void create(T record);

    public T update(T record);

    public void delete(T record);

    public T retrieve(int id);

    public List<T> retrieveAll();
}
