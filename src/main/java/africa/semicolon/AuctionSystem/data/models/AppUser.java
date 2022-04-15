package africa.semicolon.AuctionSystem.data.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    @Size(max = 35, message = "email must not be more than 35 characters long")
    @Email
    @NotBlank(message = "email cannot be blank")
    private String email;

    @JsonIgnore
    @Column(unique = true)
    @NotBlank(message = "password cannot be blank")
    @Size(min=8, max=25, message = "password must be between 8 and 25 characters long")
    private String password;

    @NotBlank(message = "first name cannot be blank")
    private String firstName;
    @NotBlank(message = "last name cannot be blank")
    private String lastName;

    @Size(max=100, message = "Address cannot be more than 100 characters long")
    private String address;

    @Column(unique = true)
    @Size(max = 11)
    @NotBlank(message = "Phone number cannot be blank")
    private String phoneNumber;

    @JsonIgnore
    @CreationTimestamp
    private LocalDateTime timeCreated;

    private Role role;

}
