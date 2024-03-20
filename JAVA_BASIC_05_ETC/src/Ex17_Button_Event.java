import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//이벤트 처리
class Btn_Handler implements ActionListener{
	//button 클릭하면 호출되는 함수 actionPerformed 
	// id 입력값 , pwd 입력값 검증
	TextField txtid;
	TextField txtpwd;
	
	Btn_Handler(TextField txtid , TextField txtpwd) {
		this.txtid = txtid;
		this.txtpwd = txtpwd;
				
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
		if(txtid.getText().equals("hong")) {
			System.out.println("방가 : " + " / " + txtpwd.getText());
		}else {
			System.out.println("잠자는 당신은 누구");
		}
		
	}
	
}

//로그인 창
class LoginForm extends Frame {
	Label lbl_id;
	Label lbl_pwd;
	TextField txt_id;
	TextField txt_pwd;
	Button btn_ok;
	
	LoginForm(String title) {
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
		btn_ok.addActionListener(new Btn_Handler(txt_id, txt_pwd));
		
	}
}
//이벤트 처리
public class Ex17_Button_Event {
	public static void main(String[] args) {
		
		LoginForm login = new LoginForm("로그인");
	}

}
