import java.io.* ;
import java.applet.* ;
import java.awt.* ;
import java.awt.event.* ;

public class test extends Applet 
{
	public void init( ) {
		setLayout( new BorderLayout( )) ;

		Label ǥ�÷��̺�=new Label("0", Label.RIGHT);
		add(ǥ�÷��̺�, BorderLayout.NORTH);
		// P_Left GUI Button
		Button ����ư1 =  new Button("7")  ; Button ����ư2 = new Button("8") ; 	Button ����ư3 =  new Button("9");
		Button ����ư4 =  new Button("4")  ; Button ����ư5 = new Button("5") ; 	Button ����ư6 =  new Button("6");
		Button ����ư7 =  new Button("1")  ; Button ����ư8 = new Button("2") ; 	Button ����ư9 =  new Button("3");
		Button ����ư10 =  new Button("0")  ; Button ����ư11 = new Button("00") ; 	Button ����ư12 =  new Button(".");
		// P_Right GUI Button
		Button ����ư13 =  new Button("+")  ; Button ����ư14 = new Button("-") ; 	Button ����ư15 =  new Button("*");
		Button ����ư16 =  new Button("/")  ; Button ����ư17 = new Button("=") ; 	Button ����ư18 =  new Button("CE");
		Panel P = new Panel( ) ;		Panel P_Left = new Panel( ) ;		Panel P_Right = new Panel( ) ;

		P.setLayout(new GridLayout(1,2)) ; add(P) ;
		P_Left.setLayout(new GridLayout(4,3,1,1)) ; 

		P_Left.add(����ư1) ; P_Left.add(����ư2) ; P_Left.add(����ư3) ; P_Left.add(����ư4) ;
		P_Left.add(����ư5) ; P_Left.add(����ư6) ; P_Left.add(����ư7) ; P_Left.add(����ư8) ;
		P_Left.add(����ư9) ; P_Left.add(����ư10) ; P_Left.add(����ư11) ; P_Left.add(����ư12) ;
		P.add(P_Left) ;
		
		P_Right.setLayout(new GridLayout(3,2)) ;
		P_Right.add(����ư13) ; P_Right.add(����ư14) ; P_Right.add(����ư15) ; 
		P_Right.add(����ư16) ; P_Right.add(����ư17) ; P_Right.add(����ư18) ;

		P.add(P_Right) ;

	}
};  
