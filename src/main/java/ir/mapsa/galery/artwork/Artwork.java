package ir.mapsa.galery.artwork;
import ir.mapsa.galery.Genre;
import ir.mapsa.galery.common.BaseEntity;
import ir.mapsa.galery.event.Event;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Table(name = "tbl_artwork")
@NoArgsConstructor
public class Artwork extends BaseEntity {

    @Column
    private String title;

    @Column
    private long price;

    @Enumerated
    private ArtworkStatus artworkStatus;

    @Enumerated
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;


}
