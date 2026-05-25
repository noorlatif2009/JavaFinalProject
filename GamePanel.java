package Main;

import Inputs.MouseInputs;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
    private MouseInputs mouseInputs;
    private GamePanel thisPanel = this;
    private int xDelta;
    private int yDelta;

    public GamePanel()
    {
        mouseInputs = new MouseInputs(thisPanel);
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }


    public void changeX(int value){
        this.xDelta+=value;
        repaint();
    }

    public void changeY(int value){
        this.yDelta+=value;
        repaint();
    }

    public void setRectPos(int x, int y)
    {
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) // redraw frame
    {
        super.paintComponent(g);

        g.fillRect(xDelta, yDelta, 200, 50); // draws the screen
    }
}
