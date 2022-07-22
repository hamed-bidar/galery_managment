package ir.mapsa.galery.artwork;

import ir.mapsa.galery.event.EventMapper;
import ir.mapsa.galery.generics.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {EventMapper.class})
public interface ArtworkMapper extends GenericMapper<Artwork,ArtworkDTO> {
}
