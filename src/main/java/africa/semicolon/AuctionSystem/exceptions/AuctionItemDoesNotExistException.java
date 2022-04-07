package africa.semicolon.AuctionSystem.exceptions;

public class AuctionItemDoesNotExistException extends Throwable{
    public AuctionItemDoesNotExistException(String message){
        super(message);
    }
}
