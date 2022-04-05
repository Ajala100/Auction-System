package africa.semicolon.AuctionSystem.data.models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class AuctionItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String itemName;

    private String description;

    @Column(nullable = false)
    private Double basePrice;

    private String itemImageUrl;

    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private AppUser appUser;

    @CreationTimestamp
    private LocalDateTime timeListed;

}
