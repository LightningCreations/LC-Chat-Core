package github.chorman0773.gac14.chat.core.channel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.function.Function;

import net.minecraft.util.ResourceLocation;

public class Channels {
	private static final PriorityQueue<IChannelResolver> resolvers = new PriorityQueue<IChannelResolver>(10,Comparator.comparingInt(IChannelResolver::getPriority));
	
	public static void addResolver(IChannelResolver resolver) {
		resolvers.add(resolver);
	}
	
	public static IChannel getChannel(ResourceLocation loc) {
		for(IChannelResolver r:resolvers)
			if(r.canResolve(loc))
				return r.resolve(loc);
		throw new NoSuchElementException("Channel with name "+loc+" cannot be found.");
	}
}
