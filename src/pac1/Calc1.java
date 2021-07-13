package pac1;

public class Calc1 {
	
	public static void main(String[] args) throws java.io.IOException {
		
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
	}
}
