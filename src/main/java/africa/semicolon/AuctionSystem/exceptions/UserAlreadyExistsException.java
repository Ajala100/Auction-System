package africa.semicolon.AuctionSystem.exceptions;

public class UserAlreadyExistsException extends Throwable{
    public UserAlreadyExistsException(String message){
        super(message);
    }
}
