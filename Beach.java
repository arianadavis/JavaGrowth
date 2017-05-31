/******************************************************************************
 *  NAME:  Ariana M. Davis
 *  FSU ID:    amd14b
 ******************************************************************************/

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Color;

class BeachCanvas extends JComponent {

    //Here, takes one argument and returns nothing.
    public void paint(Graphics g) {
        
    	//Draws Sandy Brown Polygon 
    	Polygon a = new Polygon();
    	a.addPoint(0, 450);
    	a.addPoint(0, 630);
    	a.addPoint(630, 630);
    	a.addPoint(630, 450);
    	g.setColor(new Color(234, 206, 106));
    	g.fillPolygon(a);
    	
    	//Draws Sea Green Polygon 
    	Polygon b = new Polygon();
    	b.addPoint(0, 300);
    	b.addPoint(0, 450);
    	b.addPoint(630, 450);
    	b.addPoint(630, 300);
    	g.setColor(new Color(32, 178, 170));
    	g.fillPolygon(b);
    	
    	//Draws Sky Blue Polygon 
    	Polygon c = new Polygon();
    	c.addPoint(0, 0);
    	c.addPoint(0, 300);
    	c.addPoint(630, 300);
    	c.addPoint(630, 0);
    	g.setColor(new Color(0, 191, 255));
    	g.fillPolygon(c);
    	
    	//Draws Yellow Circle 
    	g.setColor(new Color(255, 255, 0));
    	g.fillOval(100, 100, 80, 80);
    	
    	//Draws Red Arc Section
    	g.setColor(Color.RED);
    	g.fillArc(400, 400, 200, 125, 330, 190);
         
      	//Draws Light Gray Polygon 
     	Polygon d = new Polygon();
     	d.addPoint(540, 405);
     	d.addPoint(449, 452);
     	d.addPoint(560, 485);
     	g.setColor(new Color(252, 252, 252));
     	g.fillPolygon(d);
     	
     	//Draws Dark Brown Polygon 
     	Polygon e = new Polygon();
     	e.addPoint(497, 466);
     	e.addPoint(450, 570);
     	e.addPoint(460, 580);
     	e.addPoint(510, 470);
     	g.setColor(new Color(140, 45, 13));
     	g.fillPolygon(e);
   
}
}

public class Beach{
	public static void main(String[] args) {
        //Create a frame
        JFrame window = new JFrame();
        
        //Make it so that the program dies when we click on the close button
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Set the boundaries of the window
        window.setBounds(30, 30, 630, 630);
        
        //Attach the Canvas we just described to the window
        window.getContentPane().add(new BeachCanvas());
        
        //make the window visible
        window.setVisible(true);
    }  
} 