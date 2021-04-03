package ee.sda.carrental.service;

import java.util.List;

public interface GenericService<T> {

    List<T> findAll();
    T read (Integer id);
    void createOrUpdate (T object);
    void delete (T object);
    void delete (Integer id);

}
