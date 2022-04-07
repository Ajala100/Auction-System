package africa.semicolon.AuctionSystem.data.repositories;

import africa.semicolon.AuctionSystem.data.models.AuctionItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AuctionItemRepository extends JpaRepository<AuctionItem, Long> {
    Optional<List<AuctionItem>> findAuctionItemByItemName(String itemName);
    Optional<List<AuctionItem>> findAuctionItemByAppUserId(Long id);

}
