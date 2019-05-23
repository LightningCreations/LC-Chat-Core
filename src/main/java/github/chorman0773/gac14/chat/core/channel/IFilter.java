package github.chorman0773.gac14.chat.core.channel;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public interface IFilter {
	ResourceLocation getFilterName();
	boolean matches(String text);
	default boolean matches(ITextComponent comp) {
		return matches(comp.getUnformattedComponentText());
	}
}
