package Ch31;

interface Calculator{
	int calculate(int num1, int num2);
}

public class C03LAMDA {

	public static void main(String[] args) {
		
		Calculator add = (num1,num2)->{return num1+num2;};
		
		Calculator sub = (num1,num2)->{return num1-num2;};

		Calculator mul = (num1,num2)->{return num1*num2;};
		
		Calculator div = (num1,num2)->{return num1/num2;};
		
	}

}
