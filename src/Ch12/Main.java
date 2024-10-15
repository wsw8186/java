package Ch12;

public class Main {

	public static void main(String[] args) {
		
		// Buyer 객체 생성: 홍길동, 초기 자금 10,000원, 소유한 사과 0개
        Buyer 홍길동 = new Buyer(10000, 0);
        
        // Buyer 객체 생성: 철수, 초기 자금 20,000원, 소유한 사과 0개
        Buyer 철수 = new Buyer(20000, 0);
        
        // Seller 객체 생성: 사과장수, 초기 자금 100,000원, 소유한 사과 100개, 사과 가격 1,000원
        Seller 사과장수 = new Seller(100000, 100, 1000);
        
        // 홍길동이 사과장수에게 5,000원을 지불하고 사과를 구매
        // payment 메서드를 호출하여 판매자에게 지불하고, 구매한 사과의 수가 업데이트됨
        홍길동.payment(사과장수, 5000);
        
        // 철수가 사과장수에게 12,000원을 지불하고 사과를 구매
        // payment 메서드를 호출하여 판매자에게 지불하고, 구매한 사과의 수가 업데이트됨
        철수.payment(사과장수, 12000);
		
		System.out.println(홍길동);
		System.out.println(철수);
		System.out.println(사과장수);
	}

}
