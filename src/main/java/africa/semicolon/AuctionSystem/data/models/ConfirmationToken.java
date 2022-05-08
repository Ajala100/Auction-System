package africa.semicolon.AuctionSystem.data.models;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ConfirmationToken {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "token cannot be blank")
    @Column(unique = true)
    private String token;

    @NotBlank(message = "created time cannot be blank")
    private LocalDateTime createdAt;

    @NotBlank(message = "expired time cannot be blank")
    private LocalDateTime expiresAt;

    private LocalDateTime confirmedAt;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @NotBlank(message = "AppUser cannot be null")
    @JoinColumn(name = "app_user_id", nullable = false)
    private AppUser appUser;


}
