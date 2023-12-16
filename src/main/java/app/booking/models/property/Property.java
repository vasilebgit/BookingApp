package app.booking.models.property;

import app.booking.models.booking.Booking;
import app.booking.models.jointables.PropertyAmenity;
import app.booking.models.review.Review;
import app.booking.models.room.Room;
import app.booking.models.specialoffer.SpecialOffer;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@Table(name = "properties")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "owner_id")
    private Integer ownerId;

    private String name;
    private String type;
    private String location;
    private String description;
    private String amenities;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "property_id")
    private Set<Booking> bookings;

    @OneToMany(mappedBy = "property_id")
    private Set<Review> reviews;

    @OneToMany(mappedBy = "property_id")
    private Set<PropertyImage> propertyImages;

    @OneToMany(mappedBy = "property_id")
    private Set<PropertyAmenity> propertyAmenities;

    @OneToMany(mappedBy = "property_id")
    private Set<Room> rooms;

    @OneToMany(mappedBy = "property_id")
    private Set<SpecialOffer> specialOffers;

    @OneToMany(mappedBy = "property_id")
    private Set<PropertyRating> propertyRatings;

    @OneToMany(mappedBy = "property_id")
    private Set<PropertyAvailability> propertyAvailabilities;
}
