package km_botirc;


import java.awt.Color;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.TimerTask;

import java.util.Timer;

import org.jibble.pircbot.*;

public class MyBot extends PircBot {
	
	
	
	public static String canal = "#macho";
	public static String canal2 = "#default";
	public static String canal3 = "#default";
	public static String canal4 = "#default";
	public static String canal5 = "#default";
	public static String server = "default";
	public static String NickName = "Default";
	public static String linkSpamm = "default";
	public static String fbOgp ="default";
	
	
	
	public static String[] UserPrivado = new String[99999];
	public static int[] numeroMensajeAPrivado = new int[99999];
	
	
	int[] MensajeEnviado = new int[99999];
	int cantidadusers;
	
	String[] Msg = {"hola","Quieero hablaar coon un chiicoo","Un chico que me hable?","alguien que quiera hablar conmigo?","Algun amigo para hablar?","Quiero hablar con alguien u.u","Quien habla conmigo?","Alguieen quee hablee coonmigo?","nadie me habla?","Holaa","Porque nadie me hace caso?","Quien platica conmigo?","Quiero alguien para conversar!","Un chico lindo?","Un chico que me quiera?","Hablenme","Soy hermosa :)","Busco un chico lindo","Por que nadie es lindo conmigo?","Quiero un novio","Hablamos en privado?","Abierta al amor","Donde esta el amor?","Solterita","Ser soltera es aburrido","Busco alguien que me ame","Me siento sola","Seria muy feliz si el amor de mi vida llegara pronto","Hola a todos","Soltera y sin compromisos","Quien para hablar conmigo?, nadie?"};	
	
	String Mensaje1 ;
	String Mensaje2 ;
	String Mensaje3 ;
	String Mensaje4 ;
	String Mensaje5 ;
	String Mensaje6 ;
	String Mensaje7 ;
	String Mensaje8 ;
	String Mensaje9 ;
	String Mensaje10;
	String Mensaje11; //nick
	String Mensaje12;
	
	
	
	
	
	int NumeroMensaje = 1;
	int a;
	
	int NumPrivados = 0;
	int NumPrivadosIni = 0;
	boolean ban = false; 
    
