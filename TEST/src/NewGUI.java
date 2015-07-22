import java.io.*;
import java.util.logging.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;

import javax.swing.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;
 
 
public class NewGUI extends JFrame
{
    // Variables declaration 
    private JPanel processPanel;
    private JButton browseButton, encryptButton, decryptButton;
    private JLabel dTimeLabel, eTimeLabel, imageLabel, showDTimeLabel, showETimeLabel;
    private JFileChooser fileChooser;
    private JTextField fileTextField;
     
    File file;
    SecretKey key;
    long startTime, endTime, totalTime;
    ImageIcon icon;
    byte[] encryptedImage;
    String totalTimeStr;
     
     
    public NewGUI()
    {
      super("AES Encryption and Decryption");
    
        fileChooser = new JFileChooser();
        processPanel = new JPanel();
        eTimeLabel = new JLabel();
        dTimeLabel = new JLabel();
        imageLabel = new JLabel();
        decryptButton = new JButton();
        encryptButton = new JButton();
        browseButton = new JButton();
        fileTextField = new JTextField();
        showETimeLabel = new JLabel();
        showDTimeLabel = new JLabel();
 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
        processPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Encryption Info"));
        processPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
 
        eTimeLabel.setText("Encryption Time:-");
 
        dTimeLabel.setText("Decryption Time:-");
 
        imageLabel.setText("Image");
 
        decryptButton.setText("Decryption");
        decryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptButtonActionPerformed(evt);
                
                JOptionPane.showMessageDialog(null, "To write code for encryption & decryption here...");
                try{
              	  FileInputStream fis=new FileInputStream(jTextField1.getText());
              	  FileOutputStream fout=new FileOutputStream("D:\\Image2.jpg");
              	  byte []k="cool2116Nith5252".getBytes();
              	  SecretKeySpec key=new SecretKeySpec(k,"AES");
              	  Cipher enc=Cipher.getInstance("AES");
              	  enc.init(Cipher.DECRYPT_MODE,key);
              	  CipherOutputStream cos=new CipherOutputStream(fout,enc);
              	  byte []b=new byte[1024];
              	  int read ;
              	  while((read=fis.read(b))!=-1){
              		  cos.write(b, 0, read);
              	  }//while
              	  fis.close();
              	  fout.flush();
              	  fout.close();
                }
              catch(Exception e){
              	
              }
            }
        });
 
        encryptButton.setText("Encryption");
        encryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptButtonActionPerformed(evt);
            }
        });
 
        browseButton.setText("Browse");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });
 
        fileTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileTextFieldActionPerformed(evt);
            }
        });
 
        javax.swing.GroupLayout processPanelLayout = new javax.swing.GroupLayout(processPanel);
        processPanel.setLayout(processPanelLayout);
        processPanelLayout.setHorizontalGroup(
            processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processPanelLayout.createSequentialGroup()
                        .addComponent(browseButton)
                        .addGap(39, 39, 39)
                        .addComponent(fileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(processPanelLayout.createSequentialGroup()
                        .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eTimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(encryptButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addComponent(showETimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dTimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(decryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(showDTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
            .addGroup(processPanelLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(imageLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        processPanelLayout.setVerticalGroup(
            processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, processPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(browseButton)
                    .addComponent(fileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addComponent(imageLabel)
                .addGap(127, 127, 127)
                .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processPanelLayout.createSequentialGroup()
                        .addComponent(decryptButton)
                        .addGap(18, 18, 18)
                        .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dTimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showDTimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(processPanelLayout.createSequentialGroup()
                        .addComponent(encryptButton)
                        .addGap(18, 18, 18)
                        .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eTimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showETimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(249, Short.MAX_VALUE))
        );
 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(processPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(processPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
         
        pack();
    }
 
    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // file chooser to select image file
        int fileChoose = fileChooser.showOpenDialog(this);
        if (fileChoose == JFileChooser.APPROVE_OPTION)
        {
            file = fileChooser.getSelectedFile();
 
            // display file path in text field
            fileTextField.setText(file.getAbsolutePath());
 
        }
    }
 
    // Set fileTextFieldActionPerformed NULL
    private void fileTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }
 
    //Perform image encryption.
     
     void encryptButtonActionPerformed(ActionEvent evt)
     {
      try
        {
          KeyGenerator keygen = KeyGenerator.getInstance("AES");
          keygen.init(128);
          key = keygen.generateKey();
           
          startTime = System.currentTimeMillis(); // encrypt start time
          BufferedImage image = ImageIO.read(new File(fileTextField.getText()));
          ByteArrayOutputStream baos = new ByteArrayOutputStream();
          ImageIO.write(image, "jpg", baos );
          byte[] byteArray = baos.toByteArray();
           
          byte[] encryptedImage = AES.encrypt(key.getEncoded(), byteArray);
           
          endTime = System.currentTimeMillis();
           
          totalTime = endTime-startTime;
           
          totalTimeStr = String.valueOf(totalTime);
           
          showETimeLabel.setText(totalTimeStr + "ms"); //encryption end time 
           
        }
        catch (IOException exception)
        {
          JOptionPane.showMessageDialog(this, "You must choose a file.");
        }
        catch (Throwable exception2)
        {
            exception2.printStackTrace();           
        }
      }
     
 
    // Perform decrypton process.
 
     void decryptButtonActionPerformed(ActionEvent evt)
     {
        try
        {
          //Get the instance of AES and store in object of KeyGenerator
           
            KeyGenerator keygen = KeyGenerator.getInstance("AES");
            keygen.init(128);
          // SecretKey key = keygen.generateKey();
 
            long startTime = System.currentTimeMillis(); //decrypt start time
             
            byte[] decryptedImage = AES.decrypt(encryptedImage, key.getEncoded());
            InputStream in = new ByteArrayInputStream(decryptedImage);
            BufferedImage bImageFromConvert = ImageIO.read(in);
           
            endTime = System.currentTimeMillis(); //Set end time of decrypttion
           
            totalTime = endTime-startTime; //Get total time of decrypttion
           
            totalTimeStr = String.valueOf(totalTime);
           
            showDTimeLabel.setText(totalTimeStr + "ms");
        } 
        catch (Exception exception)
        {
          JOptionPane.showMessageDialog(this, "You must choose a file.");
        }
        catch (Throwable exception2)
        {
            exception2.printStackTrace();
        }
    }
 
    /**
     * Main method to run a program.
     */
    public static void main(String args[])
    {
        try
        {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(NewGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            Logger.getLogger(NewGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            Logger.getLogger(NewGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex)
        {
            Logger.getLogger(NewGUI.class.getName()).log(Level.SEVERE, null, ex);
        }        
 
        /*
         * Set the form visible.
         */
        EventQueue.invokeLater(new Runnable()
        {
 
            public void run()
            {
                new NewGUI().setVisible(true);
            }
        });
    }      
}