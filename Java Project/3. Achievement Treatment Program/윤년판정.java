import java.applet.* ;
import java.awt.* ;

public class �������� extends Applet 
{
	public void paint(Graphics g) {
		int �⵵ = 2016 ;
		boolean ���� = false ;

		if ( (�⵵%4==0 && �⵵%100 != 0) || (�⵵%400 == 0) ) ���� = true ;
		if (����) g.drawString(�⵵+"�� �����Դϴ�.", 100,60) ;
		else g.drawString(�⵵+"�� ������ �ƴ��Դϴ�.", 100,60) ;
	}
};  
