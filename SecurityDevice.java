package bored;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class SecurityDevice extends SD implements ActionListener{
		protected int unlock;
		protected int lock;
		protected JLabel l;
		
		public SecurityDevice() {
			JFrame f = new JFrame();
			JButton button = new JButton("Run");
			l = new JLabel("Press Button");
			JPanel p = new JPanel();
			button.addActionListener(this);
			p.setLayout(new GridLayout());
			p.setBorder(BorderFactory.createEmptyBorder(150, 150, 150, 100));
			p.add(l);
			p.add(button);
			f.add(p, BorderLayout.CENTER);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setVisible(true);
			f.setTitle("Security Device");
			f.setSize(500,500);
		}
		public static void main(String[]args) {
			new SecurityDevice();
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			SD key = new SD();
			Random r = new Random();
			boolean a = true;
			int c = 0;
		
			try {
			do {
				
				int randNum = r.nextInt(1000000000);
				//int ra = Integer.parseInt(JOptionPane.showInputDialog(randNum));
			
			
				if (Integer.toString(randNum).toLowerCase().contains(Integer.toString(key.lock).toLowerCase())) {
						s = "Locked";
						break;
				}
				if(Integer.toString(randNum).toLowerCase().contains(Integer.toString(key.unlock).toLowerCase())) {
						s = "Unlocked";
						break;
				}
				c++;
				
			} while(a);
				} catch(Exception j) {
			System.out.println("Never Found");
				}
			l.setText("<html>Status: " + s + ".<br>It took: " + c + " seconds to solve");
		}
}
		
	



