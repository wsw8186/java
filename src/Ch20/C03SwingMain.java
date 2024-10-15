package Ch20;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

class C03GUI extends JFrame{
	C03GUI(){
		super("세번째 프레임입니다.");
		setBounds(100,100,500,500);

		//Panel생성
		JPanel panel = new JPanel();
		
		//배경색 설정
		Color col = new Color(233,233,15);
		panel.setBackground(col);
		
		//Panel을 Frame에 추가
		add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}


public class C03SwingMain {

	public static void main(String[] args) {
		new C03GUI();

	}

}
