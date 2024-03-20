import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends Frame{
	MyFrame(String title) {
		super(title);
	}
}

//익명 타입을 쓰지 않는 경우에 대한 이벤트 처리
class BtnClickHandler  implements ActionListener{
	//버튼에 클릭 이벤트가 발생하면 자동 호출되는 함수 (actionPerformed)
	@Override
	public void actionPerformed(ActionEvent e) { //추상 함수 강제
		System.out.println(" 나 클릭2 되었니 ");

	}
	
}


public class Ex16_awt_Frame {
	public static void main(String[] args) {
		MyFrame my = new MyFrame("Login");
		my.setSize(350, 300);
		my.setVisible(true);
		my.setLayout(new FlowLayout());
		
		//컴포넌트 ...
		Button btn = new Button("one button");
		Button btn2 = new Button("two button");
		Button btn3 = new Button("three button");
		
		
		//익명객체 (익명타입) : 1회성 ...
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("인터페이스  익명 객체 구현 이름없는... 재사용 불가능(1회성)");
				
			}
		});
		
		
		BtnClickHandler handler = new BtnClickHandler();
		btn2.addActionListener(handler); 
		//ActionListener 구현하고 있는 객체의 주소 (다형성)
		//btn2 버튼을 클릭하면 actionPerformed 호출....
		
		my.add(btn);
		my.add(btn2);
		my.add(btn3);

	}

}
