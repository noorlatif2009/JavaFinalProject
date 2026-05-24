import javax.swing.JFrame;
public class GameWindow
{
    private JFrame jframe;
    public GameWindow(GamePanel panel)
    {
        jframe = new JFrame();
        jframe.setSize(400, 400);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(panel);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }
}