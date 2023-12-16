package app.booking.models.users;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "user_preferences")
public class UserPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "preference_type")
    private String preferenceType;

    private String details;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user_id;
}