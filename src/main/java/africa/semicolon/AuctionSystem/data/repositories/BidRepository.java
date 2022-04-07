package africa.semicolon.AuctionSystem.data.repositories;

import africa.semicolon.AuctionSystem.data.models.Bid;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BidRepository extends JpaRepository<Bid, Long> {
    Optional<List<Bid>> findBidByAppUserId(Long id);
    Optional<List<Bid>> findBidByOffer(Double offer);

}
