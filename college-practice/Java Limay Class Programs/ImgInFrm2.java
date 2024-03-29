import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.io.*;

class MyPanel extends Panel
{
	Image img;
	MyPanel()
	{
		super();
	}
	void setImage(Image img)
	{
		this.img=img;
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawImage(img,20,20,this);
	}
}


class ImgInFrm2 extends Frame
{
	Image img;
	MyPanel pan;
	ImgInFrm2()
	{
		super("Image");
		File f=new File("F:\\Images\\super\\53.jpg");
		try
		{
			img=ImageIO.read(f);
		}
		catch(Exception e){}
		pan=new MyPanel();
		add(pan);
		pan.setImage(img);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		setSize(800,800);
		setVisible(true);
	}
	
	public static void main(String []args)
	{
		ImgInFrm2 a=new ImgInFrm2();
	}

}