package africa.semicolon.AuctionSystem.web.controllers;

import africa.semicolon.AuctionSystem.data.models.AppUser;
import africa.semicolon.AuctionSystem.exceptions.UserAlreadyExistsException;
import africa.semicolon.AuctionSystem.services.appUser.AppUserService;
import africa.semicolon.AuctionSystem.web.dtos.request.CreateUserRequestDto;
import africa.semicolon.AuctionSystem.web.dtos.response.BaseResponseDto;
import africa.semicolon.AuctionSystem.web.dtos.response.UserResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/user")
@AllArgsConstructor
public class UserController {

    private final AppUserService appUserService;

    @PostMapping("/registration")
    public ResponseEntity<?> registerUser( @RequestBody CreateUserRequestDto requestDto) throws UserAlreadyExistsException {
        try{
            AppUser createdUser = appUserService.createUser(requestDto);
            return new ResponseEntity<>(new UserResponseDto(true, "Successful", HttpStatus.OK.value(), LocalDate.now(),
                    createdUser), HttpStatus.OK);
        }catch(UserAlreadyExistsException e){
            return new ResponseEntity<>(new BaseResponseDto(false, "Failed", HttpStatus.BAD_REQUEST.value(), LocalDate.now()),
                    HttpStatus.BAD_REQUEST);
        }
    }
}
