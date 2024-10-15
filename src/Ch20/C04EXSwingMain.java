package Ch20;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class ChattingServerUI extends JFrame {
    ChattingServerUI() {
        super("Chatting Server");
        setBounds(100, 100, 500, 500);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 10, 300, 300);
        panel.add(scrollPane);

        JTextField textField = new JTextField();
        textField.setBounds(10, 320, 300, 30);
        panel.add(textField);

        JButton inputButton = new JButton("입력");
        inputButton.setBounds(320, 320, 150, 30);
        panel.add(inputButton);

        JButton saveFileButton = new JButton("파일로저장");
        saveFileButton.setBounds(320, 10, 150, 30);
        panel.add(saveFileButton);

        JButton privateChatButton = new JButton("1:1 요청");
        privateChatButton.setBounds(320, 50, 150, 30);
        panel.add(privateChatButton);

        JButton viewChatLogButton = new JButton("대화기록보기");
        viewChatLogButton.setBounds(320, 90, 150, 30);
        panel.add(viewChatLogButton);

        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class C04EXSwingMain {
    public static void main(String[] args) {
        new ChattingServerUI();
    }
}
