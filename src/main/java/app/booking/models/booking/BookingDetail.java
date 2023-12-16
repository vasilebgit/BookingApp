package app.booking.models.booking;

import app.booking.models.room.Room;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "booking_details")
public class BookingDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer guests;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking_id;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room_id;
}
