package day04;

import javax.swing.JFrame;

public class StarFrame extends JFrame{
	//����
	//      ��������           ����С��
	private StarPanel starPanel;
	
	
	//������
	public StarFrame(){
		this.setTitle("������ V2.0");
		this.setSize(1024,768);
		this.setLocation(50, 50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		starPanel=new StarPanel();
		this.add(starPanel);
	}
	
	
	//��Ա����
	
	//�Ӹ���̳��˺ܶ෽��
	
	//setVisible(true);
	public void showMe(){
		
		this.setVisible(true);
		
		starPanel.action();
	}
	//������

	public static void main(String[] args) {
	
	    StarFrame window=new StarFrame();
	    window.setVisible(true);
	    window.showMe();
	}
}
