package africa.semicolon.AuctionSystem.web.dtos.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class NotificationToOneUserRequestDto {
    @NotNull(message = "recipient id cannot be null")
    private Long recipientId;
    @NotNull(message = "event cannot be null")
    private String event;
}
