package africa.semicolon.AuctionSystem.exceptions;

public class ItemDoesNotExistException extends Throwable{
    public ItemDoesNotExistException(String message){
        super(message);
    }
}
