package africa.semicolon.AuctionSystem.web.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuctionItemRequestDto {
    private String itemName;
    private String description;
    private Double basePrice;
    private String itemImageUrl;
    private Long sellerId;
}
