package iandres.OctoFun;

import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class trkl extends ListenerAdapter {
		public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
			String[] args = event.getMessage().getContentRaw().split("\\s+");
			
			if (args[0].equalsIgnoreCase("trkl")) {
				MessageBuilder intr = new MessageBuilder();
				
				
				event.getChannel().sendTyping().queue();
				event.getMessage().addReaction("👍").complete();
				event.getChannel().sendMessage("Cool !").complete();
				intr.clear();
			}
		}
}
