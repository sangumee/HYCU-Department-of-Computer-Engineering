import java.io.* ;
import java.applet.* ;
import java.awt.* ;
import java.awt.event.* ;

public class 버튼액션_01 extends Applet 
{
	String s, str;
	Label 표시레이블 ;

	public void init( ) {
		표시레이블 = new Label("0", Label.RIGHT);
		add(표시레이블);
		
		Button 내버튼1 = new Button("1");
		add(내버튼1);
		
		내버튼1.addActionListener ( new ActionListener( ) {
			public void actionPerformed ( ActionEvent e) {
				String s = e.getActionCommand();
					if(str != null) str += s;
					else str = s;
					표시레이블.setText(str);

			}
		}); 
	}
};  
