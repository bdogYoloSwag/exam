//https://github.com/bdogYoloSwag
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class SlotMachine extends JFrame {
	
	DisplayPanel slot;
	public SlotMachine(){
		slot= new DisplayPanel();
		add(slot, BorderLayout.CENTER);
		JPanel buttonPanel = new JPanel();
		
		
		 JButton image1 = new JButton();
		 JButton image2 = new JButton();
		 JButton image3 = new JButton();
		image1.setIcon(new ImageIcon("C:\\Users\\Aaron\\workspace\\501 exam\\mystery.gif"));
		image2.setIcon(new ImageIcon("C:\\Users\\Aaron\\workspace\\501 exam\\mystery.gif"));
		image3.setIcon(new ImageIcon("C:\\Users\\Aaron\\workspace\\501 exam\\mystery.gif"));
		
		JButton start = new JButton("Start");
		JButton stop = new JButton("Stop");
		
		buttonPanel.add(image1);
		buttonPanel.add(image2);
		buttonPanel.add(image3);
		buttonPanel.add(start);
		buttonPanel.add(stop);
		add(buttonPanel,BorderLayout.CENTER);
		
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int answer = changeImages();
				Image [] pics = new Image [5];
				
				pics[0] = slot.getImage("C:\\Users\\Aaron\\workspace\\501 exam\\bar.jpg");
				pics[1] = slot.getImage("C:\\Users\\Aaron\\workspace\\501 exam\\cherry.jpg");
				pics[2] = slot.getImage("C:\\Users\\Aaron\\workspace\\501 exam\\donut.jpg");
				pics[3] = slot.getImage("C:\\Users\\Aaron\\workspace\\501 exam\\star.jpg");
				pics[4] = slot.getImage("C:\\Users\\Aaron\\workspace\\501 exam\\lemon.jpg");
				
				//setIcon( new ImageIcon(pics[answer]));
				//setIcon( new ImageIcon(pics[answer]));
				//setIcon( new ImageIcon(pics[answer]));
				
				slot.repaint();
			}
		});
		stop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				slot.repaint();
			}
		});
		setVisible(true);
		setSize(400, 175);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public int changeImages(){
		
		
		Random rn = new Random();
		int answer = rn.nextInt(4);
		return answer;
		
	}
	public static void main(String[] args) {
		new SlotMachine();
	}
	
	

}
