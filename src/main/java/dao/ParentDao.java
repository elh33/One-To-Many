package dao;

import models.Parent;
import java.util.List;

public interface ParentDao {
    void save(Parent parent);
    Parent findById(Long id);
    List<Parent> findAll();
    void update(Parent parent);
    void delete(Parent parent);
}