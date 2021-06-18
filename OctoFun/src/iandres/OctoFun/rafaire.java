package iandres.OctoFun;

import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class rafaire extends ListenerAdapter {
		public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
			String[] args = event.getMessage().getContentRaw().split("\\s+");
			
			if (args[0].equalsIgnoreCase("m'ennuie")) {
				MessageBuilder intr = new MessageBuilder();
				
				
				event.getChannel().sendTyping().queue();
				event.getMessage().addReaction("🎉").complete();
				event.getChannel().sendMessage("Va jouer sur notre serveur!").complete();
				intr.clear();
			}
		}
}
