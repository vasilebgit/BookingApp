package app.booking.models.notifications;

import app.booking.models.users.User;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String message;

    @Column(name = "date_sent")
    private LocalDate dateSent;

    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user_id;
}
