/*
* Name : Toufiqul Islam
* Roll : 1910876107
* Session : 2018-2019
*
* */


import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;


public class ObserverPatternDemo extends JFrame implements DocumentListener {
    static JLabel binary, octal, hex;
    private JLabel invalid;
    private static Subject subject;
    private JTextField input;

    private ObserverPatternDemo(){
        initComponents();
    }

    public static void main(String[] args) {
        ObserverPatternDemo frame = new ObserverPatternDemo();
         subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Observer Pattern Demo");
        frame.setLayout(null);
        frame.setBackground(Color.GRAY);
        frame.setBounds(100,50,500,250);
        frame.setVisible(true);
    }

    private void initComponents() {

        binary = new JLabel("Binary");
        binary.setHorizontalAlignment(0);
        binary.setBounds(30,50,200,50);


        octal = new JLabel("Octal");
        octal.setHorizontalAlignment(0);
        octal.setBounds(250,50,100,50);

        hex = new JLabel("Hex");
        hex.setHorizontalAlignment(0);
        hex.setBounds(370,50,100,50);

        invalid = new JLabel("");
        invalid.setHorizontalAlignment(0);
        invalid.setBounds(50,150,100,50);


        input = new JTextField("");
        input.setHorizontalAlignment(0);
        input.setBounds(200,150,100,50);
        input.getDocument().addDocumentListener(this);

        this.add(binary);
        this.add(octal);
        this.add(hex);
        this.add(input);
        this.add(invalid);


    }


    @Override
    public void insertUpdate(DocumentEvent e) {
        try{
            invalid.setText(null);
            subject.setState(Integer.parseInt(input.getText()));
        }catch (Exception ei){
           invalid();
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        try{
            if(input.getText().equals("")){
                invalid.setText(null);
                input.setText(null);
                binary.setText("Binary");
                octal.setText("Octal");
                hex.setText("Hex");
            }else{
                invalid.setText(null);
                subject.setState(Integer.parseInt(input.getText()));
            }

        }catch (Exception ei){
           invalid();
        }
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        try{
            invalid.setText(null);
            subject.setState(Integer.parseInt(input.getText()));
        }catch (Exception ei){
           invalid();
        }
    }
    private void invalid(){
        invalid.setText("Invalid!");
        binary.setText("Binary");
        octal.setText("Octal");
        hex.setText("Hex");

    }
}
