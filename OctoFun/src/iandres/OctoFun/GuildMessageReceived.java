package iandres.OctoFun;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class GuildMessageReceived extends ListenerAdapter {
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
		if (args[0].equalsIgnoreCase(OctoFun.prefix + "mute")) {
			if (args.length > 1 && args.length < 3) {
				Member membre = event.getGuild().getMemberById(args[1].replace("<@", "").replace(">", ""));
				Role role = event.getGuild().getRoleById("851507175972929587");
				
				if (!membre.getRoles().contains(role)) {
					// Mute le joueur
					event.getChannel().sendMessage("Muted " + args[1] + ".").queue();
					event.getGuild().addRoleToMember(membre, role).complete();
				}
				else {
					// Unmute Utilisateur
					event.getChannel().sendMessage("Unmuted " + args[1] + ".").queue();
					event.getGuild().removeRoleFromMember(membre, role).complete();
				}
			}
			else if (args.length == 3) {
				
			}
			else {
				event.getChannel().sendMessage("Incorrect syntax. Use '!mute [User mention] [Time {optional}]'").queue();
			}
		}
	}
}
