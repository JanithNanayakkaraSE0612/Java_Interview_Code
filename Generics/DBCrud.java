package Generics;

import java.util.ArrayList;

public interface DBCrud <T , ID> {
    boolean Save(T obj);
    boolean Update(T obj);
    T Search (ID id);
    boolean Delete (ID id);
    ArrayList <T> getAll();
}
