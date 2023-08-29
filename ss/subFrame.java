import java.awt.*;
import java.awt.event.*;

public class subFrame extends Frame implements ActionListener{
	TextField tf1,tf2,tf3;
	Button btn;
	subFrame(){
		tf1 = new TextField();
		tf2 = new TextField();
		tf3 = new TextField();
		tf3.setEditable(false);
		btn = new Button("Find their Difference!");

		add(new Label("Enter a number: "));
		add(tf1);
		add(new Label("Enter another one: "));
		add(tf2);
		add(new Label("Difference:"));
		add(tf3);
		add(btn);
		btn.addActionListener(this);

		setTitle("Find the Difference!");
		setSize(550,100);
		setLayout(new FlowLayout());
		setVisible(true);

		//closable frame
		addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });
	}	
	public void actionPerformed(ActionEvent ae){
		int a = Integer.parseInt(tf1.getText());
		int b = Integer.parseInt(tf2.getText());
		int sub=0;
		if (ae.getSource()==btn){
			tf3.setText(String.valueOf(a-b));
		}
		
	}
	public static void main(String args[]){
		new subFrame();	
	}
}