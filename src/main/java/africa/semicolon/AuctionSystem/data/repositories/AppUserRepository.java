package africa.semicolon.AuctionSystem.data.repositories;

import africa.semicolon.AuctionSystem.data.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findAppUserByEmail(String email);
    Optional<AppUser> findAppUserByPhoneNumber(String phoneNumber);
}
