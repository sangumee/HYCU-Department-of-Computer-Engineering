import java.io.* ;
import java.applet.* ;
import java.awt.* ;
import java.awt.event.* ;

public class ��ư�׼�_01 extends Applet 
{
	String s, str;
	Label ǥ�÷��̺� ;

	public void init( ) {
		ǥ�÷��̺� = new Label("0", Label.RIGHT);
		add(ǥ�÷��̺�);
		
		Button ����ư1 = new Button("1");
		add(����ư1);
		
		����ư1.addActionListener ( new ActionListener( ) {
			public void actionPerformed ( ActionEvent e) {
				String s = e.getActionCommand();
					if(str != null) str += s;
					else str = s;
					ǥ�÷��̺�.setText(str);

			}
		}); 
	}
};  
