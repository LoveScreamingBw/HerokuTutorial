package iandres.OctoFun;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class StaffCmd extends ListenerAdapter {
		public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
			String[] args = event.getMessage().getContentRaw().split("\\s+");
			
			if (args[0].equalsIgnoreCase(OctoFun.prefix + "staff")) {
				EmbedBuilder staff = new EmbedBuilder();
				staff.setTitle("Membres du staff:");
				staff.setDescription("Fondateur [1]:\r\n"
						+ "\r\n"
						+ "» @Fondateur | Iandres :crown:\r\n"
						+ "\r\n"
						+ "Administrateurs [4]:\r\n"
						+ "\r\n"
						+ "» @Admin | TieFighter_501\r\n"
						+ "» @Admin | kabrouton\r\n"
						+ "» @Admin | FireFrost13000\r\n"
						+ "» @Admin | Eragon941\r\n"
						+ "\r\n");
				staff.setColor(0xffee00);
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage(staff.build()).queue();
				staff.clear();
			}
		}
}
