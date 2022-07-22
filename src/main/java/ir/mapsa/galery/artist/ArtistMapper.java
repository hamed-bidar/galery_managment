package ir.mapsa.galery.artist;

 import ir.mapsa.galery.artwork.ArtworkMapper;
 import ir.mapsa.galery.generics.GenericMapper;
 import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",uses = {ArtworkMapper.class})
public interface ArtistMapper extends GenericMapper<Artist,ArtistDTO> {

}
