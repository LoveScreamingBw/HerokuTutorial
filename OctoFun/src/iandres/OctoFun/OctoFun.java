package iandres.OctoFun;

import javax.security.auth.login.LoginException;

import iandres.OctoFun.Event.BotListner;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class OctoFun {
	public static JDA jda;
	public static String prefix = "!";
	
	// Main method
	public static void main(String[] args) throws LoginException {
		jda = new JDABuilder(AccountType.BOT).setToken("ODM1NTc3MjcxMjIwOTYxMjkx.YIRd-Q.BiC0SuwQFlFkbMoN1Fktk5txNq8").build();
		jda.getPresence().setStatus(OnlineStatus.ONLINE);
		jda.getPresence().setActivity(Activity.playing("!of"));
		
		jda.addEventListener(new Commands());
		jda.addEventListener(new Command());
		jda.addEventListener(new Of());
		jda.addEventListener(new BuyCmd());
		jda.addEventListener(new IandresCmd());
		jda.addEventListener(new Coucou());
		jda.addEventListener(new tg());
		jda.addEventListener(new pd());
		jda.addEventListener(new salope());
		jda.addEventListener(new conasse());
		jda.addEventListener(new pute());
		jda.addEventListener(new iandres());
		jda.addEventListener(new wch());
		jda.addEventListener(new rafaire());
		jda.addEventListener(new ipsite());
		jda.addEventListener(new trkl());
		jda.addEventListener(new offres());
		jda.addEventListener(new StaffCmd());
	}
}
