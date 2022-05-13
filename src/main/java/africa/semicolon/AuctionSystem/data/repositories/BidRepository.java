package africa.semicolon.AuctionSystem.data.repositories;

import africa.semicolon.AuctionSystem.data.models.AppUser;
import africa.semicolon.AuctionSystem.data.models.AuctionItem;
import africa.semicolon.AuctionSystem.data.models.Bid;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BidRepository extends JpaRepository<Bid, Long> {
    Optional<List<Bid>> findBidByBidderId(Long bidderId);
    Optional<List<Bid>> findBidByBidder(AppUser bidder);
    Optional<List<Bid>> findBidByOffer(Double offer);
    Optional<List<Bid>> findBidByAuctionItem(AuctionItem item);
    Optional<List<Bid>> findBidByAuctionItemId(Long itemId);
    Optional<Bid> findBidByAuctionItemAndOffer(AuctionItem item, Double offer);

}
