package app.booking.models.property;

import app.booking.models.room.Room;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "property_availability")
public class PropertyAvailability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "available_from_date")
    private LocalDate availableFromDate;

    @Column(name = "available_to_date")
    private LocalDate availableToDate;

    private String status;

    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property_id;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room_id;
}
