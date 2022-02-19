package dao;

import java.util.List;

public interface DAO<T> extends AutoCloseable {

  void create(T object);

  T getById(int id);

  List<T> getAll();

  void update(T object);

  void delete(T object);

  void close();
  public void write();
}
