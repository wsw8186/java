package Ch12;

public class Buyer {
	 // 구매자가 가진 돈의 양과 소유한 사과의 개수를 저장하는 개인 필드
	private int myMoney; // 구매자가 가진 돈
	private int appleCnt; // 구매자가 소유한 사과의 수
	
	 // 특정 금액의 돈과 사과 개수로 Buyer를 초기화하는 생성자
	public Buyer(int money, int count) {
		super();
		this.myMoney = money;  // 초기 돈 설정
		this.appleCnt = count; // 초기 사과 개수 설정
	}

	 // 판매자에게 지불을 처리하고 구매자의 상태를 업데이트하는 메서드
	public void payment(Seller seller, int money) {
		
		this.myMoney -= money;// 구매자의 돈에서 지불 금액 차감
		
		int receiveApp = seller.receive(money); // 판매자가 받은 돈을 처리하고 받은 사과의 개수를 반환
		
		this.appleCnt += receiveApp; // 구매자의 사과 개수를 받은 사과의 수로 업데이트
	}

	 // Buyer 객체의 문자열 표현을 제공하기 위해 toString 메서드 재정의
	@Override
	public String toString() {
		return "Buyer [myMoney=" + myMoney + ", appleCnt=" + appleCnt + "]";
	}	
}
