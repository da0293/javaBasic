import java.awt.Frame;
import java.awt.Graphics;

public class GameFrame extends Frame{
	@Override
	public void paint(Graphics g) {
		g.drawRect(100, 100, 200, 100);
		super.paint(g);
	}
}
