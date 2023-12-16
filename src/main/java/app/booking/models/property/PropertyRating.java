package app.booking.models.property;

import app.booking.models.users.User;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "property_ratings")
public class PropertyRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer rating;

    @Column(name = "date_rated")
    private LocalDate dateRated;

    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user_id;
}
