package africa.semicolon.AuctionSystem.data.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class SoldItemsArchive {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private AuctionItem auctionItem;

    @OneToOne
    private Bid bid;

    @CreationTimestamp
    private LocalDateTime timeSold;
}
