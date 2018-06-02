package com.star.viewPack;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client extends JFrame{
	private Socket socket;
	private BufferedReader in;
	private PrintStream out;
	private boolean connected = false;
	
//	class outThread extends Thread{
//		PrintStream pStream;
//		public outThread(PrintStream pStream) {
//			this.pStream = pStream;
//		}
//		public void run() {
//			textField.addKeyListener(new KeyAdapter() {
//			
//			public void keyPressed(KeyEvent e) {
//				
//				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
//
//					String text = textField.getText();
//					textField.setText("");
//					setText(textArea, text);
//				    out.println(text);
//				    out.flush();
//				    if("quit".equals(text.trim())) {
//				    	try {
//				    		out.close();
//					    	in.close();
//					    	socket.close();
//					    	connected=false;
//						} catch (Exception e2) {
//							// TODO: handle exception
//							e2.printStackTrace();
//						}  	
//				    }
//			}
//			}
//		});
//		}
//	}
	class MonitorThread extends Thread {
		public MonitorThread(BufferedReader br) {
			this.br = br;
		}

		BufferedReader br;

		@Override
		public void run() {
			//接收服务器消息的控制在这里添加
			while(connected) {
				if(!connected) {
					break;
				}
				try {
					String temp = br.readLine();
					setText(textArea, temp);
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			try {
					br.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}

	
	
	public void setText(JTextArea screen, String Message) {
		String[] temp = Message.split("\t");
		for (int i = 0; i < temp.length; i++) {
			screen.setText(screen.getText() + temp[i] + "\n");
			// System.out.print(temp[i]+"\n");
		}
		screen.setCaretPosition(screen.getDocument().getLength());
	}	

	
	
	
	public void setDefaultCloseOperation(int arg0) {
//		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		if (connected) {
			try {
				connected = false;
				out.println("quit");
				out.close();
				in.close();	
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//System.exit(1);
	}
	
	private JPanel upLeftJP,upRightJP,downLeftJP;
	private JTextArea textArea;
	private JTextField textField;
	private JButton linkButton;
	private JLabel tipLabel;
	public Client() {
		super("用户界面");
		
		Container container = getContentPane();
		container.setLayout(new GridLayout(2,2));
		upLeftJP = new JPanel(new GridLayout());
		Font font = new Font("Dialog",Font.ITALIC+Font.BOLD, 12);
		textArea = new JTextArea("显示玩家游戏过程:\n");
		textArea.setEditable(false);
		textArea.setFont(font);
		textArea.setAutoscrolls(true);
		JScrollPane jsp = new  JScrollPane(textArea);
		upLeftJP.add(jsp);
		container.add(upLeftJP);
		upRightJP = new JPanel(new GridLayout());
		linkButton = new JButton("连接到服务器");
		linkButton.setFont(font);
		
		linkButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					socket = new Socket("127.0.0.1", Server.PORT_NUM);
					in = new BufferedReader(new InputStreamReader(socket.getInputStream()));//读取控制命令
					out = new PrintStream(socket.getOutputStream());
					
					connected = true;
					new MonitorThread(in).start();
//					new outThread(out).start();
				
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					textArea.setText(textArea.getText() + "服务器链接失败!你可以走了\n");
				}
			}
		});
		
		upRightJP.add(linkButton);
		container.add(upRightJP);
		downLeftJP = new JPanel(new GridLayout(2,1));
		tipLabel = new JLabel("玩家请输入指令:");
		textField = new JTextField();
		
//		textField.addKeyListener(this);
		textField.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {

					String text = textField.getText();
					textField.setText("");
					setText(textArea, text);
				    out.println(text);
				    out.flush();
				    if("quit".equals(text.trim())) {
				    	try {
				    		out.close();
					    	in.close();
					    	socket.close();
					    	connected=false;
						} catch (Exception e2) {
							// TODO: handle exception
							e2.printStackTrace();
						}  	
				    }
			}
			}
		});
		downLeftJP.add(tipLabel);
		downLeftJP.add(textField);
		container.add(downLeftJP);
		downRightJP downRight= new downRightJP();
		container.add(downRight);
		
		setSize(600, 600);
		setLocation(200, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private class downRightJP extends JPanel{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JButton east,west,south,north,center,one,two,four,five;
		public downRightJP() {
			super(new GridLayout(3, 3));
			east = new JButton("东");
			west = new JButton("西");
			south = new JButton("南");
			north = new JButton("北");
			center = new JButton("皮一下");
			one = new JButton("皮一下");
			two = new JButton("皮一下");
			four = new JButton("皮一下");
			five = new JButton("皮一下");
			
			this.add(one);
			this.add(north);
			this.add(two);
			this.add(west);
			this.add(center);
			this.add(east);
			this.add(four);
			this.add(south);
			this.add(five);
		}
	}
	public static void main(String[] args) {
		Client client = new Client();
	}




//	@Override
//	public void keyTyped(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}



//
//	@Override
//	public void keyPressed(KeyEvent e) {
//		// TODO Auto-generated method stub
//		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
//
//			String text = textField.getText();
//			textField.setText("");
//			setText(textArea, text);
//		    out.println(text);
//		    out.flush();
//		    if("quit".equals(text.trim())) {
//		    	try {
//		    		out.close();
//			    	in.close();
//			    	socket.close();
//			    	connected=false;
//				} catch (Exception e2) {
//					// TODO: handle exception
//					e2.printStackTrace();
//				}  	
//		    }
//	}
//	}
//
//
//
//
//	@Override
//	public void keyReleased(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
}
