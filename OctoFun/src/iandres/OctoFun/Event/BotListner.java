package iandres.OctoFun.Event;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.EventListener;

public class BotListner implements EventListener {

	@Override
	public void onEvent(GenericEvent event) {
		System.out.println(event.getClass().getSimpleName());
		if(event instanceof MessageReceivedEvent) onMessage((MessageReceivedEvent)event);
	}
	
	private void onMessage(MessageReceivedEvent event) {
		if(event.getAuthor().equals(event.getJDA().getSelfUser())) return;
		if(event.getGuild().getSelfMember().hasPermission(Permission.MESSAGE_WRITE))
		event.getTextChannel().sendMessage("Bonjour "+event.getAuthor().getAsMention()).queue();
		if(event.getGuild().getSelfMember().hasPermission(Permission.MANAGE_EMOTES));
	}
}
