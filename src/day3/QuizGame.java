package day3;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		int score=0;
		JOptionPane.showMessageDialog(null, "Welcome to the Doctor Who Quiz Game! \nDo not use punctuation or capitalization \nwhile answering the questions, please.");
		String q1= JOptionPane.showInputDialog("What should you NOT do when looking at a weeping angel?");
		if (q1.equalsIgnoreCase("blink")){
			score=score+1;
		}
		else{
			score=score;
		}
		String q2= JOptionPane.showInputDialog("What does the Doctor give River Song that \nends up 'saving' her life in Silence in the Library?");
		if (q2.equalsIgnoreCase("a sonic screwdriver") || q2.equalsIgnoreCase("sonic screwdriver")){
			score=score+1;
		}
		else{
			score=score;
		}
		String q3= JOptionPane.showInputDialog("What is the name (in english) of the place where the \nDoctor gives Rose a human version of himself?");
		if (q3.equalsIgnoreCase("bad wolf bay") || q3.equalsIgnoreCase("bad wolf")){
			score=score+1;
		}
		else{
			score=score;
		}
		String q4= JOptionPane.showInputDialog("What do the Ood call the Doctor and Donna?");
		if (q4.equalsIgnoreCase("DoctorDonna") || q4.equalsIgnoreCase("the DoctorDonna")){
			score=score+1;
		}
		else{
			score=score;
		}
		String q5= JOptionPane.showInputDialog("What do the Silence erase the second you look away?");
		if (q5.equalsIgnoreCase("your memory of them") || q5.equalsIgnoreCase("your memory of the encounter") || q5.equalsIgnoreCase("your memory") || q5.equalsIgnoreCase("memory")){
			score=score+1;
		}
		else{
			score=score;
		}
		String q6= JOptionPane.showInputDialog("What is the first sign that you will become one of the monsters from The Empty Child?");
		if (q6.equalsIgnoreCase("you have a scar on your hand") || q6.equalsIgnoreCase("a scar on your hand") || q6.equalsIgnoreCase("a scar") || q6.equalsIgnoreCase("scar") || q6.equalsIgnoreCase("your hand has a scar on it") || q6.equalsIgnoreCase("a scar on the back of your hand")){
			score=score+1;
		}
		else{
			score=score;
		}
		JOptionPane.showMessageDialog(null, "Your score is "+score+"/6. Thank you for playing \nthe Doctor Who Quiz Game!");
	}

}
