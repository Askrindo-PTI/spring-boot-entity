package id.co.askrindo.simpleriskentity.service;

import java.util.List;

public interface CRUD<T, ID> {

    List<T> getAll();
    T getById(ID entityId);
    T saveOrUpdate(T t);
    boolean delete(T t);
}
