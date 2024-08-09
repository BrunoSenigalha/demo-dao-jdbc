import java.util.List;

public interface ObjDao <T>{
    void insert(T value);
    void update(T value);
    void deleteById(Integer value);
    List<T> findAll();
}
