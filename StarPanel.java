package day04;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

//[Ctrl]+[o],查看大纲
//[ctrl]+[shift]+[t],搜索type类型
public class StarPanel extends JPanel{
	
	//属性
	
    private Star star;       //一颗
    private Color bgColor;   //背景颜色
    private Star[] stars;  //多颗星星 
    private Image bgImage;
    private Moon moon;
    private EarthShadow earthShadow;
    
    //构造器/构造函数，构造方法
    public StarPanel()
    {
    	//使用ImageIcone对象，从硬盘中加载背景图片
    	
    	bgImage=new ImageIcon(
    	StarPanel.class.getResource("3.jpeg")).getImage();
    	star=new Star();//创建星星(还没画出来)
    	moon=new Moon();//创建月亮(还没画出来)
    	earthShadow=new EarthShadow();
    	bgColor= new Color(0,0,0);//(r,g,b)->(red,green,blue)
                                   //白光：（255W红灯泡，255W绿灯泡，255W蓝灯泡）;
                                        //蓝光：（0W   ,    0W   ,   255W);
    	                               //黑色：（0W   ,    OW   ,   OW);
           //在内存中，分配可以容纳20颗星星的空间
    	stars=new Star[10];
    	//使用for循环，给没给每个位置，设置一个星星
    	for(int i=0;i<stars.length;i++)
    	{
    		//创建一个星星
    		star=new Star();
    		//将刚创建的星星，保存到数组空间中
    		stars[i]=star;
    	}
    }      
    //成员方法
    //让界面中的物体动起来 （别停下来！一直动！）
    
    		
    		//让地球的影子动一下
    		//让程序睡40毫秒   1000毫秒/25帧
    public void action()  
    {
    	while(true)
    	{   //让每个星星动一下，step走一步
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
    	//设置当前面板的背景色
    
    	this.setBackground(bgColor);
    	//调用星星的功能方法，画出星星
    	star.paint(g);
    	//贴一张背景图片
    	g.drawImage(bgImage, 0, 0, 1024, 768, null);
    	moon.paint(g);
    	earthShadow.paint(g);
    	
    	//使用for循环，取出数组中每颗星星，画出来
    	for(int i=0;i<stars.length;i++)
    	{
    		//根据下标，取出某颗星星
    		Star star=stars[i];
    		//将星星画出来
    		star.paint(g);
	
    	}
    }
}
