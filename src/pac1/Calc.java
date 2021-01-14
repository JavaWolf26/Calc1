package pac1;

import static java.lang.System.out;
import java.util.Scanner;

public class Calc {

	public static void main(String[] args) throws java.io.IOException {
		Scanner keyboard = new Scanner(System.in);
		int Num1 = 0;
		int Num2 = 0;
		String Operation = null;
		out.print("Введите первое целое число от 1 до 10: ");
		Num1 = keyboard.nextInt();
		if (Num1 < 0 || Num1 > 10) {
			System.out.print("Ошибка!");
		} else if (Num1 > 0 && Num1 < 10) {
			out.print("Введите второе целое число от 1 до 10: ");
			Num2 = keyboard.nextInt();}
		if (Num2 < 0 || Num2 > 10) {
			System.out.print("Ошибка!");
		} else if (Num2 > 0 && Num2 < 10) {{
			out.println("Укажите необходимую арифметическую операцию:");
			out.print("'+', '-', '*', '/' ");
			Operation = keyboard.next();}
		if (Operation.equals("+")) {
			int NumRez = Num1 + Num2;
			out.println(NumRez);
		} else if (Operation.equals("-")) {
			int NumRez = Num1 - Num2;
			out.println(NumRez);
		} else if (Operation.equals("*")) {
			int NumRez = Num1 * Num2;
			out.println(NumRez);
		} else if (Operation.equals("/")) {
			int NumRez = Num1 / Num2;
			if (Num1 % Num2 == 0) {
				out.print(NumRez);
			} else {
				out.print(NumRez + "; ");
				out.print("остаток при делении: " + Num1 % Num2);}
		} else {
			System.out.println("Ошибка!");
		}
		keyboard.close();
		}
	}
}