package net.fabricmc.colorfulazaleas.mixin;

import com.mojang.serialization.Codec;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(TreeDecoratorType.class)
public interface TreeDecoratorTypeMixin {
    @Invoker
    static <T extends TreeDecorator> TreeDecoratorType<T> callRegister(String id, Codec<T> codec) {
        throw new IllegalStateException();
    }
}
