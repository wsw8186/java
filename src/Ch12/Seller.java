package Ch12;

public class Seller {
	// 판매자가 가진 돈의 양, 소유한 사과의 개수, 사과의 가격을 저장하는 개인 필드
	private int myMoney; // 판매자가 가진 돈
	private int appleCnt; // 판매자가 소유한 사과의 수
	private int price;  // 사과의 가격
	
	 // 특정 금액의 돈, 사과 개수, 사과 가격으로 Seller를 초기화하는 생성자
	public Seller(int money, int count, int price) {
		super();
		this.myMoney = money; // 초기 돈 설정
		this.appleCnt = count; // 초기 사과 개수 설정
		this.price = price; // 사과 가격 설정
	}

	// 판매자가 돈을 받고 사과를 판매하는 메서드
	public int receive(int money) {
		this.myMoney += money; // 판매자의 돈에 받은 금액 추가
        int returnCount = money / price; // 판매된 사과의 개수 계산
        this.appleCnt -= returnCount; // 판매 후 남은 사과 개수 업데이트
        return returnCount; // 판매된 사과의 개수 반환
	}

	// Seller 객체의 문자열 표현을 제공하기 위해 toString 메서드 재정의
	@Override
	public String toString() {
		return "Seller [myMoney=" + myMoney + ", appleCnt=" + appleCnt + ", price=" + price + "]";
	}	
}
