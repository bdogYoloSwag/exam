import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.*;
public class DisplayPanel extends JPanel {

	//private char flag;
	private int width;
	private int height;
	
	public DisplayPanel() {
		//flag = ' ';
		width = 600;
		height = 400;
		setPreferredSize(new Dimension(width,height));
		setMinimumSize(new Dimension(width,height));
		
	}
	
	public  void buttonImages(){
		JButton [] slots = new JButton[3];
		Image question;
		question = getImage("mystery.gif");
		
		for(int i = 0; i<3;i++){
			slots[i] = new JButton(new ImageIcon(question));
		}
		
	}
	
	public Image getImage(String filename){
		
		URL url = getClass().getResource(filename);
		ImageIcon icon = new ImageIcon(url);
		return icon.getImage();
		
	}
	public static String chooseImage(String [] x){
		if(x.length<3){
			return x[0];
		}
		else if(x.length>=3){
			return x[x.length-1];
		}
		else if(x.length == 0){
			return null;
		}
		return null;
		
	}
	
	
	
}
