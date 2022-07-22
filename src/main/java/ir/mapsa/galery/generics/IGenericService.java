package ir.mapsa.galery.generics;

 import java.util.List;

public interface IGenericService<D,PK> {

    D save (D d);
    D update (D d);
    D getById(PK pk);
    void  delete(PK pk);
    List<D> getAll();

}
