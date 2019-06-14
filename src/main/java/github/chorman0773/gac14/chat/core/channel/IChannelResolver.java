package github.chorman0773.gac14.chat.core.channel;

import net.minecraft.util.ResourceLocation;

public interface IChannelResolver {
	public boolean canResolve(ResourceLocation loc);
	public IChannel resolve(ResourceLocation loc);
	public int getPriority();
}
