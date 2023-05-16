package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PantallaHolaMundo extends JDialog implements ActionListener {


    private JButton boton2;
    private JLabel label1;

    private JPanel panel;



    public PantallaHolaMundo(HolaMundo2 parent, boolean modal) {

        super();

        setSize(500,500);
        setTitle("Hola mundo");
        setLocationRelativeTo(null);


        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        this.getContentPane().add(panel);


        label1 = new JLabel();
        label1.setText("HOLA MUNDO");
        label1.setSize(115,60);
        label1.setLocation(200,30);
        label1.setOpaque(false);
        panel.add(label1);

        boton2 = new JButton("Volver");
        boton2.setBounds(135,110,200,40);
        panel.add(boton2);

        boton2.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton2) {

            setVisible(false);
        }
    }


}