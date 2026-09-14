package dev.velolib.radial.mixin;

import net.minecraft.client.KeyboardHandler;
import net.minecraft.client.input.KeyEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(KeyboardHandler.class)
public interface KeyboardHandlerAccessor {

    @Invoker("handleDebugKeys")
    boolean invokeHandleDebugKeys(KeyEvent keyEvent);

    @Invoker("handleChunkDebugKeys")
    boolean invokeHandleChunkDebugKeys(KeyEvent keyEvent);
}
