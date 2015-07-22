import	java.awt.event.ActionEvent;
import	java.awt.image.BufferedImage;
import	java.io.ByteArrayInputStream;
import	java.io.ByteArrayOutputStream;
import	java.io.File;
import	java.io.FileInputStream;
import	java.io.FileOutputStream;
import	java.io.InputStream;
import	java.io.OutputStream;
import	javax.crypto.Cipher;
import	javax.crypto.CipherOutputStream;
import	javax.crypto.KeyGenerator;
import	javax.crypto.SecretKey;
import	javax.crypto.spec.SecretKeySpec;
import	javax.imageio.ImageIO;
import	javax.imageio.stream.ImageOutputStream;
import	javax.swing.JFileChooser;
import	javax.swing.JOptionPane;
public	class	GUITest	extends	javax.swing.JFrame	{
				/**
					*	Creates	new	form	GUI
					*/
				public	GUITest()	{
								initComponents();
				}
				/**
					*	This	method	is	called	from	within	the	constructor	to	initialize	the	form.
					*	WARNING:	Do	NOT	modify	this	code.	The	content	of	this	method	is	always
					*	regenerated	by	the	Form	Editor.
					*/
				@SuppressWarnings("unchecked")
				//	<editor-fold	defaultstate="collapsed"	desc="Generated	Code">//GENBEGIN:initComponents
				private	void	initComponents()	{
								jFileChooser1	=	new	javax.swing.JFileChooser();
								jFileChooser2	=	new	javax.swing.JFileChooser();
								jPanel1	=	new	javax.swing.JPanel();
								jTextField1	=	new	javax.swing.JTextField();
								jButton1	=	new	javax.swing.JButton();
								jPanel2	=	new	javax.swing.JPanel();
								jTextField2	=	new	javax.swing.JTextField();
								jLabel1	=	new	javax.swing.JLabel();
								jTextField3	=	new	javax.swing.JTextField();
								jLabel2	=	new	javax.swing.JLabel();
								jLabel3	=	new	javax.swing.JLabel();
								jButton2	=	new	javax.swing.JButton();
								jTextField4	=	new	javax.swing.JTextField();
								jButton3	=	new	javax.swing.JButton();
								jRadioButton1	=	new	javax.swing.JRadioButton();
								jRadioButton2	=	new	javax.swing.JRadioButton();
								setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
								jButton1.setText("Browse	Files");
								jButton1.addActionListener(new	java.awt.event.ActionListener()	{
												public	void	actionPerformed(java.awt.event.ActionEvent	evt)	{
																jButton1ActionPerformed(evt);
												}
								});
								jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
								jLabel1.setText("Decryption	Time	(ms)");
								jLabel2.setText("Encryption	Time	(ms)");
								jLabel3.setText("Encryption");
								jButton2.setText("Begin	AES");
								jButton2.addActionListener(new	java.awt.event.ActionListener()	{
												public	void	actionPerformed(java.awt.event.ActionEvent	evt)	{
																jButton2ActionPerformed(evt);
												}
								});
								jTextField4.addActionListener(new	java.awt.event.ActionListener()	{
												public	void	actionPerformed(java.awt.event.ActionEvent	evt)	{
																jTextField4ActionPerformed(evt);
												}
								});
								jButton3.setText("Choose	Save	Directory");
								jButton3.addActionListener(new	java.awt.event.ActionListener()	{
												public	void	actionPerformed(java.awt.event.ActionEvent	evt)	{
																jButton3ActionPerformed(evt);
												}
								});
								javax.swing.GroupLayout	jPanel2Layout	=	new	
javax.swing.GroupLayout(jPanel2);
								jPanel2.setLayout(jPanel2Layout);
								jPanel2Layout.setHorizontalGroup(
												
jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,	
jPanel2Layout.createSequentialGroup()
																.addGap(35,	35,	35)
																.addComponent(jLabel2)
																
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(jTextField3,	javax.swing.GroupLayout.PREFERRED_SIZE,	
81,	javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,	
26,	Short.MAX_VALUE)
																.addComponent(jLabel1)
																
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jTextField2,	javax.swing.GroupLayout.PREFERRED_SIZE,	
80,	javax.swing.GroupLayout.PREFERRED_SIZE)
																.addContainerGap(32,	Short.MAX_VALUE))
												.addGroup(jPanel2Layout.createSequentialGroup()
																
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
LEADING)
																				.addGroup(jPanel2Layout.createSequentialGroup()
																								.addGap(17,	17,	17)
																								.addComponent(jButton3)
																								.addGap(18,	18,	18)
																								.addComponent(jTextField4))
																				.addGroup(jPanel2Layout.createSequentialGroup()
																								
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
LEADING)
																												.addGroup(jPanel2Layout.createSequentialGroup()
																																.addGap(207,	207,	207)
																																.addComponent(jButton2))
																												.addGroup(jPanel2Layout.createSequentialGroup()
																																.addContainerGap()
																																.addComponent(jLabel3)))
																								.addGap(0,	0,	Short.MAX_VALUE)))
																.addContainerGap())
								);
								jPanel2Layout.setVerticalGroup(
												
jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,	
jPanel2Layout.createSequentialGroup()
																.addContainerGap()
																.addComponent(jLabel3)
																.addGap(17,	17,	17)
																
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
BASELINE)
																				.addComponent(jButton3)
																				.addComponent(jTextField4,	javax.swing.GroupLayout.PREFERRED_SIZE,	
javax.swing.GroupLayout.DEFAULT_SIZE,	
javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,	
20,	Short.MAX_VALUE)
																.addComponent(jButton2)
																.addGap(30,	30,	30)
																
