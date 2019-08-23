import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JPasswordFieldDemo extends JFrame {
	JTextField username;
	JPasswordField password;
	JButton logonButton;
	JButton cancelButton;

	public JPasswordFieldDemo() {
		super("JPasswordField演示");
		Container container=getContentPane();
		container.setLayout(new GridLayout(3,2,2,2));

		username=new JTextField(16);
		password=new JPasswordField(16);
		logonButton=new JButton("登录");
		logonButton.addActionListener(
			new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				char[] pw=password.getPassword();
				String message="用户名"+username.getText()+"\n 密码："+new String(pw);
				JOptionPane.showMessageDialog(JPasswordFieldDemo.this,message);
			}
			});
		cancelButton=new JButton("退出");
		cancelButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					System.exit(0);
				}
			});

		container.add(new JLabel("用户名"));
		container.add(username);
		container.add(new JLabel("密码："));
		 container.add(password);
		 container.add(logonButton);
		 container.add(cancelButton);
		 setResizable(false);
		 setSize(300,200);
		 setVisible(true);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JPasswordFieldDemo();
	}
}