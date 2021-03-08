package km_botirc;
import java.io.IOException;

import org.jibble.pircbot.*;

public class IniciarBot extends PircBot {
	
	
	public IniciarBot() throws Exception{
		
		String server = MyBot.server;
		String canal = 	MyBot.canal;
		String canal2 = MyBot.canal2;
		String canal3 = MyBot.canal3;
		String canal4 = MyBot.canal4;
		String canal5 = MyBot.canal5;
	

	// Now start our bot up.
    MyBot bot = new MyBot();
    
    // Enable debugging output.
    bot.setVerbose(true);
    
    // Connect to the IRC server.
    try{
    bot.connect(server);
	} catch (NickAlreadyInUseException e) {
		System.out.println( "Prueba de que lo que está aqui lo reconoce" );
		connect(server);
	} catch (IOException e) {
		reconnect();
	} catch (IrcException e) {
		reconnect();
	}

    // Join the #pircbot channel.
    bot.joinChannel(canal);
    bot.joinChannel(canal2);
    bot.joinChannel(canal3);
    bot.joinChannel(canal4);
    bot.joinChannel(canal5);
	}
	
	

}
