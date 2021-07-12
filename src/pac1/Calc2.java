package pac1;

import java.util.Scanner;

public class Calc2 {
	 
	public static void main(String[] args) throws java.io.IOException {
		
		System.out.println("Vvedite arifmeti4eskoe virazenie,");
		System.out.println("neobhodimie 4isla ot 0 do 9");
		System.out.println("i arifmeti4eskie operacii +, -, * ili /.");
		System.out.println("Vvedite 4isla i operacii 4erez probel:");
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String arif = in.next();
		String s2 = in.next();
		
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		int result;
		
		if ("0123456789".indexOf(s1) != -1) {
			if ("0123456789".indexOf(s2) != -1) {
						
				switch(arif) {
					case "+": result=i1+i2;
					System.out.print(result);
					break;
					case "-": result=i1-i2;
					System.out.print(result);
					break;
					case "*": result=i1*i2;
					System.out.print(result);
					break;
					case "/": try {
						result =i1/i2;
						if (i1 % i2 == 0) {
							System.out.print(result);
						}else{
							System.out.print(result + "; ");
							System.out.print("Ostatoc: " + i1 % i2);}
						}catch(ArithmeticException e) {
							System.out.println("Delit' na 0 nelza!");}
					break;		
				}
			}else{System.out.println("Neobhodimie 4isla ot 0 do 9");}
		}else{System.out.println("Neobhodimie 4isla ot 0 do 9");}
		
		/*
		char a1 = (char) System.in.read ();
		char arif = (char) System.in.read ();
	    char a2 = (char) System.in.read ();
	    int result;
	    int i1 = Integer.parseInt(String.valueOf(a1));
	    int i2 = Integer.parseInt(String.valueOf(a2));
	    if(arif=='+'){
	    	result=i1+i2;
	    	System.out.print(result);
	    }
	    if(arif=='*'){
	    	result=i1*i2;
	    	System.out.print(result);
	    }
	    if(arif=='-'){
	    	result=i1-i2;
	    	System.out.print(result);
	    }
	    if(arif=='/'){
	    	try {
	    		result=i1/i2;
				if (i1 % i2 == 0) {
				System.out.print(result);
				} else {
					System.out.print(result + "; ");
					System.out.print("Ostatok: " + i1 % i2);}
			}catch(ArithmeticException e) {
				System.out.println("Delit' na 0 nelza!");
			}
		}
		*/
	    in.close();
	}
}
