package app.booking.models.jointables;

import app.booking.models.amenity.Amenity;
import app.booking.models.property.Property;
import jakarta.persistence.*;

@Entity

@Table(name = "property_amenities")
public class PropertyAmenity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property_id;

    @ManyToOne
    @JoinColumn(name = "amenity_id")
    private Amenity amenity;
}
