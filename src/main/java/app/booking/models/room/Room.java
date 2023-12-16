package app.booking.models.room;

import app.booking.models.booking.BookingDetail;
import app.booking.models.property.Property;
import app.booking.models.property.PropertyAvailability;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Data
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "room_type")
    private String roomType;

    @Column(name = "price_per_night")
    private BigDecimal pricePerNight;

    @Column(name = "max_occupancy")
    private Integer maxOccupancy;

    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property_id;

    @OneToMany(mappedBy = "room_id")
    private Set<BookingDetail> bookingDetails;

    @OneToMany(mappedBy = "room_id")
    private Set<PropertyAvailability> propertyAvailabilities;
}
