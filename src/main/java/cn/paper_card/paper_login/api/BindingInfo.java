package cn.paper_card.paper_login.api;

import java.util.UUID;

public record BindingInfo(
        UUID mojangUuid,
        String name,
        UUID paperUuid,
        String remark,
        long time
) {
}
