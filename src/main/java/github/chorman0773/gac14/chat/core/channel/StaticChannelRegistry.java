package github.chorman0773.gac14.chat.core.channel;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.NewRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryBuilder;

@Mod.EventBusSubscriber(modid="gac14-chat-core",bus=Mod.EventBusSubscriber.Bus.MOD)
public class StaticChannelRegistry implements IChannelResolver {
	
	private static StaticChannelRegistry instance;
	private IForgeRegistry<IStaticChannel> channelRegistry;
	
	private StaticChannelRegistry(IForgeRegistry<IStaticChannel> channelRegistry) {
		this.channelRegistry = channelRegistry;
	}
	
	public static void addRegistry(NewRegistry newRegistry) {
		IForgeRegistry<IStaticChannel> registry = new RegistryBuilder<IStaticChannel>()
				.setType(IStaticChannel.class)
				.create();
		instance = new StaticChannelRegistry(registry);
		Channels.addResolver(instance);
	}
	
	
	@Override
	public boolean canResolve(ResourceLocation loc) {
		// TODO Auto-generated method stub
		return channelRegistry.containsKey(loc);
	}

	@Override
	public IChannel resolve(ResourceLocation loc) {
		// TODO Auto-generated method stub
		return channelRegistry.getValue(loc);
	}

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return 0;
	}

}
