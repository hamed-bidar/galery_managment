
package ir.mapsa.galery.generics;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface GenericMapper<E,D>  {


    E toEntity(D dto);
    D toDTO(E entity);
    List<E> toEntityList (List<D>dtoList);
    List<D> toDTOList(List<D> EntityList);




}
