package km_botirc;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.awt.Color;
import java.awt.Font;

public class MainIrcBot extends JFrame {

	/**
	 * First
	 */
	private static final long serialVersionUID = 1;
	private JLabel lblQuePedoPasa;
	private JButton desconectar;
	private JButton start;
	public static JTextField textfield;
	private JTextField LinkSpam;
//	private JTextField Canal;
	private JTextArea textarea;
	private JScrollPane scrollpanel;
//	private JTextField fbogp;
	
/* Combobox servidor, canales, tipodespam, */
	private JComboBox<String> cerver;
	public static JComboBox<String> Canal;
	public static JComboBox<String> Canal2;
	public static JComboBox<String> Canal3;
	public static JComboBox<String> Canal4;
	public static JComboBox<String> Canal5;
	private JComboBox<String> fbogp;
	
	public static JTextArea status;
	public static JTextArea privados;
	
	
	public MainIrcBot(){
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		
		lblQuePedoPasa = new JLabel("If you don't like where you are, change it. You're not a tree.");
		lblQuePedoPasa.setVerticalAlignment(SwingConstants.TOP);
		lblQuePedoPasa.setHorizontalAlignment(SwingConstants.LEFT);
		lblQuePedoPasa.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblQuePedoPasa.setForeground(Color.WHITE);
		panel.add(lblQuePedoPasa);
		
		textarea = new JTextArea(25, 80);
		textarea.setBackground(Color.LIGHT_GRAY);
		textarea.setText("By Ketzal & Moy \n\n\n 'Tocame mis partes roboticas' - IRC Bot 2015\n\n'Aprende algo dinero(8)' - Mac Dinero\n\n #InfiernoHacker\n\n Bitches forever\n\n CIERRA LA BOCA Y PONME A TRABAJAR ¡PERRA!\n\n");
		textarea.setEditable(false);
		scrollpanel = new JScrollPane(textarea);
		panel.add(scrollpanel);
		
		PrintStream printStream = new PrintStream(new CustomOutputStream(textarea));
		System.setOut(printStream);
		System.setErr(printStream);
		
		textfield = new JTextField(15);
		textfield.setBackground(Color.LIGHT_GRAY);
		textfield.setText("NickName");
		panel.add(textfield);
		
		LinkSpam = new JTextField(15);
		LinkSpam.setBackground(Color.LIGHT_GRAY);
		LinkSpam.setText("LinkSpam");
		panel.add(LinkSpam);
//Servidor		
		cerver = new JComboBox<String>();
		cerver.setBackground(Color.LIGHT_GRAY);
		cerver.addItem("irc.chatzona.org");
		cerver.addItem("miranda.chathispano.com");
		cerver.addItem("sun.hira.io");
		panel.add(cerver);
//soporte multicanal		
		Canal = new JComboBox<String>();
		Canal.setBackground(Color.LIGHT_GRAY);
//Chatzona
		Canal.addItem("Canal 1");
		Canal.addItem("");
		Canal.addItem("CHATZONA");
		Canal.addItem("");
		Canal.addItem("#sexo");
		Canal.addItem("#chateagratis.net");
		Canal.addItem("#latinoamerica");
		Canal.addItem("#mexico");
		Canal.addItem("#gay");
		Canal.addItem("#argentina");
		Canal.addItem("#cam");
		Canal.addItem("#venezuela");
		Canal.addItem("#mas_de_40");
		Canal.addItem("#españa");
		Canal.addItem("#bots6");
		Canal.addItem("");
//Hispano
		Canal.addItem("Hispano");
		Canal.addItem("");
		Canal.addItem("#sexo");
		Canal.addItem("#mas_de_40");
		Canal.addItem("#terra_chat");
		Canal.addItem("#madrid");
		Canal.addItem("#barcelona");
		Canal.addItem("#irc-hispano");
		panel.add(Canal);
		
		Canal2 = new JComboBox<String>();
		Canal2.setBackground(Color.LIGHT_GRAY);
		//Chatzona
				Canal2.addItem("Canal 2");
				Canal2.addItem("");
				Canal2.addItem("CHATZONA");
				Canal2.addItem("");
				Canal2.addItem("#sexo");
				Canal2.addItem("#chateagratis.net");
				Canal2.addItem("#latinoamerica");
				Canal2.addItem("#mexico");
				Canal2.addItem("#gay");
				Canal2.addItem("#argentina");
				Canal2.addItem("#cam");
				Canal2.addItem("#venezuela");
				Canal2.addItem("#mas_de_40");
				Canal2.addItem("#españa");
				Canal2.addItem("#bots6");
				Canal2.addItem("");
		//Hispano
				Canal2.addItem("Hispano");
				Canal2.addItem("");
				Canal2.addItem("#sexo");
				Canal2.addItem("#mas_de_40");
				Canal2.addItem("#terra_chat");
				Canal2.addItem("#madrid");
				Canal2.addItem("#barcelona");
				Canal2.addItem("#irc-hispano");
		panel.add(Canal2);
		
		Canal3 = new JComboBox<String>();
		Canal3.setBackground(Color.LIGHT_GRAY);
		//Chatzona
				Canal3.addItem("Canal 3");
				Canal3.addItem("");
				Canal3.addItem("CHATZONA");
				Canal3.addItem("");
				Canal3.addItem("#sexo");
				Canal3.addItem("#chateagratis.net");
				Canal3.addItem("#latinoamerica");
				Canal3.addItem("#mexico");
				Canal3.addItem("#gay");
				Canal3.addItem("#argentina");
				Canal3.addItem("#cam");
				Canal3.addItem("#venezuela");
				Canal3.addItem("#mas_de_40");
				Canal3.addItem("#españa");
				Canal3.addItem("#bots6");
				Canal3.addItem("");
		//Hispano
				Canal3.addItem("Hispano");
				Canal3.addItem("");
				Canal3.addItem("#sexo");
				Canal3.addItem("#mas_de_40");
				Canal3.addItem("#terra_chat");
				Canal3.addItem("#madrid");
				Canal3.addItem("#barcelona");
				Canal3.addItem("#irc-hispano");
		panel.add(Canal3);
		
		Canal4 = new JComboBox<String>();
		Canal4.setBackground(Color.LIGHT_GRAY);
		//Chatzona
				Canal4.addItem("Canal 4");
				Canal4.addItem("");
				Canal4.addItem("CHATZONA");
				Canal4.addItem("");
				Canal4.addItem("#sexo");
				Canal4.addItem("#chateagratis.net");
				Canal4.addItem("#latinoamerica");
				Canal4.addItem("#mexico");
				Canal4.addItem("#gay");
				Canal4.addItem("#argentina");
				Canal4.addItem("#cam");
				Canal4.addItem("#venezuela");
				Canal4.addItem("#mas_de_40");
				Canal4.addItem("#españa");
				Canal4.addItem("#bots6");
				Canal4.addItem("");
		//Hispano
				Canal4.addItem("Hispano");
				Canal4.addItem("");
				Canal4.addItem("#sexo");
				Canal4.addItem("#mas_de_40");
				Canal4.addItem("#terra_chat");
				Canal4.addItem("#madrid");
				Canal4.addItem("#barcelona");
				Canal4.addItem("#irc-hispano");
		panel.add(Canal4);
		
		Canal5 = new JComboBox<String>();
		Canal5.setBackground(Color.LIGHT_GRAY);
		//Chatzona
				Canal5.addItem("Canal 5");
				Canal5.addItem("");
				Canal5.addItem("CHATZONA");
				Canal5.addItem("");
				Canal5.addItem("#sexo");
				Canal5.addItem("#chateagratis.net");
				Canal5.addItem("#latinoamerica");
				Canal5.addItem("#mexico");
				Canal5.addItem("#gay");
				Canal5.addItem("#argentina");
				Canal5.addItem("#cam");
				Canal5.addItem("#venezuela");
				Canal5.addItem("#mas_de_40");
				Canal5.addItem("#españa");
				Canal5.addItem("#bots6");
				Canal5.addItem("");
		//Hispano
				Canal5.addItem("Hispano");
				Canal5.addItem("");
				Canal5.addItem("#sexo");
				Canal5.addItem("#mas_de_40");
				Canal5.addItem("#terra_chat");
				Canal5.addItem("#madrid");
				Canal5.addItem("#barcelona");
				Canal5.addItem("#irc-hispano");
		panel.add(Canal5);

//Facebook o Google Play		
		fbogp = new JComboBox<String>();
		fbogp.setBackground(Color.LIGHT_GRAY);
		fbogp.setToolTipText("fb(Para FB) gp(google Play)");
		fbogp.addItem("fb");
		fbogp.addItem("gp");
		panel.add(fbogp);
		
		
		start = new JButton("ON");
		start.setBackground(Color.LIGHT_GRAY);
		panel.add(start);
		start.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  
		  {
			  MyBot.canal = Canal.getSelectedItem().toString();
			  MyBot.canal2 = Canal2.getSelectedItem().toString();
			  MyBot.canal3 = Canal3.getSelectedItem().toString();
			  MyBot.canal4 = Canal4.getSelectedItem().toString();
			  MyBot.canal5 = Canal5.getSelectedItem().toString();
			  MyBot.linkSpamm = LinkSpam.getText().toString();
			  MyBot.server = cerver.getSelectedItem().toString();
			  MyBot.fbOgp = fbogp.getSelectedItem().toString();
			  MyBot.NickName = textfield.getText().toString();	
			  
			  try {
				IniciarBotIrc();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}  
		  }
		});
		
		
		desconectar = new JButton("OFF");
		desconectar.setBackground(Color.LIGHT_GRAY);
		panel.add(desconectar);
		desconectar.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  
		  {
			  MyBot desc = new MyBot();
			  desc.Desconectar();
			  
		  }
		  });
		
		
		privados = new JTextArea(0, 0);
		privados.setText("Privados iniciados: 0 .::Privados que llegaron al final: 0");
		privados.setBackground(Color.GRAY);
		privados.setForeground(Color.WHITE);
		panel.add(privados);
		//		separadorHorizontal.setBounds(430, 92, 100, 5);	
		status = new JTextArea(0, 0);
		status.setText("Soy una hermosa mariposa...");
		status.setBackground(Color.LIGHT_GRAY);
		panel.add(status);
//		separadorHorizontal.setBounds(430, 92, 100, 5);
		
		
		
		JFrame frame = new JFrame("KM_BotIrc Java 1.8 #InfiernoHacker");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
        frame.setSize(900,750);
        frame.setVisible(true);
        

	}
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		
        
        
        CreateGui();
        
        
    }
	
	public static void IniciarBotIrc() throws Exception{
		new IniciarBot();
	}
	
	
	
	
	public static void CreateGui(){
		new MainIrcBot();
        
		
	}

}