.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
BASELINE)
																				.addComponent(jTextField2,	javax.swing.GroupLayout.PREFERRED_SIZE,	
javax.swing.GroupLayout.DEFAULT_SIZE,	
javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(jLabel1)
																				.addComponent(jTextField3,	javax.swing.GroupLayout.PREFERRED_SIZE,	
javax.swing.GroupLayout.DEFAULT_SIZE,	
javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(jLabel2))
																.addGap(20,	20,	20))
								);
								jRadioButton1.setText("Preserve	Image	Header");
								
								
								jRadioButton2.setText("Decrypt");
								jRadioButton2.addActionListener(new	java.awt.event.ActionListener()	{
												public	void	actionPerformed(java.awt.event.ActionEvent	evt)	{
												 try	{
jRadioButton2ActionPerformed(evt);
}	catch	(Exception	e)	{
//	TODO	Auto-generated	catch	block
e.printStackTrace();
}
												}
								});
								
								javax.swing.GroupLayout	jPanel1Layout	=	new	
javax.swing.GroupLayout(jPanel1);
								jPanel1.setLayout(jPanel1Layout);
								jPanel1Layout.setHorizontalGroup(
												
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup()
																
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
LEADING)
																				.addGroup(jPanel1Layout.createSequentialGroup()
																								.addGap(154,	154,	154)
																								.addComponent(jRadioButton1))
																								.addGroup(jPanel1Layout.createSequentialGroup()
																								.addGap(200,	200,	200)
																								.addComponent(jRadioButton2))		
																				.addGroup(jPanel1Layout.createSequentialGroup()
																								.addGap(33,	33,	33)
																								.addComponent(jButton1)
																								
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(jTextField1,	
javax.swing.GroupLayout.PREFERRED_SIZE,	327,	
javax.swing.GroupLayout.PREFERRED_SIZE)))
																.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,	
Short.MAX_VALUE))
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,	
jPanel1Layout.createSequentialGroup()
																.addContainerGap(11,	Short.MAX_VALUE)
																.addComponent(jPanel2,	javax.swing.GroupLayout.PREFERRED_SIZE,	
javax.swing.GroupLayout.DEFAULT_SIZE,	
javax.swing.GroupLayout.PREFERRED_SIZE)
																.addContainerGap(11,	Short.MAX_VALUE))
								);
								jPanel1Layout.setVerticalGroup(
												
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup()
																.addContainerGap(37,	Short.MAX_VALUE)
																
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
BASELINE)
																				.addComponent(jButton1)
																				.addComponent(jTextField1,	javax.swing.GroupLayout.PREFERRED_SIZE,	
javax.swing.GroupLayout.DEFAULT_SIZE,	
javax.swing.GroupLayout.PREFERRED_SIZE))
																
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(jRadioButton1)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,	
21,	Short.MAX_VALUE)
																.addComponent(jRadioButton2)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,	
