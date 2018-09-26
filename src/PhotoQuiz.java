/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Color;
import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select â€œCopy Image Addressâ€�)
String imageAdress = "file://sems-259-dc/Users/student/Desktop/blackHole.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component Image;
		// 3. use the "createImage()" method below to initialize your Component
Image = createImage(imageAdress);
		// 4. add the image to the quiz window

quizWindow.add(Image);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
JLabel label = new JLabel();
label.setForeground(Color.red);
label.setText("Why are black holes black?");
label.setHorizontalTextPosition(0);
quizWindow.add(label);
quizWindow.setExtendedState( quizWindow.getExtendedState()|JFrame.MAXIMIZED_BOTH );
String answer = JOptionPane.showInputDialog(quizWindow, "Type your answer here");
// 7. print "CORRECT" if the user gave the right answer
if(answer.trim().toLowerCase().equals("because the gravity is so strong it sucks up the light") ){
	JOptionPane.showMessageDialog(quizWindow, "CORRECT");
}	
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(quizWindow, "INCORRECT! DX<");
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(Image);
		// 10. find another image and create it (might take more than one line of code)

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





