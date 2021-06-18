package iandres.OctoFun;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Of extends ListenerAdapter {
		public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
			String[] args = event.getMessage().getContentRaw().split("\\s+");
			
			if (args[0].equalsIgnoreCase(OctoFun.prefix + "of")) {
				EmbedBuilder aide = new EmbedBuilder();
				aide.setTitle("<a:officiel:848662284318015568>  Aide");
				aide.setDescription("Version du Bot `V.1.0` \n  \n 🎉 Fun \n `Coucou` `wch` `trkl` `Ping` \n  \n <:Hosting:851186745923600384>  Serveur \n `!stats` `!info` \n  \n <:dev_badge:851185069901086750> Support \n Si vous constatez des problèmes Contactez mon créateur officiel. **Idris_ytb190#1161** \n  \n <:admin:851200252294987837> Modération \n `Aucune commande` \n  \n <:boutique:851188698531364904> Boutique \n `!buy` `!offres` \n  \n <:teams:851196396962578444> Staff \n `!iandres`");
				aide.setImage("https://media.discordapp.net/attachments/851027750067109918/851142574533378079/standard.gif");
				aide.addField("__Liens__:", "[🎀 Invitation Bot](https://discord.com/api/oauth2/authorize?client_id=835577271220961291&permissions=8&scope=bot) \n [🎫 Support](https://www.octocraft.ezcraft.fr) \n [<:youtube:849659075096084521> YouTube](https://www.youtube.com/channel/UCXF329RFtqbdLdL1WMUG-rQ)", false);
				aide.setColor(0x00fc04);
				
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage(aide.build()).queue();
				aide.clear();
			}
		}
}
