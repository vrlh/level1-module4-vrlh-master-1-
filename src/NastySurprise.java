import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
public static void main(String[] args) {
	System.out.println("hi");
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton trick = new JButton();
JButton treat = new JButton();
public void run() {
	frame.add(panel);
	panel.add(trick);
	panel.add(treat);
	
	frame.setVisible(true);
	
	trick.addActionListener(this);
	treat.addActionListener(this);
	
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == trick) {
		showPictureFromTheInternet(
				"https://ybxzcgnc7b-flywheel.netdna-ssl.com/wp-content/uploads/2017/11/cute.jpg");
	}
	if(e.getSource() == treat) {
		showPictureFromTheInternet("https://images.unsplash.com/"
				+ "photo-1509248961158-e54f6934749c?ixlib="
				+ "rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80");
	}
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame frame = new JFrame();
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
}
}
