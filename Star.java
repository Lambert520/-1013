package day04;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

public class Star {
   //属性：成员变量，对象的特征（名词）
	private Image image;
	private int x;
	private int y;
	
	private int stepX;//横坐标方向一次移动的像素个数
	private int stepY;//纵坐标方向一次移动的像素个数
	
	//构造器，在创建对象的时候，给属性赋值
	//构造的过程：从胚胎到婴儿的过程
	//Random rd=new Random();
	//创建对象，调用的是一个没有参数的构造器
	//构造器，一个特殊的函数，函数名和类名一样
	public Star(){
		//在构造的过程中，暂时还没有给对象起名字
		//暂时用this作为对象的名字
		//this可读作为当前这个对象
		this.image=new ImageIcon(Star.class.getResource("star.jpeg")).getImage();
		//加载图片的过程，了解即可（day17详解）
		//将硬盘中的图片文件——>java世界中Image对象
		//使用随机数工具，生成随机数作为星星的坐标
		Random rd=new Random();
		this.x=rd.nextInt(800);
		this.y=rd.nextInt(300);
		
		this.stepX =5;
		this.stepY =3;//[0,2)=0,1
		                        //1+[0，2]=1,2
	}
	Random rd=new Random();
	private int index=0;
	//private int f=1;
	private int time=80+rd.nextInt(40);
	//用于控制星星左右移动的方向
	//f可以取值的范围是：[0,3)-1={-1,0,1}
	private int f=rd.nextInt(40)-1;
	//让星星走一步，根据stepX stepY移动
	public void step()
	{        // int f=rd.nextInt(10)>5?1:-1;
		     //x += stepX*f;
		//假设 time=80,80*40=3200毫秒
		//即，每隔3.2秒，将星星的移动方向改变一下
		
	    //if(index++%time==0)
	      {   
	    	//index++;
	    	//f*=-1;
	    }
		x +=stepX;
		y += stepY;
		//如果星星跑到下面去了，再重新回来
		if(x>1024)
		{
			x=0;
		}
	}
	
	
	
	//功能成员方法
	//画星星的方法
	public void paint(Graphics g){
		g.drawImage(image, x, y, 80, 80,null);
		//使用图片贴图：图片对象，贴的位置x,y,空即可
		
	}
	/*
	//测试完后删除
	public static void main(String[] args) {
		Star star=new Star();
		System.out.println(star);
		//day04.Star@214c265e
		//对象的类型@内存对象的哈希地址值
	}
	*/
}
