package africa.semicolon.AuctionSystem.data.repositories;

import africa.semicolon.AuctionSystem.data.models.SoldItemsArchive;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoldItemArchiveRepository extends JpaRepository<SoldItemsArchive, Long> {

}
