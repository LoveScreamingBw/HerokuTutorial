package iandres.OctoFun;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {
		public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
			String[] args = event.getMessage().getContentRaw().split("\\s+");
			
			if (args[0].equalsIgnoreCase(OctoFun.prefix + "aide")) {
				EmbedBuilder aide = new EmbedBuilder();
				aide.setTitle("❓ Besoin d'aide ?");
				aide.setDescription("*<:alert:850063054942896128> Tu peut créer un ticket pour ses raisons quelconques: expliquez vos problèmes ou une candidature rendez vous dans le #tickets et créez-en un on vous aidera au mieux.*");
				aide.addField("Tu le savais pas ?", "Il y'a d'autre commande disponible!", false);
				aide.setColor(0xef05f7);
				
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage(aide.build()).queue();
				aide.clear();
			}
		}
}
