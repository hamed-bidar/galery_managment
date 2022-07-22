package ir.mapsa.galery.artist;

import ir.mapsa.galery.artwork.Artwork;
import ir.mapsa.galery.common.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tbl_artist")
public class Artist extends BaseEntity {

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "Artwork_id")
    private Artwork artwork;

}
