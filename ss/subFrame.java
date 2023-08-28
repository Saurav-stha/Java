import java.awt.*;
import java.awt.event.*;

public class subFrame extends Frame implements ActionListener{
	Label l1,l2;
	TextField tf1,tf2,tf3;
	Button btn;
	subFrame(){
		// Frame frame = new Frame("sub of two and result in another one");

		// frame.setSize(400,400);
		// frame.setVisible(true);

		 l1 = new Label("Enter a number: ");
		 l1.setBounds(10,50,100,50);
		 l2 = new Label("Enter another one: ");
		 l2.setBounds(10,150,100,50);
		 tf1 = new TextField();
		 tf1.setBounds(150,50,50,50);
		 tf2 = new TextField();
		 tf2.setBounds(150,150,50,50);
		 tf3 = new TextField("Difference");
		 tf3.setBounds(50,250,50,50);
		 tf3.setEditable(false);
		 btn = new Button("Find their Difference!");
		 btn.setBounds(100,310,200,50);

		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(tf3);
		add(btn);
		btn.addActionListener(this);

		setSize(600,600);
		setLayout(null);
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
			sub=a-b;
		}
		tf3.setText(String.valueOf(sub));
	}
	public static void main(String args[]){
		new subFrame();	
	}
}