package africa.semicolon.AuctionSystem.data.models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Double offer;

    @OneToOne
    private AppUser appUser;

    @OneToOne
    private AuctionItem item;

    @CreationTimestamp
    private LocalDateTime timeOfBid;

}
