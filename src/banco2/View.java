/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

/**
 *
 * @author fabian.giraldo
 */
public class View  extends JFrame{
    //Cada vista tiene su controlador.
    private Controller controller;
    
    //Variables de la vista.
    private JTextField field ;
    private JTextField field2;
    private JTextField field3;
    private JTextField field4;
    private JTextField field5;
    
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label;
    
    private  JButton button;
    
    public View(){
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
       setSize(new Dimension(400, 600));
       setLocationRelativeTo(null);
       setTitle("Calculator bank");
   
       this.label = new JLabel("Enter loan Amount, interest rate, and years: ");
       label.setBackground(Color.BLUE);
       setLayout(new BorderLayout());
       
       
       JPanel p1= new JPanel(new BorderLayout());
       p1.add(label);
       add(p1,BorderLayout.NORTH);
       
       JPanel panel= new JPanel(new GridLayout(5,2));
       
       this.label1  = new JLabel("Annual Interest Rate");
       
       this.label2 = new JLabel("Number of Years");
       this.label3 = new JLabel("Loan Amount");
       this.label4 = new JLabel("Monthly Payment");
       this.label5 = new JLabel("Total Payment");
       this.field= new JTextField(8);
       this.field2= new JTextField(8);
       this.field3= new JTextField(8);
       this.field4= new JTextField(8);
       this.field5= new JTextField(8);
       panel.add(label1);
       panel.add(field);
       panel.add(label2);
       panel.add(field2);
       panel.add(label3);
       panel.add(field3);
       panel.add(label4);
       panel.add(field4);
       panel.add(label5);
       panel.add(field5);
       field4.setVisible(false);
       field5.setVisible(false);

      
       this.button = new JButton("Compute Payment");
       JPanel boton= new JPanel(new BorderLayout());
       boton.add(button, BorderLayout.EAST);
       boton.setBorder(null);
       add(boton, BorderLayout.SOUTH);
       
       add(panel,BorderLayout.CENTER);
       pack();
       setVisible(true);
       
    }

    public JTextField getField2() {
        return field2;
    }

  

    public JTextField getField3() {
        return field3;
    }

 
    public JTextField getField4() {
        return field4;
    }

    public void setTextField4(String field4) {
        this.field4.setText(field4);
        this.field4.setVisible(true);
    }

    public JTextField getField5() {
        return field5;
    }

    public void setTextField5(String field5) {
        this.field5.setText(field5);
        this.field5.setVisible(true);
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
        this.button.addActionListener(this.controller);
    }

    public JTextField getField() {
        return field;
    }

    public void setField(JTextField field) {
        this.field = field;
    } 
}
