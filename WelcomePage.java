import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class WelcomePage implements ActionListener{

	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("Hello!");
	JButton logout = new JButton("logout");
	IDandPasswords login = new IDandPasswords();
	
	WelcomePage(String userID){
		
		welcomeLabel.setBounds(0,0,200,35);
		welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
		welcomeLabel.setText("Hello "+userID);
		
		logout.setBounds(120,200,80,25);
		logout.setFocusable(false);
		logout.addActionListener(this);
		
		frame.add(welcomeLabel);
		frame.add(logout);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == logout) {
			LoginPage loginPage = new LoginPage(login.getLoginInfo());
		}
	}
}