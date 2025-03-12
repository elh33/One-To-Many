package dao;
import models.Child;
import java.util.List;


public interface ChildDao {
    void save(Child child);
    Child findById(Long id);
    List<Child> findAll();
    void update(Child child);
    void delete(Child child);
}