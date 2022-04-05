package africa.semicolon.AuctionSystem.data.models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String password;

    private String firstName;
    private String lastName;
    private String address;
    @Column(unique = true)
    private String phoneNumber;

    @CreationTimestamp
    private LocalDateTime timeCreated;

    @ElementCollection
    private Set<Role> role = new HashSet<>();
}
