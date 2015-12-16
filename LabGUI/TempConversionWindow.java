import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JTextField t;

    public TempConversionWindow() {
	this.setTitle("Temperature Conversion");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	JButton b = new JButton("toC");
	b.addActionListener(this);
	b.setActionCommand("ConvC");
	JButton b2 = new JButton("toF");
	b2.addActionListener(this);
	b2.setActionCommand("ConvF");

	t = new JTextField(10);
	j = new JLabel("Temperature");
	
	pane.add(j);
	pane.add(t);
	pane.add(b);
	pane.add(b2);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	String s = t.getText();
	//double temp = s.parseDouble(s); 
	if(event.equals("ConvF")){
	    j.setText(s);
	}

	if(event.equals("ConvC")){
	    j.setText(s);
	}
 
 
    }
}