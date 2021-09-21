package flappyBird;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class FlappyBird implements ActionListener
{

	public static FlappyBird flappyBird;
	
	public final int WIDTH = 800, HEIGHT = 800;
	
	public Renderer renderer;
	
	
	public FlappyBird()
	{
		JFrame jframe = new JFrame();
		Timer timer = new Timer(20, this);
		
		
		renderer = new Renderer();
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(WIDTH, HEIGHT);
		jframe.setResizable(false);
		jframe.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		renderer.repaint();
	}
	
	public void repaint(Graphics g) 
	{
		System.out.print("hello");
		
	}
	
	public static void main(String[] args) 
	{
		flappyBird = new FlappyBird();
	}


	
}
