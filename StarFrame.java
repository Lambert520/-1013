package day04;

import javax.swing.JFrame;

public class StarFrame extends JFrame{
	//属性
	//      老婆类型           名字小丽
	private StarPanel starPanel;
	
	
	//构造器
	public StarFrame(){
		this.setTitle("满天星 V2.0");
		this.setSize(1024,768);
		this.setLocation(50, 50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		starPanel=new StarPanel();
		this.add(starPanel);
	}
	
	
	//成员方法
	
	//从父类继承了很多方法
	
	//setVisible(true);
	public void showMe(){
		
		this.setVisible(true);
		
		starPanel.action();
	}
	//主函数

	public static void main(String[] args) {
	
	    StarFrame window=new StarFrame();
	    window.setVisible(true);
	    window.showMe();
	}
}
