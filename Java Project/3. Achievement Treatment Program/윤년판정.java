import java.applet.* ;
import java.awt.* ;

public class 윤년판정 extends Applet 
{
	public void paint(Graphics g) {
		int 년도 = 2016 ;
		boolean 윤년 = false ;

		if ( (년도%4==0 && 년도%100 != 0) || (년도%400 == 0) ) 윤년 = true ;
		if (윤년) g.drawString(년도+"는 윤년입니다.", 100,60) ;
		else g.drawString(년도+"는 윤년이 아닙입니다.", 100,60) ;
	}
};  
