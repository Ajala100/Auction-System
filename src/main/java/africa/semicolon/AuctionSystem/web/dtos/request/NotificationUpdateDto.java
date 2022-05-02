package africa.semicolon.AuctionSystem.web.dtos.request;

import javax.validation.constraints.Size;
import java.util.Set;

public class NotificationUpdateDto {
    @Size(max=200, message = "Notification even cannot be more than 200 characters long")
    private String event;

    private Set<Long> appUserIdList;
}
