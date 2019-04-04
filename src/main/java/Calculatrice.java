import net.miginfocom.swing.MigLayout;

import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Thu Apr 04 13:05:14 CEST 2019
 */



/**
 * @author unknown
 */
public class Calculatrice extends JPanel {
    public Calculatrice() {
        initComponents();
    }

    private void button4ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button4MouseClicked(MouseEvent e) {
        String field1 = textField1.getText();
        String field2 = textField2.getText();
        float getField1;
        float getField2;
        try{
            getField1 = Float.parseFloat(field1);
            getField2 = Float.parseFloat(field2);
        }catch(NumberFormatException a){
            a.printStackTrace();
        }



    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Vitis
        label1 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        button4 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button1 = new JButton();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("Calculatrice");
        add(label1, "cell 5 0 1 2");
        add(textField1, "cell 4 4");
        add(textField2, "cell 6 4");

        //---- textField3 ----
        textField3.setEditable(false);
        add(textField3, "cell 5 7");

        //---- button4 ----
        button4.setText("Addition");
        button4.addActionListener(e -> button4ActionPerformed(e));
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button4MouseClicked(e);
            }
        });
        add(button4, "cell 1 8");

        //---- button2 ----
        button2.setText("Soustraction");
        add(button2, "cell 4 8");

        //---- button3 ----
        button3.setText("Muliplication");
        add(button3, "cell 6 8");

        //---- button1 ----
        button1.setText("Division");
        add(button1, "cell 7 8");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Vitis
    private JLabel label1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button4;
    private JButton button2;
    private JButton button3;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
