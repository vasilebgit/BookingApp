package app.booking.models.users;

import app.booking.models.booking.Booking;
import app.booking.models.notifications.Notification;
import app.booking.models.payment.Payment;
import app.booking.models.property.PropertyRating;
import app.booking.models.review.Review;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;
    private String password;
    private String email;
    private String name;
    private String role;
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "user_id")
    private Set<Booking> bookings;

    @OneToMany(mappedBy = "user_id")
    private Set<Review> reviews;

    @OneToMany(mappedBy = "user_id")
    private Set<Payment> payments;

    @OneToMany(mappedBy = "user_id")
    private Set<UserPreference> userPreferences;

    @OneToMany(mappedBy = "user_id")
    private Set<PropertyRating> propertyRatings;

    @OneToMany(mappedBy = "user_id")
    private Set<Notification> notifications;
    // Getters and Setters
}
