package iandres.OctoFun;

import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class pd extends ListenerAdapter {
		public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
			String[] args = event.getMessage().getContentRaw().split("\\s+");
			
			if (args[0].equalsIgnoreCase("pd")) {
				MessageBuilder intr = new MessageBuilder();
				
				
				event.getChannel().sendTyping().queue();
				event.getMessage().addReaction("❌").complete();
				event.getChannel().sendMessage("<:Refus_MC:836231015206223913>  Faite attention à ce que vous dite!").complete();
				event.getMessage().delete().complete();
				intr.clear();
			}
		}
}
