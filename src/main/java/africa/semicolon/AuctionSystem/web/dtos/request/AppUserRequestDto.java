package africa.semicolon.AuctionSystem.web.dtos.request;

import africa.semicolon.AuctionSystem.data.models.Role;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Setter
@Getter
public class AppUserRequestDto {

    @NotNull(message = "email cannot be null")
    @Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")
    private String email;
    @NotNull(message = "password must be provided")
    private String password;
    @NotNull(message = "Kindly provide first name")
    private String firstName;
    @NotNull(message = "Kindly provide last name")
    private String lastName;
    @NotNull(message = "Address must be provided")
    private String address;
    @NotNull(message = "phone number must be provided")

    private String phoneNumber;
    @NotNull(message = "Kindly assign role to user")
    private Role role;

}

