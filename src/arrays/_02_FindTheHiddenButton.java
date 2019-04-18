/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	JButton[] ja;
	//1. create an array of JButtons. Don't initialize it yet.

	//2 create an int variable called hiddenButton
	int hiddenButton;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.add(panel);
		//3.  Ask the user to enter a positive number and convert it to an int
		int l=Integer.parseInt(JOptionPane.showInputDialog("enter a number between 1 and 72(inclusive)"));
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		 ja=new JButton[l];
		//5. Make a for loop to iterate through the JButton array
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		for (int i = 0; i < ja.length; i++) {
			ja[i]=new JButton();
			ja[i].addActionListener(this);
		panel.add(ja[i]);
		}
		
		//9 add the panel to the window
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.pack();
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		JOptionPane.showMessageDialog(null, "Click the hidden button!");
		//11. set the JFrame to visible.
		
		//12. Give the user the instructions for the game.
		
		//13. initialize the hiddenButton variable to a random number less than the int created int step 3
		Random r=new Random();
		hiddenButton=r.nextInt(l);
		//14. Set the text of the JButton located at hiddenButton the read "ME"
ja[hiddenButton].setText("I AM D HIDDEN BUTTON");
		//15. Use Thread.sleep(1000); to pause the program.
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}		
//    Surround it with a try/catch - use Eclipse helper for this
		
		//16. Set the text of the JButton located at hiddenButton to be blank.
ja[hiddenButton].setText(null);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		if(buttonClicked==ja[hiddenButton]) {
			JOptionPane.showMessageDialog(null, "Found the hidden button!");
		}else {
			JOptionPane.showMessageDialog(null, "Try again");
		}
		//17. if the hiddenButton is clicked, tell the user that they win.
		
		//18. else tell them to try again
	}
}
