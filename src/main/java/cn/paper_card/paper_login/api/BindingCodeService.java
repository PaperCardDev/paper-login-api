package cn.paper_card.paper_login.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@SuppressWarnings("unused")
public interface BindingCodeService {
    // 生成绑定验证码
    int createCode(@NotNull UUID pSkinUuid, @NotNull String name) throws Exception;

    // 取出验证码
    @Nullable BindingCodeInfo takeCode(int code) throws Exception;

    // 清除过期验证码
    int clearOutdated() throws Exception;

    // 验证码最大存活时间
    long getMaxAliveTime();
}
