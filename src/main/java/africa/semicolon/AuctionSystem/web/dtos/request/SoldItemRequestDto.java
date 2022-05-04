package africa.semicolon.AuctionSystem.web.dtos.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SoldItemRequestDto {
    private Long bidId;
    private Long itemId;
}
