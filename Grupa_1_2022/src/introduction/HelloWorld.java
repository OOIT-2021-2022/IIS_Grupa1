package introduction;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World!");
		double firstNumber=5;
		double secondNumber=2;
		
		int  rez=(int)(firstNumber/secondNumber);
		
		System.out.println("Rezultat je "+rez);
		
		System.out.println(5+rez);
		
		boolean alwaysTrue=true;
		boolean alwaysFalse=false;
		
		System.out.println(alwaysTrue && alwaysFalse);
		System.out.println(alwaysTrue || alwaysFalse);
		System.out.println(!alwaysTrue);
		
		//1. Zadatak
		System.out.println("Prvi zadatak");
		int a = 24;
		int b = 12;
		String operation = "-";
		if (operation == "+")
			System.out.println(a + b);
		else if (operation == "-")
			System.out.println(a - b);
		else if (operation == "/")
			System.out.println(a / b);
		else
			System.out.println(a * b);
		
		//2. Zadatak
		int i, faktorijel1=1;
		int broj=5;
		for(i=1;i<=broj;i++)
		{
			faktorijel1=faktorijel1*i;
		}System.out.println(faktorijel1);
		
		//3. Zadatak
		
		for(i=1;i<10;i++) {
			if(i%2==1) {
				continue;
				//break;
			}
			System.out.println("\n" + i);
		}
		
		
		

	}

}
