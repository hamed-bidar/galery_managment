package ir.mapsa.galery.event;

import ir.mapsa.galery.artwork.Artwork;
import ir.mapsa.galery.artwork.ArtworkDTO;
import ir.mapsa.galery.generics.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventMapper extends GenericMapper<Artwork, ArtworkDTO> {
}
