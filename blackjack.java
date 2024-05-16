import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class blackjack implements ActionListener {

    private int count = 0;

    private JLabel label;
    private JLabel imageField;
    private JFrame frame;
    private JButton button;
    private JPanel panel;
    private ImageIcon image;

    public blackjack() {
        frame = new JFrame();
        button = new JButton("Click me");
        button.addActionListener(this);

        label = new JLabel("Number of clicks: 0");



        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(400,400,400,400));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My GUI");
        frame.pack();
        frame.setVisible(true);
        try {
        image = new ImageIcon(getClass().getResource("4_of_hearts.svg.png"));
        imageField = new JLabel(image);
        frame.add(imageField);
        } catch (Exception e){
            return;
        }

    }
    public static void main(String[] args) {
        new blackjack();
        Image i = new image();   
    }
    public void actionPerformed(ActionEvent e){
        count++;
        label.setText("Number of clicks: " + count);
    }
}
