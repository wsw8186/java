package Ch07;

import java.util.Scanner;

public class C02WHILE {

	public static void main(String[] args) {

		// 2단 - 9단 출력
//		int dan=2;
//		while(dan<=9) {
//			
//			int i=1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}

		// 2단 - 9단 출력 (2x9,2x8 ,.... 9x9 ,...9x1)
//		int dan=2;
//		while(dan<=9) {
//			
//			int i=9;
//			while(i>=1) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan++;
//		}

		// 9단 - 2단( 9x9 9x8 - 2x1)
//		int dan=9;
//		while(dan>=2) {
//			
//			int i=9;
//			while(i>=1) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}

		// 2단 - N단(N<9)

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		while(n>10||n<=2) {
//			System.out.println("다시입력하세요.");
//			n = sc.nextInt();
//		}
//		
//		int dan=2;
//		while(dan<=n) {
//			
//			int i=1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}

		// N단 - M단(N<M , N<9 , M<9)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		while(n>=m) {
//			System.out.println("다시입력하세요.");
//			n = sc.nextInt();
//			m = sc.nextInt();
//		}
//		
//		int dan=n;
//		while(dan<=m) {
//			
//			int i=1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}

		// 별찍기(기본높이:4)
		// *****
		// *****
		// *****
		// *****

//		int i = 0;
//		while(i<4) {
//			int j = 0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		// *
		// **
		// ***
		// ****

//		int i = 0;
//		while (i < 4) {
//			int j = 0;
//			while (j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		// ****
		// ***
		// **
		// *
		
//		int i = 4;
//		while (i > 0) {
//			int j = 0;
//			while (j < i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i--;
//		}
		
//		int i = 0;
//		while(i<4) {
//			int j = 0;
//			while(j<4-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println()
//			i++;
//		}

		//   *
		//  ***
		// *****
		//*******
		
//		 int i = 0; 
//		 while (i < 4) {
//	            int j = 0;
//	            int k = 0;
//
//	            
//	            while (j < (4 - i - 1)) {
//	                System.out.print(" ");
//	                j++;
//	            }
//
//	           
//	            while (k < (2 * i + 1)) {
//	                System.out.print("*");
//	                k++;
//	            }
//
//	            
//	            System.out.println("");
//
//	            i++;
//	        }
		
//		int i = 0;
//		while(i<4) {
//			int j = 0;
//			while(j<3-i) {
//				System.out.print(" ");
//				j++;
//			}
//			
//			int k = 0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			
//			
//			System.out.println();
//			i++;
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			int j = 0;
//			while(j<(h-1)-i) {
//				System.out.print(" ");
//				j++;
//			}
//			
//			int k = 0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			
//			
//			System.out.println();
//			i++;
//		}
		
		
		
		
	
		
		//*******
		// *****
		//  ***
		//   *
		
//		 Scanner sc = new Scanner(System.in);
//	        int h = sc.nextInt(); 
//
//	        int i = 0;
//	        while(i < h) {
//	            int j = 0;
//	            while(j < i) {
//	                System.out.print("a");
//	                j++;
//	            }
//	            
//	            int k = 0;
//	            while(k < (2 * (h - i) - 1)) {
//	                System.out.print("*");
//	                k++;
//	            }
//	            
//	            System.out.println();
//	            i++;
//	        }

		//   *
		//  ***
		// *****		
		//*******
		// *****
		//  ***
		//   *
	    
//	      int i = 0;
//	      while(i<7) {
//	    	  int j = 0;
//	    	  if(i<4) {
//	    		  while(j<3-i) {
//	    			  System.out.print(" ");
//	    			  j++;
//	    		  }
//	    		  int k = 0;
//	    		  while(k<=2*i) {
//	    			  System.out.print("*");
//		                k++;
//	    		  }
//	    	  }else {
//	    		  int j=0;
//	    		  while(j<=(i-4)) {
//	    			  System.out.print(" ");
//	    		  }
//	    		  
//	    	  }
//	    	  
//	    	  
//	    	  
//	    	  System.out.println();
//	    	  i++;
//	      }
//	        
	        
	        
		
		//*******
		// *****
		//  ***
		//   *		
		//   *
		//  ***
		// *****		
		//*******

		// 별찍기(기본높이:h)
//		Scanner sc = new Scanner(System.in);
//
//		int i = sc.nextInt();
//		while (i >= 1) {
//			int j = 0;
//			while (j < 5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i--;
//		}
		
		//2
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		
//		int i = 0;
//		while (i < h) {
//			int j = 0;
//			while (j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		//3
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		
//		int i = 0;
//		while(i<h) {
//			int j = 0;
//			while(j<h-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
	}

}
