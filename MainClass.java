//package Break_Broker_Game;

import javax.swing.JFrame;

public class MainClass {
	
	public static void main(String[] args) {
		
		JFrame f=new JFrame();
		f.setTitle("Sriek Breaker");
		f.setSize(700,600);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setResizable(false);
		
		GamePlay gameplay=new GamePlay();
		f.add(gameplay);
	}
}