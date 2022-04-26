package africa.semicolon.AuctionSystem.web.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BidRequestDto {
    private Double offer;
    private Long bidderId;
    private Long auctionItemId;
}
