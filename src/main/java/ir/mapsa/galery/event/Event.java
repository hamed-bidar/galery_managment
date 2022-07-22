package ir.mapsa.galery.event;

import ir.mapsa.galery.artwork.Artwork;
import ir.mapsa.galery.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_event")

public class Event extends BaseEntity {


    @Column
    private String title;

    @Column
    private Date date;

    @Enumerated
    private EventStatus status;


}
