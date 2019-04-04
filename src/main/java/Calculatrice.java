import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculatrice {
    private JButton button1;
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button2;
    private JButton button3;
    private JTextField textField4;

    public Calculatrice() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                double displayResult =0;
                displayResult = Double.parseDouble(textField1.getText())+Double.parseDouble(textField2.getText());
                textField4.setText(Double.toString(displayResult));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculatrice");
        frame.setContentPane(new Calculatrice().panel1);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Integer Addition(int a, int b) {
        try {
            return a + b;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
