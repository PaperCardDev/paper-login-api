package cn.paper_card.paper_login.api;

import java.util.UUID;

public record BindingCodeInfo(
        int code,
        UUID uuid,
        String name,
        long time
) {
}
