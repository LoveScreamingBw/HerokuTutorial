package iandres.OctoFun;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Command extends ListenerAdapter {
		public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
			String[] args = event.getMessage().getContentRaw().split("\\s+");
			
			if (args[0].equalsIgnoreCase(OctoFun.prefix + "info")) {
				EmbedBuilder info = new EmbedBuilder();
				info.setTitle("Tu veut en savoir plus sur nous ?");
				info.setDescription("Support: \n octocraft.ezcraft.fr");
				info.setColor(0x00fff2);
				
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage(info.build()).queue();
				info.clear();
			}
		}
}
