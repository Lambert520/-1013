package day04;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

public class EarthShadow {


	private Image image;
	private int x=0;
	private int y=0;

	private int stepX;
	private int stepY;
	public EarthShadow(){
		
		this.image=new ImageIcon(EarthShadow.class.getResource("2.png")).getImage();
	
		Random rd=new Random();
		x=500;
		y=100;
		//this.stepX=5;
		//this.stepY=3;
	}
	//public void Step(){
	   //x += stepX;
		//if(x>1024){
			//x=0;
			//}
	 //}
	public void paint(Graphics g){
		g.drawImage(image, x, y,200,200, null);
	}
}
