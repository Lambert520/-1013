package day04;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

public class Star {
   //���ԣ���Ա��������������������ʣ�
	private Image image;
	private int x;
	private int y;
	
	private int stepX;//�����귽��һ���ƶ������ظ���
	private int stepY;//�����귽��һ���ƶ������ظ���
	
	//���������ڴ��������ʱ�򣬸����Ը�ֵ
	//����Ĺ��̣�����̥��Ӥ���Ĺ���
	//Random rd=new Random();
	//�������󣬵��õ���һ��û�в����Ĺ�����
	//��������һ������ĺ�����������������һ��
	public Star(){
		//�ڹ���Ĺ����У���ʱ��û�и�����������
		//��ʱ��this��Ϊ���������
		//this�ɶ���Ϊ��ǰ�������
		this.image=new ImageIcon(Star.class.getResource("star.jpeg")).getImage();
		//����ͼƬ�Ĺ��̣��˽⼴�ɣ�day17��⣩
		//��Ӳ���е�ͼƬ�ļ�����>java������Image����
		//ʹ����������ߣ������������Ϊ���ǵ�����
		Random rd=new Random();
		this.x=rd.nextInt(800);
		this.y=rd.nextInt(300);
		
		this.stepX =5;
		this.stepY =3;//[0,2)=0,1
		                        //1+[0��2]=1,2
	}
	Random rd=new Random();
	private int index=0;
	//private int f=1;
	private int time=80+rd.nextInt(40);
	//���ڿ������������ƶ��ķ���
	//f����ȡֵ�ķ�Χ�ǣ�[0,3)-1={-1,0,1}
	private int f=rd.nextInt(40)-1;
	//��������һ��������stepX stepY�ƶ�
	public void step()
	{        // int f=rd.nextInt(10)>5?1:-1;
		     //x += stepX*f;
		//���� time=80,80*40=3200����
		//����ÿ��3.2�룬�����ǵ��ƶ�����ı�һ��
		
	    //if(index++%time==0)
	      {   
	    	//index++;
	    	//f*=-1;
	    }
		x +=stepX;
		y += stepY;
		//��������ܵ�����ȥ�ˣ������»���
		if(x>1024)
		{
			x=0;
		}
	}
	
	
	
	//���ܳ�Ա����
	//�����ǵķ���
	public void paint(Graphics g){
		g.drawImage(image, x, y, 80, 80,null);
		//ʹ��ͼƬ��ͼ��ͼƬ��������λ��x,y,�ռ���
		
	}
	/*
	//�������ɾ��
	public static void main(String[] args) {
		Star star=new Star();
		System.out.println(star);
		//day04.Star@214c265e
		//���������@�ڴ����Ĺ�ϣ��ֵַ
	}
	*/
}
