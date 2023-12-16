package app.booking.models.booking;


import app.booking.models.payment.Payment;
import app.booking.models.property.Property;
import app.booking.models.users.User;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "check_in_date")
    private LocalDateTime checkInDate;

    @Column(name = "check_out_date")
    private LocalDateTime checkOutDate;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    private String status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user_id;

    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property_id;

    @OneToMany(mappedBy = "booking_id")
    private Set<Payment> payments;

    @OneToMany(mappedBy = "booking_id")
    private Set<BookingDetail> bookingDetails_id;
}