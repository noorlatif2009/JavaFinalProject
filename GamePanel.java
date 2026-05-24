import java.awt.Graphics;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
    public GamePanel()
    {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e){

            }

            @Override
            public void keyPressed(KeyEvent e){
                
            }

            @Override
            public void keyReleased(KeyEvent e){
                
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) // redraw frame
    {
        super.paintComponent(g);

        g.fillRect(100, 100, 200, 50); // draws the screen
    }
}
