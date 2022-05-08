package africa.semicolon.AuctionSystem.data.models;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class SoldItemsArchive {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST )
    @JoinColumn(name = "auction_iten_id", nullable = false)
    private AuctionItem auctionItem;

    @OneToOne(fetch = FetchType.EAGER, cascade =CascadeType.PERSIST)
    @JoinColumn(name = "bid_id", nullable = false)
    private Bid bid;

    @CreationTimestamp
    private LocalDateTime timeSold;

}
