package africa.semicolon.AuctionSystem.web.dtos.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class NotificationToAllUsersRequestDto {
    @NotNull(message = "event cannot be null")
    @Size(max = 200, message = "event cannot be more than 200 characters long")
    private String event;
}
