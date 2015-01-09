package com.maple.calculator;
import java.util.Scanner; 
public class Main {
	public static void main(String[] args) { 
		
		String sign;
		Calculator calculator = new Calculator();
 
		float total = 0;
		System.out.print("두 수를 입력하세요:");
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		System.out.print("연산을 입력하세요:");
		sign = stdin.next();
		
		if(sign.equals("+")) {
			total=calculator.add(a,b);
		}
		
		else if(sign.equals("-")) {
			total=calculator.sub(a,b);
		}
		
		else if(sign.equals("+")) {
			total=calculator.mul(a,b);
		}
		
		else if(sign.equals("+")) {
			total=calculator.div(a,b);
		}
		
		else {
			System.out.println("잘못입력했습니다.");
		}
		
		System.out.println("결과는" + total + "입니다.");
		
		System.out.print("16진수로 변환할 10진수를 입력하세요:");
		int c = stdin.nextInt();
		calculator.hexadecimal_change(c);
	}
}

		
	