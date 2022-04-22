package africa.semicolon.AuctionSystem.exceptions;

public class ResourceNotFound extends Exception{
    public ResourceNotFound(String message){
        super(message);
    }

    public ResourceNotFound(Class<?> klass, Long id){
        super(String.format("Entity of class %s with id %d does not exist", klass.getSimpleName(), id));
    }

    public ResourceNotFound(Class<?> klass, String value){
        super(String.format("Entity of class %s with value %s does not exist", klass.getSimpleName(), value));
    }
    public ResourceNotFound(Class<?> klass, Long id, String value){
        super(String.format("Entity of class %s with id %d and value %s does not exist", klass.getSimpleName(), id, value));
    }
}
