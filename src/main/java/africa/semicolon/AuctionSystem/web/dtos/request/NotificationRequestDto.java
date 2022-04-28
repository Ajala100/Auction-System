package africa.semicolon.AuctionSystem.web.dtos.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Setter
@Getter
public class NotificationRequestDto {
    @NotNull(message = "Notification event cannot be null")
    @Size(max=200, message = "Notification event cannot be more than 200 characters long")
    private String event;
    @NotNull(message = "list of notification recipient id cannot be null")
    private Set<Long> recipientIdList;
}
