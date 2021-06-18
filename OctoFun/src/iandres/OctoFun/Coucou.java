package iandres.OctoFun;

import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Coucou extends ListenerAdapter {
		public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
			String[] args = event.getMessage().getContentRaw().split("\\s+");
			
			if (args[0].equalsIgnoreCase("Coucou")) {
				MessageBuilder blg = new MessageBuilder();
				
				
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage("Coucou, Comment cava ?").complete();
				blg.clear();
			}
		}
}
