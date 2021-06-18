package iandres.OctoFun;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BuyCmd extends ListenerAdapter {
		public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
			String[] args = event.getMessage().getContentRaw().split("\\s+");
			
			if (args[0].equalsIgnoreCase(OctoFun.prefix + "buy")) {
				EmbedBuilder BuyCmd = new EmbedBuilder();
				BuyCmd.setTitle("Transaction de l'achat en cours...");
				BuyCmd.setDescription("Verification en cours...");
				BuyCmd.setFooter("(Nous avons détecté que vous ne possédez pas assez d'OctoCash pour pouvoir faire des achats!)");
				BuyCmd.setColor(0x00f729);
				
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage(BuyCmd.build()).queue();
				BuyCmd.clear();
			}
		}
}
