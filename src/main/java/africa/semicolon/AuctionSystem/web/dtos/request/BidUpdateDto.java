package africa.semicolon.AuctionSystem.web.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BidUpdateDto {
    private Double offer;
    private Long itemId;
    private Long bidderId;
}
