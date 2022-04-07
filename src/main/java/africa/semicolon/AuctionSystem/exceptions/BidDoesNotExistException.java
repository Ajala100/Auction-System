package africa.semicolon.AuctionSystem.exceptions;

public class BidDoesNotExistException extends Throwable{
    public BidDoesNotExistException(String message){
        super(message);
    }
}
