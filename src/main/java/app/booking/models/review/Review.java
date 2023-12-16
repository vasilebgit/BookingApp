package app.booking.models.review;

import app.booking.models.property.Property;
import app.booking.models.users.User;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer rating;
    @Column
    private String comment;

    @Column(name = "date_posted")
    private LocalDate datePosted;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user_id;

    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property_id;
}
