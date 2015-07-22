
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class CryptoGraphy extends JFrame {

	private static final long serialVersionUID = 1L;

	public CryptoGraphy() {
		JFrame frame = new JFrame("JFileChooser Popup");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    JFileChooser fileChooser = new JFileChooser(".");
	    fileChooser.setControlButtonsAreShown(false);
	    frame.add(fileChooser, BorderLayout.CENTER);

	    ActionListener actionListener = new ActionListener() {
	      public void actionPerformed(ActionEvent actionEvent) {
	        JFileChooser theFileChooser = (JFileChooser) actionEvent.getSource();
	        String command = actionEvent.getActionCommand();
	        if (command.equals(JFileChooser.APPROVE_SELECTION)) {
	          File selectedFile = theFileChooser.getSelectedFile();
	          System.out.println(selectedFile.getParent());
	          System.out.println(selectedFile.getName());
	        } else if (command.equals(JFileChooser.CANCEL_SELECTION)) {
	          System.out.println(JFileChooser.CANCEL_SELECTION);
	        }
	      }
	    };
	    fileChooser.addActionListener(actionListener);
	    frame.pack();
	    frame.setVisible(true);
		

	}
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt){
		
		System.out.print("Hello");
		int returnVal = jFileChooser1.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            File file = jFileChooser1.getSelectedFile();
            if (!file.canRead()) {
                file.setReadable(true);
            }

            // display file name in text field
            jTextField1.setText(file.getAbsolutePath());

        } else
        {
            System.out.println("You must choose a file.");
        }
		
	}
	private static void createAndShowGUI() {

  //Create and set up the window.

  JFrame frame = new CryptoGraphy();

  //Display the window.

  frame.pack();

  frame.setVisible(true);

  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

	public static void main(String[] args) {

  //Schedule a job for the event-dispatching thread:

  //creating and showing this application's GUI.

  javax.swing.SwingUtilities.invokeLater(new Runnable() {

public void run() {

    createAndShowGUI(); 

}

  });
    }
	 private javax.swing.JFileChooser jFileChooser1;
	 private javax.swing.JTextField jTextField1;
}