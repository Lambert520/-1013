package day04;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

//[Ctrl]+[o],�鿴���
//[ctrl]+[shift]+[t],����type����
public class StarPanel extends JPanel{
	
	//����
	
    private Star star;       //һ��
    private Color bgColor;   //������ɫ
    private Star[] stars;  //������� 
    private Image bgImage;
    private Moon moon;
    private EarthShadow earthShadow;
    
    //������/���캯�������췽��
    public StarPanel()
    {
    	//ʹ��ImageIcone���󣬴�Ӳ���м��ر���ͼƬ
    	
    	bgImage=new ImageIcon(
    	StarPanel.class.getResource("3.jpeg")).getImage();
    	star=new Star();//��������(��û������)
    	moon=new Moon();//��������(��û������)
    	earthShadow=new EarthShadow();
    	bgColor= new Color(0,0,0);//(r,g,b)->(red,green,blue)
                                   //�׹⣺��255W����ݣ�255W�̵��ݣ�255W�����ݣ�;
                                        //���⣺��0W   ,    0W   ,   255W);
    	                               //��ɫ����0W   ,    OW   ,   OW);
           //���ڴ��У������������20�����ǵĿռ�
    	stars=new Star[10];
    	//ʹ��forѭ������û��ÿ��λ�ã�����һ������
    	for(int i=0;i<stars.length;i++)
    	{
    		//����һ������
    		star=new Star();
    		//���մ��������ǣ����浽����ռ���
    		stars[i]=star;
    	}
    }      
    //��Ա����
    //�ý����е����嶯���� ����ͣ������һֱ������
    
    		
    		//�õ����Ӱ�Ӷ�һ��
    		//�ó���˯40����   1000����/25֡
    public void action()  
    {
    	while(true)
    	{   //��ÿ�����Ƕ�һ�£�step��һ��
    		for(int i=0;i<stars.length;i++)
    		{
    			Star star=stars[i];
    			star.step();
    			
    		}
             moon.Step();
    		try
    		{
			   Thread.sleep(40);
		    } 
    		catch (InterruptedException e) 
    		{                                  
			    e.printStackTrace();
		    }
    		repaint();
        }
     } 
    public void paint(Graphics g) {
    	super.paint(g);
    	//���õ�ǰ���ı���ɫ
    
    	this.setBackground(bgColor);
    	//�������ǵĹ��ܷ�������������
    	star.paint(g);
    	//��һ�ű���ͼƬ
    	g.drawImage(bgImage, 0, 0, 1024, 768, null);
    	moon.paint(g);
    	earthShadow.paint(g);
    	
    	//ʹ��forѭ����ȡ��������ÿ�����ǣ�������
    	for(int i=0;i<stars.length;i++)
    	{
    		//�����±꣬ȡ��ĳ������
    		Star star=stars[i];
    		//�����ǻ�����
    		star.paint(g);
	
    	}
    }
}
