package Main;

import javax.swing.JFrame;

public class Game {
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Phoenix Game");
		window.setContentPane(new GamePanel());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		//window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.pack();
		window.setVisible(true);
		
	}
	
}
