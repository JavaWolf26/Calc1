package pac1;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) { 
		Scanner keyboard = new Scanner(System.in);
		int Num1 = 0;
		int Num2 = 0;
		String Operation = null;
		System.out.print("Введите первое число от 0 до 9: ");
		Num1 = keyboard.nextInt();
		if (Num1 < 0 || Num1 > 9) {
			System.out.print("Неверно!");
		} else if (Num1 >= 0 && Num1 < 10) {{
			System.out.print("Введите второе число от 0 до 9: ");
			Num2 = keyboard.nextInt();}
		if (Num2 < 0 || Num2 > 9) {
			System.out.print("Неверно!");
		} else if (Num2 >= 0 && Num2 < 10) {{
			System.out.println("Введите арифметическую операцию: ");
			System.out.print("'+', '-', '*', '/' ");
			Operation = keyboard.next();}
		if (Operation.equals("+")) {
			int NumRez = Num1 + Num2;
			System.out.println(NumRez);
		} else if (Operation.equals("-")) {
			int NumRez = Num1 - Num2;
			System.out.println(NumRez);
		} else if (Operation.equals("*")) {
			int NumRez = Num1 * Num2;
			System.out.println(NumRez);
		} else if (Operation.equals("/")) {
				try {
				int NumRez = Num1 / Num2;
				if (Num1 % Num2 == 0) {
					System.out.print(NumRez);
				} else {
					System.out.print(NumRez + "; ");
					System.out.print("Остаток: " + Num1 % Num2);}
			}catch(ArithmeticException e) {
				System.out.println("Делить на 0 нельзя!");
			}
		}} else {
			System.out.println("Неверно!");
			}
		}
		keyboard.close();
	}
}


