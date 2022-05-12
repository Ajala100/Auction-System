package africa.semicolon.AuctionSystem.data.email;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HtmlTemplate {
    private String template;
    private Map<String, Object> props;
}
