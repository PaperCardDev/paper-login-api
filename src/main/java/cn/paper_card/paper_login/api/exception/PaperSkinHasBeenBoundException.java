package cn.paper_card.paper_login.api.exception;

import cn.paper_card.paper_login.api.BindingInfo;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class PaperSkinHasBeenBoundException extends Exception {

    private final @NotNull BindingInfo bindingInfo;

    public PaperSkinHasBeenBoundException(@NotNull BindingInfo bindingInfo, @NotNull String message) {
        super(message);
        this.bindingInfo = bindingInfo;
    }

    public @NotNull BindingInfo getBindingInfo() {
        return this.bindingInfo;
    }
}
