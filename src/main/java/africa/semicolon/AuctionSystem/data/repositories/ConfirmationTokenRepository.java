package africa.semicolon.AuctionSystem.data.repositories;
import africa.semicolon.AuctionSystem.data.models.ConfirmationToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationToken, Long> {
    Optional<ConfirmationToken> findByToken(String Token);
}
