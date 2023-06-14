//*
package Ex07.innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerEventMain {//OuterClass
	
	/*
	class EventHandler implements ActionListener{//InnerClass

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("ActionEvent 발생했습니다.");
			System.out.println(e.getActionCommand());//어떤명령이 발생했는지 알려줌
			System.out.println(e.getSource());//어떤 소스인지 알려줌
			System.out.println();
		}
		
	}
	*/
	
	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스");//프레임(화면)
		Button btn = new Button("Button - Start"); 
		
//		1. 외부에서 호출 - 이벤트 첨가한다.
//		EventHandler handler = new InnerEventMain().new EventHandler();
//		btn.addActionListener(handler);//버튼에 액션이벤트 추가
//		
//		//버튼의 크기설정, 위치 등등 다 정해줘야한다. 정하지 않을시 버튼이 프레임을 전부 덮는다.
		frame.add(btn);//프레임에(윈도우)에 버튼 컴포넌트 추가
		frame.setVisible(true);
		frame.setSize(300,200);
		frame.setLocation(300,150);
		
//		2.직접 선언
		/*
		btn.addActionListener(new ActionListener() {//익명(무명) 클래스
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("2222ActionEvent 발생했습니다.2222");
				System.out.println(e.getActionCommand());//어떤명령이 발생했는지 알려줌
				System.out.println(e.getSource());//어떤 소스인지 알려줌
				System.out.println();
			}
		});
		*/
//		3. 종료 버튼 추가
		frame .addWindowListener(new WindowAdapter() {//익명(무명) 클래스

			@Override
			public void windowClosing(WindowEvent e) {
					System.exit(0);
			}
		
		});
	}
}
//*/