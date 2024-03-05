package cn.paper_card.paper_login.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

@SuppressWarnings("unused")
public interface BindingService {

    // 添加或更新绑定，添加返回true，更新返回false
    boolean addBinding(@NotNull BindingInfo info) throws Exception;

    // 删除绑定
    boolean removeBinding(@NotNull UUID mojangUuid, @NotNull UUID paperUuid) throws Exception;

    // 根据LittleSkinUuid查询
    @Nullable BindingInfo queryByPaperUuid(@NotNull UUID uuid) throws Exception;

    // 根据MojangUuid查询
    @NotNull List<BindingInfo> queryByMojangUuid(@NotNull UUID uuid, int limit, int offset) throws Exception;
}