21,	Short.MAX_VALUE)
																
																.addComponent(jPanel2,	javax.swing.GroupLayout.PREFERRED_SIZE,	
javax.swing.GroupLayout.DEFAULT_SIZE,	
javax.swing.GroupLayout.PREFERRED_SIZE)
																.addContainerGap())
								);
								jPanel2.getAccessibleContext().setAccessibleName("Encryption");
								javax.swing.GroupLayout	layout	=	new	
javax.swing.GroupLayout(getContentPane());
								getContentPane().setLayout(layout);
								layout.setHorizontalGroup(
												layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jPanel1,	javax.swing.GroupLayout.DEFAULT_SIZE,	
javax.swing.GroupLayout.DEFAULT_SIZE,	Short.MAX_VALUE)
								);
								layout.setVerticalGroup(
												layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jPanel1,	javax.swing.GroupLayout.DEFAULT_SIZE,	
javax.swing.GroupLayout.DEFAULT_SIZE,	Short.MAX_VALUE)
								);
								pack();
				}//	</editor-fold>//GEN-END:initComponents
				private	void	jButton2ActionPerformed(java.awt.event.ActionEvent	evt)	{//GENFIRST:event_jButton2ActionPerformed
						
						JOptionPane.showMessageDialog(null,	"To	write	code	for	encryption");
						try{
										FileInputStream	file	=	new	FileInputStream(jTextField1.getText());
										FileOutputStream	outStream	=	new	FileOutputStream(jTextField4.getText());
										byte	k[]="CooL2116NiTh5252".getBytes();
										SecretKeySpec	key	=	new	SecretKeySpec(k,	"AES");
										Cipher	enc	=	Cipher.getInstance("AES");
										
									long	startTime	=	System.currentTimeMillis();
										enc.init(Cipher.ENCRYPT_MODE,	key);
										
										long	endTime	=	System.currentTimeMillis();
										jTextField3.setText(String.valueOf(endTime	- startTime));
										
										CipherOutputStream	cos	=	new	CipherOutputStream(outStream,	enc);
										byte[]	buf	=	new	byte[1024];
										int	read;
										while((read=file.read(buf))!=-1){
														cos.write(buf,0,read);
										}
										file.close();
										outStream.flush();
										cos.close();
										JOptionPane.showMessageDialog(null,	"The	file	encrypted	Successfully");
						}catch(Exception	e){
										JOptionPane.showMessageDialog(null,	e);
						}
				
						/*	To	write	code	for		for	encryption	&	decryption	here...	*/
						
				}//GEN-LAST:event_jButton2ActionPerformed
			
				private	void	jRadioButton2ActionPerformed(java.awt.event.ActionEvent	evt)	
