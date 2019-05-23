package github.chorman0773.gac14.chat.core.channel;

import java.util.List;

import net.minecraft.command.CommandSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public interface IChannel {
	public ResourceLocation getChannelId();
	public List<IFilter> getFilters();
	
	public boolean addFilter(ResourceLocation loc);
	public boolean removeFilter(ResourceLocation loc);
	
	public boolean checkMessage(ITextComponent comp,CommandSource src);
	
	public boolean isMember(CommandSource src);
	public boolean isListener(CommandSource src);
	
	public boolean join(CommandSource src);
	public boolean leave(CommandSource src);
	
	public boolean listen(CommandSource src);
	public boolean stopListening(CommandSource src);
	
	public boolean sendMessage(CommandSource src,ITextComponent message);
}
