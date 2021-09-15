package servlet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculatorProject extends JFrame{
	 JLabel l1,l2,l3,l4;
	 JTextField t1,t2;
	 JButton b1,b2,b3,b4;
	   void setComponent()
	 {
		l1=new JLabel("Calculator");	
		l2=new JLabel("First Number");	
		l3=new JLabel("Second Number");	
		l4=new JLabel();	
		t1=new JTextField();
		t2=new JTextField();
		b1=new JButton("Add");
		b2=new JButton("Sub");
		b3=new JButton("Multi");
		b4 =new JButton("Div");
		
		
		b1.addActionListener(new Handler());
		b2.addActionListener(new Handler1());
		b3.addActionListener(new Handler2());
		b4.addActionListener(new Handler3());
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(b1);
		add(l4);
		add(b2);
		add(b3);
		add(b4);
		
		
		setLayout(null);
		l1.setBounds(150, 30, 400, 30);
		l2.setBounds(50, 90, 100, 50);
		t1.setBounds(200, 100, 100, 30);
		l3.setBounds(50,130 , 100, 50);
		t2.setBounds(200,140 , 100, 30);
		b1.setBounds(5, 190, 100, 30);
		b2.setBounds(100,190,100,30);
		b3.setBounds(200,190,100,30);
		b4.setBounds(300,190,100,30);
		l4.setBounds(180, 220, 200, 60);
		
			
			
     }
	   
	    class Handler implements ActionListener
	   {
		 

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int s=a+b;
		 l4.setText(" Addition is "+s);
		
		}
		
	   }
	    
	    class Handler1 implements ActionListener
	   {
		 

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			 int l=a-b;
			l4.setText(" Substraction is "+l);
			
		}
		
	   }
	    
	    class Handler2 implements ActionListener
	   {
		 

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			 int m=a*b;
					
			l4.setText(" multiplication is "+m);
		}
		
	   }
	    
	    class Handler3 implements ActionListener
	   {
		 

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			try {
			 int n=a/b;
			 l4.setText(" Division "+n);
			}catch(Exception e1)
			{
				System.out.println("Enter no Greater Than Zero!");
				l4.setText("Enter Second No greater than zero!!");
				e1.printStackTrace();
			}
			
		}
		
	   }

	CalculatorProject(String string)
	{
	    super(string);	
	}
	 public void setcomponent()
	 {
		 
	 }
	public static void main(String[] args) {
		CalculatorProject jfClassServlet1=new CalculatorProject("Swingg");
		jfClassServlet1.setSize(400,400);
		jfClassServlet1.setVisible(true);
		jfClassServlet1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfClassServlet1.setComponent();
		
      
	}
	
}
