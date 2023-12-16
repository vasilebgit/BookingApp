package app.booking.models.specialoffer;

import app.booking.models.property.Property;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "special_offers")
public class SpecialOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String description;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "discount_rate")
    private BigDecimal discountRate;

    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property_id;
}
