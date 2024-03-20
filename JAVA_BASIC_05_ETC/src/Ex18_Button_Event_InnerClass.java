import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//이벤트 처리


//로그인 창
class LoginForm2 extends Frame {
	Label lbl_id;
	Label lbl_pwd;
	TextField txt_id;
	TextField txt_pwd;
	Button btn_ok;
	
	LoginForm2(String title) {
		super(title);
		lbl_id = new Label("ID:" ,Label.RIGHT);
		lbl_pwd = new Label("PWD:" ,Label.RIGHT);
		
		txt_id = new TextField(10);
		txt_pwd= new TextField(10);
		txt_pwd.setEchoChar('*');
		btn_ok = new Button("login");
		
		this.setLayout(new FlowLayout()); //순서 ...
		this.setSize(500, 100);
		this.setVisible(true);
		
		this.add(lbl_id);
		this.add(txt_id);
		
		this.add(lbl_pwd);
		this.add(txt_pwd);
		
		this.add(btn_ok);
		
		//inner class  (코드의 간소화)
		//outter 클래스 자원접근 용이 
		class Btn_Handler2 implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getSource());
				if(txt_id.getText().equals("hong")) {
					System.out.println("방가 : " + " / " + txt_pwd.getText());
				}else {
					System.out.println("잠자는 당신은 누구");
				}
				
			}
			
		}
		
		
		btn_ok.addActionListener(new Btn_Handler(txt_id, txt_pwd));
		
		this.addWindowListener(new WindowListener() { //WindowListener 익명객체로 
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose(); //메모리 해제
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
}
//이벤트 처리
public class Ex18_Button_Event_InnerClass {
	public static void main(String[] args) {
		
		LoginForm2 login = new LoginForm2("로그인");
	}

}
