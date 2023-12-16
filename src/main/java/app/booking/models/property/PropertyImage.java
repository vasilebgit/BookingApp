package app.booking.models.property;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "property_images")
public class PropertyImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "image_path")
    private String imagePath;

    private String description;


    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property_id;
}