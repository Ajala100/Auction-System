package africa.semicolon.AuctionSystem.data.models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String event;

    @ManyToMany
    private List<AppUser> appUser;

    @CreationTimestamp
    private LocalDateTime timeCreated;


}
