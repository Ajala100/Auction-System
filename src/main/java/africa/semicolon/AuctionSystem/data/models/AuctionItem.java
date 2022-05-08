package africa.semicolon.AuctionSystem.data.models;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuctionItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Auction item name cannot be null")
    private String itemName;

    @NotBlank(message = "Auction Item Description cannot be blank.")
    @Size(max = 200, message = "Item description must not be more than 200 characters long")
    private String description;

    @NotBlank(message = "Auction item base price cannot be null")
    private Double basePrice;

    private String itemImageUrl;

    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "seller_id", nullable = false)
    private AppUser seller;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Bid> bids;

    @CreationTimestamp
    private LocalDateTime timeListed;

}
