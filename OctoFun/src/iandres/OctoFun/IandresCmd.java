package iandres.OctoFun;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class IandresCmd extends ListenerAdapter {
		public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
			String[] args = event.getMessage().getContentRaw().split("\\s+");
			
			if (args[0].equalsIgnoreCase(OctoFun.prefix + "iandres")) {
				EmbedBuilder iandres = new EmbedBuilder();
				iandres.setDescription("@Iandres is a President.");
				iandres.setColor(0xffee00);
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage(iandres.build()).queue();
				iandres.clear();
			}
		}
}