    public MyBot() {
    	
    	
    	MainIrcBot.status.setText("\n Conectado al irc y spameando como perra loca \n");
    	MainIrcBot.status.setForeground(Color.GREEN);
    	MainIrcBot.status.setBackground(Color.GRAY);
    	
    	if(fbOgp.equals("fb")){
    		Mensaje1 = "ola";
    		Mensaje2 = "komo stas?";
    		Mensaje3 = "q ases? yo intento conseguir likes para una pagina de facebook donde subo aveces fotos";
    		Mensaje4 = "me ayudas con un like? y te paso una foto mia comprometedora :3";
    		Mensaje5 = "te paso primero la foto para que veas que no miento";
    		Mensaje6 = "aca esta mi foto http://goo.gl/fKSbGZ";
    		Mensaje7 = "ahora dale like de hecho la pagina es de lo mismo de chicas con tatuajes ".concat(linkSpamm);
    		Mensaje8 = "ya le diste like?";
    		Mensaje9 = "espero que si y te paso otra foto";
    		Mensaje10 = "bueno aunque de todas formas ahi subo mis fotos no tan asi por que facebook me cierra la pagina";
    		Mensaje11 = "ash esperame tantito ahora vuelvo "; //nick
    		Mensaje12 = "no me tardo, esperame";
    		
    		}
    		else if(fbOgp.equals("gp")){
        		Mensaje1 = "Hola Guapo";
        		Mensaje2 = "Como estas? de donde eres?";
        		Mensaje3 = "yo estoy muy bien y soy de Mexico";
        		Mensaje4 = "Te gustaria ver una de mis fotos?";
        		Mensaje5 = "pero a cambio me das una valoracion en una app de google play si?";
        		Mensaje6 = "bueno aca esta mi foto, no se la muestres a nadie -> http://goo.gl/IXjueT";
        		Mensaje7 = "bueno ya te la pase ahora dale valoracion a la app este es el link ->".concat(linkSpamm);
        		Mensaje8 = "si le das 5 estrellas y pones un buen comentario te paso otra foto :)";
        		Mensaje9 = "ya le diste 5 estrellas?";
        		Mensaje10 = "aun no puedo ver si le diste las 5 estrellas";
        		Mensaje11 = "pero confio en ti "; //nick
        		Mensaje12 = "aca esta la otra foto -> http://goo.gl/9j66Gy";
    		}
    	
        this.setName(NickName);
        this.setLogin(NickName);
        
    }
    
    
    public void Wait(String Sender, String Message){
    	
    	Timer timer = new Timer(); 
    	
    	
    	TimerTask timerTask = new TimerTask() 
        { 
            public void run()  
            { 
            	sendMessage(Sender,Message);
            	timer.cancel();
            	for (int i = 0; i < UserPrivado.length; i++) {
        	        if(Sender.equals(UserPrivado[i])){
        	        	MensajeEnviado[i] = 1;
        	        }}
            	
            	
            	
            } 
        }; 
        
        
        
        int RandomTime = 8000 + (int)(Math.random()*7000); 
        timer.scheduleAtFixedRate(timerTask, RandomTime, RandomTime);
               
    
    }
    
   
    public void Desconectar(){
    	
    	quitServer();
    	
    }
    public void Reconectando(){
    	isConnected();
    }
	public void WaitReconect(int TiempoMilisegundos){
    	MyBot reconectar = new MyBot();
    	reconectar.isConnected();
    	if(reconectar.isConnected() == false){
    		Timer timer = new Timer(); 
        	
        	TimerTask timerTask = new TimerTask() 
            { 
                public void run()  
                { 
			String msg1 = MainIrcBot.status.getText();
	    	MainIrcBot.status.setText(msg1 +"\n INTENTANDO RECONECTAR BITCH!\n");
	    	MainIrcBot.status.setForeground(Color.RED);
	    	MainIrcBot.status.setBackground(Color.BLACK);
    		setVerbose(true);
        	String oldnick = MainIrcBot.textfield.getText();
        	if(oldnick.equals(oldnick)){
        		int numerorandom = (int)(Math.random()*15);
        		String nuevonick = oldnick + numerorandom;
        		MainIrcBot.textfield.setText(nuevonick);
        		setName(nuevonick); 
        		setLogin(nuevonick+1);
        		
        	}
    		try {
				reconnect();
			} catch (NickAlreadyInUseException e) {
				try {
					connect(server);
				} catch (IOException | IrcException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IrcException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		 joinChannel(canal);
    		 joinChannel(canal2);
    		 joinChannel(canal3);
    		 joinChannel(canal4);
    		 joinChannel(canal5);
         	//AQUI EL CODE
         	timer.cancel();
         	
         } 
     };        
     timer.scheduleAtFixedRate(timerTask, TiempoMilisegundos, TiempoMilisegundos);
        
    	}
    
    
    }
    public void onKick(String channel, String kickerNick, String kickerLogin, String kickerHostname, String recipientNick, String reason)
    {
    	DateFormat dateFormat = null;
    	String date = null;
    	if(recipientNick.equals(NickName)){
            dateFormat = new SimpleDateFormat("HH:mm:ss");
            date = dateFormat.format(new Date());
    	String msg = MainIrcBot.status.getText();;
    	MainIrcBot.status.setText(msg +"\n"+date+" Kick by "+kickerNick+" Razón: "+reason+" Canal: "+channel+"\n");
    	
    	String kickchannel = (String) MainIrcBot.Canal.getSelectedItem();
        String kickchannel2 = (String) MainIrcBot.Canal2.getSelectedItem();
        String kickchannel3 = (String) MainIrcBot.Canal3.getSelectedItem();
        String kickchannel4 = (String) MainIrcBot.Canal4.getSelectedItem();
        String kickchannel5 = (String) MainIrcBot.Canal5.getSelectedItem();
        if(channel.equals(kickchannel)){
            MainIrcBot.Canal.setBackground(Color.RED);
        }
        if(channel.equals(kickchannel2)){
            MainIrcBot.Canal2.setBackground(Color.RED);
        }
        if(channel.equals(kickchannel3)){
            MainIrcBot.Canal3.setBackground(Color.RED);
        }
        if(channel.equals(kickchannel4)){
            MainIrcBot.Canal4.setBackground(Color.RED);
        }
        if(channel.equals(kickchannel5)){
            MainIrcBot.Canal5.setBackground(Color.RED);
        }
    	
    	
    	if(ban){MainIrcBot.status.setForeground(Color.RED);}else{
    	MainIrcBot.status.setForeground(Color.YELLOW);
    	}
    	MainIrcBot.status.setBackground(Color.BLACK);
    	
    	}

        
    
    }
    //CODE CON TODO LO RELACIONADO A LA DESCONEXION
    public void onDisconnect(){
    	String msg = MainIrcBot.status.getText();
    	MainIrcBot.status.setText(msg +"\nDesconectado :S \n");
    	MainIrcBot.status.setForeground(Color.WHITE);
    	MainIrcBot.status.setBackground(Color.BLACK);

    	WaitReconect(300000);


    }
        
  
    
  // CODE CON TODO LO RELACIONADO A MENSAJES PRIVADOS
    
    protected void onPrivateMessage(String sender, String login, String hostname, String message){
    	
    	
    	
    	if(sender.equals(NickName)){}else{
    		
    	String prefix = getPrefix(canal, sender);
       	 
       	 if(prefix.equals("") && !hostname.equals("roBOT.GuaRDiaN") && !hostname.equals("AirForCe.Bot.Control.De.Canales") && !hostname.equals("Bot.Auxiliar.WiNBoTs") && !hostname.equals("Bot.Proteccion.Canales") && !hostname.equals("bots.chathispano.com") && !hostname.equals("Moldavo.de.Moldavia ")){
       		 
       		 if(!Arrays.asList(UserPrivado).contains(sender)){
       			 
       			 
           		 cantidadusers++;
           		 UserPrivado[cantidadusers] = sender;
           		 numeroMensajeAPrivado[cantidadusers] = 1;
           		 MensajeEnviado[cantidadusers] = 1;
       			 
       		 }
       	 }
    		
    		
    		for (int i = 0; i < UserPrivado.length; i++) {
    	        if(sender.equals(UserPrivado[i])){
    	        	
    	        	if(MensajeEnviado[i] == 1){
    	        	
    	        	if(numeroMensajeAPrivado[i] == 1){
    	        		NumPrivadosIni++;
    	        		MainIrcBot.privados.setText("Privados iniciados: " +NumPrivadosIni +" .::Privados que llegaron al final: "+NumPrivados);
    	        		
    	        	numeroMensajeAPrivado[i] = 2;
    	        	MensajeEnviado[i] = 0;
    	        	Wait(sender, Mensaje1);
    	        	}
    	        	else if(numeroMensajeAPrivado[i] == 2){
    	        		numeroMensajeAPrivado[i] = 3;
    	        		MensajeEnviado[i] = 0;
    	        	Wait(sender, Mensaje2);
    	        	}
    	        	else if(numeroMensajeAPrivado[i] == 3){
    	        		numeroMensajeAPrivado[i] = 4;
    	        		MensajeEnviado[i] = 0;
    	        	Wait(sender, Mensaje3);
    	        	}
    	        	else if(numeroMensajeAPrivado[i] == 4){
    	        		numeroMensajeAPrivado[i] = 5;
    	        		MensajeEnviado[i] = 0;
    	        	Wait(sender, Mensaje4);
    	        	}
    	        	else if(numeroMensajeAPrivado[i] == 5){
    	        		numeroMensajeAPrivado[i] = 6;
    	        		MensajeEnviado[i] = 0;
    	        		Wait(sender, Mensaje5);
    	        	}
    	        	else if(numeroMensajeAPrivado[i] == 6){
    	        		numeroMensajeAPrivado[i] = 7;
    	        		MensajeEnviado[i] = 0;
    	        		Wait(sender, Mensaje6);
    	        	}
    	        	else if(numeroMensajeAPrivado[i] == 7){
    	        		numeroMensajeAPrivado[i] = 8;
    	        		MensajeEnviado[i] = 0;
    	        		Wait(sender, Mensaje7);
    	        	}
    	        	else if(numeroMensajeAPrivado[i] == 8){
    	        		numeroMensajeAPrivado[i] = 9;
    	        		MensajeEnviado[i] = 0;
    	        		Wait(sender, Mensaje8);
    	        	}
    	        	else if(numeroMensajeAPrivado[i] == 9){
    	        		numeroMensajeAPrivado[i] = 10;
    	        		MensajeEnviado[i] = 0;
    	        		Wait(sender, Mensaje9);
    	        	}
    	        	else if(numeroMensajeAPrivado[i] == 10){
    	        		numeroMensajeAPrivado[i] = 11;
    	        		MensajeEnviado[i] = 0;
    	        		Wait(sender, Mensaje10);
    	        	}
    	        	else if(numeroMensajeAPrivado[i] == 11){
    	        		numeroMensajeAPrivado[i] = 12;
    	        		MensajeEnviado[i] = 0;
    	        		Wait(sender, Mensaje11 + sender);
    	        	}
    	        	else if(numeroMensajeAPrivado[i] == 12){
    	        		numeroMensajeAPrivado[i] = 13;
    	        		MensajeEnviado[i] = 0;
    	        		NumPrivados++;
    	        		MainIrcBot.privados.setText("Privados iniciados: " +NumPrivadosIni +" .::Privados que llegaron al final: "+NumPrivados);
    	        		Wait(sender, Mensaje12);
    	        	}
    	        	
    	        	}
    	        	
            		
    	        }
    	      }
    		
    		
       	} 
    	}
    		
    		
    	
    
    	
  
    
    
    private String getPrefix(String channel, String nickname){
        User userList[] = getUsers(channel);

        for(User user : userList ){        
            if(nickname.equals(user.getNick())){
                return user.getPrefix();
            }
        }

        return "";
    }
    
 // CODE PARA ENVIAR UN MENSAJE EN EL CANAL   
    public void onMessage(String channel, String sender,
            String login, String hostname, String message) {
    	
    	  	
    	if(sender.equals(NickName)){
    		   	
    
    	}
    	else{
    	 
    	 a++;
    	 
    	 if(a==1000){
    	 
    	 
    		 
    		 int randomNum = 0 + (int)(Math.random()*29); 
			 int randomNum2 = 0 + (int)(Math.random()*15);
    		 sendMessage(channel, Msg[randomNum] + randomNum2);
    		 
    		 a=1;
    		 
    		 
    		 
    	 
    		 
    	 }
    		 
    	
    }
    
    	
    }


	
}
    

