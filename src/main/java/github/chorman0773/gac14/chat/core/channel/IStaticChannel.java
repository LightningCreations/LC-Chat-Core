package github.chorman0773.gac14.chat.core.channel;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.IForgeRegistryEntry;

public interface IStaticChannel extends IChannel, IForgeRegistryEntry<IStaticChannel> {

	@Override
	default Class<IStaticChannel> getRegistryType() {
		// TODO Auto-generated method stub
		return IStaticChannel.class;
	}

	@Override
	default IStaticChannel setRegistryName(ResourceLocation name) {
		throw new UnsupportedOperationException("setRegistryName");
	}
	
	default ResourceLocation getRegistryName() {
		return this.getChannelId();
	}

}
