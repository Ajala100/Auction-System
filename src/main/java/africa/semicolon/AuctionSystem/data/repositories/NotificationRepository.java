package africa.semicolon.AuctionSystem.data.repositories;

import africa.semicolon.AuctionSystem.data.models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.Set;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    Optional<Set<Notification>> findNotificationByAppUserId(Long id);
    Optional<Set<Notification>> findNotificationByEvent(String event);
}
