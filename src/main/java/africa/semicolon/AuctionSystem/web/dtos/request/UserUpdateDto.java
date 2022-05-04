package africa.semicolon.AuctionSystem.web.dtos.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class UserUpdateDto {
    @Size(max = 35, message = "email must not be more than 35 characters long")
    @Email
    private String email;

    @Size(min=8, max=25, message = "password must be between 8 and 25 characters long")
    private String password;

    private String firstName;
    private String lastName;
    @Size(max = 100, message = "Address cannot be more than 100 characters")
    private String address;
    @Size(max = 11, message = "Invalid phone nUmber")
    private String phoneNumber;
}