throws	Exception
				{
				 try{
												FileInputStream	file	=	new	FileInputStream(jTextField1.getText());
												FileOutputStream	outStream	=	new	FileOutputStream(jTextField4.getText());
												byte	k[]="CooL2116NiTh5252".getBytes();
												SecretKeySpec	key	=	new	SecretKeySpec(k,	"AES");
												
												
												Cipher	enc	=	Cipher.getInstance("AES");
												
												
														long	startTime	=	System.currentTimeMillis();
												enc.init(Cipher.DECRYPT_MODE,	key);
													long	endTime	=	System.currentTimeMillis();
															jTextField2.setText(String.valueOf(endTime	- startTime));
																
												CipherOutputStream	cos	=	new	CipherOutputStream(outStream,	enc);
												byte[]	buf	=	new	byte[1024];
												int	read;
												while((read=file.read(buf))!=-1){
																cos.write(buf,0,read);
												}
												file.close();
												outStream.flush();
												cos.close();
												JOptionPane.showMessageDialog(null,	"The	image	was	decrypted	uccessfully");
												Runtime.getRuntime().exec("rundll32	url.dll,	FileProtocolHandler	"+"Decrypt.jpg");
								}catch(Exception	e){
												JOptionPane.showMessageDialog(null,	e);
								}
				
				}
				
				private	void	jButton1ActionPerformed(java.awt.event.ActionEvent	evt)	{//GENFIRST:event_jButton1ActionPerformed
								//	file	chooser	to	choose	image	(Browse)
								int	returnVal	=	jFileChooser1.showOpenDialog(this);
								if	(returnVal	==	JFileChooser.APPROVE_OPTION)
								{
												File	file	=	jFileChooser1.getSelectedFile();
												if	(!file.canRead())	{
																file.setReadable(true);
												}
												//	display	file	name	in	text	field
												jTextField1.setText(file.getAbsolutePath());
								}	else
								{
												System.out.println("You	must	choose	a	file.");
								}
				}//GEN-LAST:event_jButton1ActionPerformed
				private	void	jTextField4ActionPerformed(java.awt.event.ActionEvent	evt)	
{//GEN-FIRST:event_jTextField4ActionPerformed
								//	TODO	add	your	handling	code	here:
				}//GEN-LAST:event_jTextField4ActionPerformed
				private	void	jButton3ActionPerformed(java.awt.event.ActionEvent	evt)	{//GENFIRST:event_jButton3ActionPerformed
								jFileChooser2.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
								int	returnVal	=	jFileChooser2.showOpenDialog(this);
								if	(returnVal	==	JFileChooser.APPROVE_OPTION)
								{
												File	file	=	jFileChooser2.getSelectedFile();
												if	(!file.canRead())	{
																file.setReadable(true);
												}
												//	display	file	name	in	text	field
												jTextField4.setText(file.getAbsolutePath());
								}	else
								{
												System.out.println("You	must	choose	a	save	directory.");
								}
				}//GEN-LAST:event_jButton3ActionPerformed
				/**
					*	@param	args	the	command	line	arguments
					*/
				public	static	void	main(String	args[])	{
								/*	Set	the	Nimbus	look	and	feel	*/
								//<editor-fold	defaultstate="collapsed"	desc="	Look and	feel	setting	code	optional)	">
								/*	If	Nimbus	(introduced	in	Java	SE	6)	is	not	available,	stay	with	the	default	look	
and	feel.
									*	For	details	see	
http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html	
									*/
								try	{
												for	(javax.swing.UIManager.LookAndFeelInfo	info	:	
javax.swing.UIManager.getInstalledLookAndFeels())	{
																if	("Nimbus".equals(info.getName()))	{
																				javax.swing.UIManager.setLookAndFeel(info.getClassName());
																				break;
																}
												}
								}	catch	(ClassNotFoundException	ex)	{
												
java.util.logging.Logger.getLogger(GUITest.class.getName()).log(java.util.logging.Level.SEVERE,	null,	ex);
								}	catch	(InstantiationException	ex)	{
												
java.util.logging.Logger.getLogger(GUITest.class.getName()).log(java.util.logging.Level.SEVERE,	null,	ex);
								}	catch	(IllegalAccessException	ex)	{
												
java.util.logging.Logger.getLogger(GUITest.class.getName()).log(java.util.logging.Level.SEVERE,	null,	ex);
								}	catch	(javax.swing.UnsupportedLookAndFeelException	ex)	{
												
java.util.logging.Logger.getLogger(GUITest.class.getName()).log(java.util.logging.Level.SEVERE,	null,	ex);
								}
								//</editor-fold>
								/*	Create	and	display	the	form	*/
								java.awt.EventQueue.invokeLater(new	Runnable()	{
												public	void	run()	{
																new	GUITest().setVisible(true);
												}
								});
				}
				//	Variables	declaration	- do	not	modify//GEN-BEGIN:variables
				private	javax.swing.JButton	jButton1;
				private	javax.swing.JButton	jButton2;
				private	javax.swing.JButton	jButton3;
				private	javax.swing.JFileChooser	jFileChooser1;
				private	javax.swing.JFileChooser	jFileChooser2;
				private	javax.swing.JLabel	jLabel1;
				private	javax.swing.JLabel	jLabel2;
				private	javax.swing.JLabel	jLabel3;
				private	javax.swing.JPanel	jPanel1;
				private	javax.swing.JPanel	jPanel2;
				private	javax.swing.JRadioButton	jRadioButton1;
				private	javax.swing.JRadioButton	jRadioButton2;
				private	javax.swing.JTextField	jTextField1;
				private	javax.swing.JTextField	jTextField2;
				private	javax.swing.JTextField	jTextField3;
				private	javax.swing.JTextField	jTextField4;
				
				private	javax.swing.JTextField	jTextField4Copy	=	jTextField4;
				//	End	of	variables	declaration//GEN-END:variables
}