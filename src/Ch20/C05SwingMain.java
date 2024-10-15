package Ch20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C05GUI extends JFrame implements ActionListener,KeyListener,MouseListener{
	
	JButton btn1;
	JButton btn2;
	JTextField txt1;
	JTextArea arae1;
	
	C05GUI(){
		super("네번째 프레임입니다.");
		setBounds(100,100,500,500);
		
		//Panel생성
		JPanel panel = new JPanel();
		
		//버튼 추가
		btn1 = new JButton("BUTTON01");
		btn1.setBounds(10,10,100,30);
		btn1.addActionListener(this);
		btn2 = new JButton("BUTTON02");
		btn2.setBounds(120,10,100,30);
		btn2.addActionListener(this);
		
		//TextField추가
		txt1 = new JTextField();
		txt1.setBounds(10,50,210,30);
		txt1.addKeyListener(this);
		
		JTextField txt2 = new JTextField();
		txt2.setBounds(10,90,210,30);
		
		//TextArea추가
		arae1 = new JTextArea();
		arae1.setBounds(10,130,210,200);
		arae1.addMouseListener(this);
		
		//JScrollPane추가
		JScrollPane scroll1 = new JScrollPane(arae1);
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

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("CLICKED..."+e.getSource());
		if(e.getSource()==btn1) {
			System.out.println("BTN1 CLICKED");
		}
		if(e.getSource()==btn2) {
			System.out.println("BTN2  CLICKED");
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//키를 누르거나 뗏을떄
//		System.out.println("keyTyped..."+e.getKeyChar()+ " "+e.getKeyCode());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//키를 누를때
		System.out.println("keyPressed..."+e.getKeyChar()+ " "+e.getKeyCode());
		if(e.getSource()==txt1) {
			if(e.getKeyCode()==10) {
				String text = txt1.getText();
				arae1.append(text+"\n");
				txt1.setText("");
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//키를 뗏을때
//		System.out.println("keyReleased..."+e.getKeyChar()+ " "+e.getKeyCode());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("MOUSE CLICKED..." + e.getPoint());
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

public class C05SwingMain {

	public static void main(String[] args) {
		new C05GUI();
		System.out.println("keyTReleased...");
	}

}
