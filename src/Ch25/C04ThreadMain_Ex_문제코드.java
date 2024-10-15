package Ch25;

class IncrementThread implements Runnable {
	private static int counter = 0;

	//lock object 설정(임계영역 접근 여부를 판단하는 기준)
	private static final Object Lock = new Object();
	
	public int getCounter() {
		return counter;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			//임계영역 지정 - 하나의 스레드가 들어오면 다른스레드의 접근이 제한되는 영역
			synchronized(Lock){
				
				counter++; // 공유변수값증가
				System.out.println(Thread.currentThread().getName() + "s counter : " + counter);
				
				Lock.notifyAll(); //다른 스레드에게 점유 권한 양보
				
				if(i<99999) {
					try {
						Lock.wait(); //i가 99999dlgk(반복문을 벗어나지 않을때) 잠깐 대기
									 //다른스레드가 1증가하고 나올떄까지 대기 상태
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
			}
		}
	}
}

public class C04ThreadMain_Ex_문제코드 {

	public static void main(String[] args) throws InterruptedException {

		IncrementThread incrementThread1 = new IncrementThread();
		IncrementThread incrementThread2 = new IncrementThread();

		Thread thread1 = new Thread(incrementThread1);
		Thread thread2 = new Thread(incrementThread2);

		thread1.setName("TH1");
		thread2.setName("TH2");
		
		thread1.start();
		thread2.start();

		//메인 스레드가 thread1,thread2의 작업이 모두 완료될 때까지 대기하도록 설정
		thread1.join();
		thread2.join();

		System.out.println("Final value: " + incrementThread1.getCounter());

	}
}
