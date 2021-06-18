package iandres.OctoFun;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ipsite extends ListenerAdapter {
		public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
			String[] args = event.getMessage().getContentRaw().split("\\s+");
			
			if (args[0].equalsIgnoreCase(OctoFun.prefix + "status")) {
				EmbedBuilder aide = new EmbedBuilder();
				aide.setTitle("Rejoins-nous vite !!!");
				aide.setDescription("🎗 IP: mc.octocraftoff.tk \n 💎 Version: 1.8-1.16 \n 🎫 Site: https://www.octocraft.ezecraft.fr \n 🏆 Status: **Ouvert**");
				aide.setThumbnail("https://media.discordapp.net/attachments/851094902091808799/851167484304031754/standard_1.gif");
				aide.setColor(0x1900ff);
				
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage(aide.build()).queue();
				aide.clear();
			}
		}
}
