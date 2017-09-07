import java.applet.*;
import java.awt.*;

public class GraphicLine extends Applet
{
	public void paint(Graphics g){
		g.drawLine(10,10,100,10);
		g.drawLine(100,10,100,100);
		g.drawLine(10,10,10,100);
		g.drawLine(10,100,100,100);
		g.drawLine(10,10,100,100);
		g.drawLine(10,100,100,10);
	}
};