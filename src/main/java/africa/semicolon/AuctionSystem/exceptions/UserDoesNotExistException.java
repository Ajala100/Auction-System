package africa.semicolon.AuctionSystem.exceptions;

public class UserDoesNotExistException extends Throwable{
    public UserDoesNotExistException(String message){
        super(message);
    }
}
