package africa.semicolon.AuctionSystem.data.models;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Bid offer can not be blank")
    private Double offer;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private AppUser bidder;

    @OneToOne
    private AuctionItem auctionItem;

    @CreationTimestamp
    private LocalDateTime timeOfBid;

}
