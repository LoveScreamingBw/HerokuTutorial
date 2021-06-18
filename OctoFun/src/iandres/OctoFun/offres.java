package iandres.OctoFun;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class offres extends ListenerAdapter {
		public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
			String[] args = event.getMessage().getContentRaw().split("\\s+");
			
			if (args[0].equalsIgnoreCase(OctoFun.prefix + "offres")) {
				EmbedBuilder ofr = new EmbedBuilder();
				ofr.setTitle("VOICI NOS OFFRES:");
				ofr.setDescription("🎁 Pour consulter nos offres, \n Rendez-vous sur notre Site: https://www.octocraft.ezcraft.fr \n ❓ Vous consultez des problèmes ? Contactez notre Support ! \n 🔔 Où bien en contactant nos membres du staff.");
				ofr.setColor(0x1900ff);
				
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage(ofr.build()).queue();
				ofr.clear();
			}
		}
}
