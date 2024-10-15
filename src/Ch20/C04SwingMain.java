package Ch20;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C04GUI extends JFrame{
	C04GUI(){
		super("네번째 프레임입니다.");
		setBounds(100,100,500,500);
		
		//Panel생성
		JPanel panel = new JPanel();
		
		//버튼 추가
		JButton btn1 = new JButton("BUTTON01");
		btn1.setBounds(10,10,100,30);
		JButton btn2 = new JButton("BUTTON02");
		btn2.setBounds(120,10,100,30);
		
		//TextField추가
		JTextField txt1 = new JTextField();
		txt1.setBounds(10,50,210,30);
		JTextField txt2 = new JTextField();
		txt2.setBounds(10,90,210,30);
		
		//TextArea추가
		JTextArea area1 = new JTextArea();
		area1.setBounds(10,130,210,200);
		
		//JScrollPane추가
		JScrollPane scroll1 = new JScrollPane(area1);
		scroll1.setBounds(10,130,210,200);
		
		//컴포넌트를 Panel에 추가
		panel.add(btn1);
		panel.add(btn2);
		panel.add(txt1);
		panel.add(txt2);
//		panel.add(area1);
		panel.add(scroll1);
		
		//panel의 Layout을 초기화
		panel.setLayout(null);
		
		//Panel을 Frame에 추가
		add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}

public class C04SwingMain {

	public static void main(String[] args) {
		new C04GUI();

	}

}
