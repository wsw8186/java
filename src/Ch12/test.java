package Ch12;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		//   *
		//  ***
		// *****
		//*******
		
//		i(행) 		j(공백)		k(별)
//		0		     0-5		 0-0
//		1		     0-4		 0-2
//		2		     0-3		 0-4
//		3		     0-2		 0-6
//      4            0-1         0-8
//		5            0-0         0-10
//		-----------------------------------------
//		i=0		     j=0		  k=0
//		i++		     j++		  k++
//		i<h		     j<h-i-1	  k<=2*i
		
		int i = 0;  // 행 번호를 위한 변수
		Scanner sc = new Scanner(System.in);
        System.out.print("높이 입력: ");  // 사용자에게 높이를 입력하라는 메시지 출력
        int h = sc.nextInt();  // 사용자가 입력한 높이를 h에 저장

        // 높이 h 만큼 반복 (각 행에 대해)
        while (i < h) {
            // 공백 출력
            int j = 0;  // 공백을 위한 변수
            // 현재 행에서 필요한 공백 수만큼 반복
            while (j < h - i - 1) {  // 공백 출력: h-i-1만큼 공백을 출력
                System.out.print(" ");  // 공백 출력
                j++;  // 공백 수 증가
            }
            // 별 출력
            int k = 0;  // 별을 위한 변수
            // 현재 행에 출력할 별의 수만큼 반복
            while (k <= 2 * i) {  // 별 출력: 2*i + 1개의 별을 출력
                System.out.print("*");  // 별 출력
                k++;  // 별 수 증가
            }
            System.out.println();  // 행이 끝났으므로 줄 바꿈
            i++;  // 행 번호 증가
        
        }
        
//		i(행)		j(공)		k(별)
//		0			0-4			0-0
//		1			0-3			0-2
//		2			0-2			0-4
//		3			0-1			0-6
//		4			0-0			0-8
//		-------------------------------------------
//		i=0		j=0		k=0
//		i++		j++		k++
//		i<h/2		j<(height/2)-i		k=2*i+1
//
//		5			0-1			0-6
//		6			0-2			0-4
//		7			0-3			0-2
//		8			0-4			0-0
//		-------------------------------------------
//		i=0		j=0		k=0
//		i++		j++		k++
//		i>h/2		j=i-(h/2)	k=2*(h-i)-1
	
//		
//		 Scanner scanner = new Scanner(System.in);
//	     int height;
//
//	        // 홀수 높이 입력 받기
//	        while (true) {
//	            // 사용자에게 피라미드의 높이 입력 요청
//	            System.out.print("피라미드의 높이를 입력하세요 (홀수만): ");
//	            height = scanner.nextInt();
//
//	            // 입력된 높이가 홀수인지 체크
//	            if (height % 2 == 1) { // 홀수인지 체크
//	                break; // 홀수면 반복 종료
//	            }
//	            // 홀수가 아닐 경우 오류 메시지 출력
//	            System.out.println("홀수 값을 입력해야 합니다. 다시 시도하세요.");
//	        }
//
//	        int i = 0; // 행을 나타내는 변수
//	        while (i < height) {
//	            if (i <= height / 2) { // 위쪽 부분 (피라미드의 상단)
//	                // 공백 출력
//	                int j = 0;
//	                while (j < (height / 2) - i) {
//	                    System.out.print(" "); // 왼쪽 공백 출력
//	                    j++;
//	                }
//	                // 별 출력
//	                int k = 0;
//	                while (k < (2 * i + 1)) {
//	                    System.out.print("*"); // 별 출력
//	                    k++;
//	                }
//	            } else { // 아래쪽 부분 (피라미드의 하단)
//	                // 공백 출력
//	                int j = 0;
//	                while (j < (i - height / 2)) {
//	                    System.out.print(" "); // 왼쪽 공백 출력
//	                    j++;
//	                }
//	                // 별 출력
//	                int k = 0;
//	                while (k < (2 * (height - i) - 1)) {
//	                    System.out.print("*"); // 별 출력
//	                    k++;
//	                }
//	            }
//
//	            // 각 행이 끝나면 줄바꿈
//	            System.out.println();
//	            i++; // 다음 행으로 이동
//	        }
//    
	}
}
