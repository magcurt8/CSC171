import javax.swing.JFrame;
import java.awt.Cursor;
import java.awt.Image;

import javax.swing.*;

public class Test 
{
public static void main(String[]args) 
{
	JFrame cardFrame=new JFrame("Pairs");
	CardsTable ct=new CardsTable();
	cardFrame.add(ct);
	cardFrame.setSize(500, 500);
	cardFrame.setResizable(false);
	cardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	cardFrame.pack();
	cardFrame.setCursor(Cursor.HAND_CURSOR);
	cardFrame.setVisible(true);
	//http://upload.wikimedia.org/wikipedia/commons/thumb/6/63/French_suits.svg/2000px-French_suits.svg.png
	ImageIcon logoicon=new ImageIcon("suits.png");
	Image logo=logoicon.getImage();
	cardFrame.setIconImage(logo);
	
}

}
