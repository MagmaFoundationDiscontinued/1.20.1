package org.bukkit.craftbukkit.block.data.type;

import org.bukkit.block.data.type.TechnicalPiston;
import org.bukkit.craftbukkit.block.data.CraftBlockData;

public abstract class CraftTechnicalPiston extends CraftBlockData implements TechnicalPiston {

    private static final net.minecraft.world.level.block.state.properties.EnumProperty<?> TYPE = getEnum("type");

    @Override
    public Type getType() {
        return get(TYPE, Type.class);
    }

    @Override
    public void setType(Type type) {
        set(TYPE, type);
    }
}
