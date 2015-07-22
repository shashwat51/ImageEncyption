import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



public class WindowTest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowTest frame = new WindowTest();
					FileInputStream fis=new FileInputStream(jTextField1.getText());
			    	  FileOutputStream fout=new FileOutputStream("D:/SURE DONE/Image5.jpg");
			    	  byte []k="cool2116Nith5252".getBytes();
			    	  SecretKeySpec key=new SecretKeySpec(k,"AES");
			    	  AES A;
			    	  Cipher enc=Cipher.getInstance("AES");
			    	  enc.init(Cipher.ENCRYPT_MODE,key);
			    	  CipherOutputStream cos=new CipherOutputStream(fout,enc);
			    	  byte []b=new byte[1024];
			    	  byte []bE=new byte[1024];
			    	  int read ;
			    	  byte []b2=new byte[2];
			    	  System.out.print(jTextField1.getText());
					b2="0xff".getBytes();
					byte []b3=new byte[2];
					b3="0xd8".getBytes();
					byte []b4=new byte[2];
					b4="0xd9".getBytes();
					
					//fout.write(b3);
			    	  while((read=fis.read(b))!=-1){
			    		 // fout.write(b, 0, A.encrypt(b, k));
			    		  bE=AES.decrypt(b, k);
			    		  System.out.println(bE);
			    		 // fout.write(bE,0,read);
			    		  
			    	  }//while
			    	 // fout.write(b4,0,2);
			    	
			    	  fis.close();
			    	  fout.flush();
			    	  fout.close();

					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WindowTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
