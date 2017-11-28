import java.io.* ;
import java.applet.* ;
import java.awt.* ;
import java.awt.event.* ;

public class test extends Applet 
{
	public void init( ) {
		setLayout( new BorderLayout( )) ;

		Label 표시레이블=new Label("0", Label.RIGHT);
		add(표시레이블, BorderLayout.NORTH);
		// P_Left GUI Button
		Button 내버튼1 =  new Button("7")  ; Button 내버튼2 = new Button("8") ; 	Button 내버튼3 =  new Button("9");
		Button 내버튼4 =  new Button("4")  ; Button 내버튼5 = new Button("5") ; 	Button 내버튼6 =  new Button("6");
		Button 내버튼7 =  new Button("1")  ; Button 내버튼8 = new Button("2") ; 	Button 내버튼9 =  new Button("3");
		Button 내버튼10 =  new Button("0")  ; Button 내버튼11 = new Button("00") ; 	Button 내버튼12 =  new Button(".");
		// P_Right GUI Button
		Button 내버튼13 =  new Button("+")  ; Button 내버튼14 = new Button("-") ; 	Button 내버튼15 =  new Button("*");
		Button 내버튼16 =  new Button("/")  ; Button 내버튼17 = new Button("=") ; 	Button 내버튼18 =  new Button("CE");
		Panel P = new Panel( ) ;		Panel P_Left = new Panel( ) ;		Panel P_Right = new Panel( ) ;

		P.setLayout(new GridLayout(1,2)) ; add(P) ;
		P_Left.setLayout(new GridLayout(4,3,1,1)) ; 

		P_Left.add(내버튼1) ; P_Left.add(내버튼2) ; P_Left.add(내버튼3) ; P_Left.add(내버튼4) ;
		P_Left.add(내버튼5) ; P_Left.add(내버튼6) ; P_Left.add(내버튼7) ; P_Left.add(내버튼8) ;
		P_Left.add(내버튼9) ; P_Left.add(내버튼10) ; P_Left.add(내버튼11) ; P_Left.add(내버튼12) ;
		P.add(P_Left) ;
		
		P_Right.setLayout(new GridLayout(3,2)) ;
		P_Right.add(내버튼13) ; P_Right.add(내버튼14) ; P_Right.add(내버튼15) ; 
		P_Right.add(내버튼16) ; P_Right.add(내버튼17) ; P_Right.add(내버튼18) ;

		P.add(P_Right) ;

	}
};  
