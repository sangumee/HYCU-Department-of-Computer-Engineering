class 축구교실
{
	String 포지션;
	int 번호;

	void 패스하기(){
		System.out.println(this.포지션+"선수 공을 전달했습니다");
	}
}

class ball{
	public static void main(String[] args){

		축구교실 박지석=new 축구교실();	//생성자 -> 객체를 축구팀 클래스로부터 생성
										// 박지석.포지션 박지석.등번호 박지석.패스하기()

		박지석.포지션="미드필더";
		박지석.번호=10;
		System.out.println("박지석의 등번호는 "+박지석.번호+"번 입니다.");
		박지석.패스하기();
	}
}