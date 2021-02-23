
public class Main {

// reverse a number
	 static public int reverseNo(int no) {
		
		int temp=0;
		
		while(no>0) {
			temp=temp*10+no%10;
			no/=10;
		}
		no=temp;
		return no;
	}
	 
	 // 2:GCD or HCF of two numbers -
	 /* concept -
	  *An efficient solution is to use Euclidean algorithm
	  * which is the main algorithm used for this purpose.
	  *  The idea is, GCD of two numbers doesn’t change if smaller 
	  *  number is subtracted from a bigger number. 
	  *
	  */
	 static public int GCD(int a, int b) {
		 
		 if(a==0)
			 return b;
		 if(b==0)
			 return a;
		 
		 //base case
		 if(a==b)
			 return a;
		 
		 if(a>b)
			 return GCD(a-b,b);
		 return GCD(a,b-a);
		 
	 }
	 
	 //GCD or HCF of two numbers second method
	 static public int GCD2(int a, int b) {
		 
		 if(b==0)
			 return a;
		 return GCD2(b,a%b);
	 }
	 
	 //GCD Or HCF simple solution- not efficient
	 public static int GCD3(int a, int b) {
		 
		 int gcd=0;
		 for(int i=1;i<=a && i<=b;i++)
		 {
			 if(a%i==0 && b%i==0)
				 gcd=i;
		 }
		 
		 return gcd;
	 }
	 
	 // check whether a given number can be expressed as a sum of two prime numbers
	 public static boolean sumOfTwoPrime(int a) {
		 
		 for(int i=2;i<a/2;i++) {
			 if(primeNo(i))
			 {
				 if(primeNo(a-i)) {
				
					 return true;
				 }
			 }
		 }
		 return false;
	 }
	 
	 // program to check given no is prime no or not 
	 public static boolean primeNo(int a) {
		 boolean isPrime=true;
		 
		 for(int i=2;i<=a/2;i++) {
			 if(a%i==0)
				 isPrime=false;
			 break;
		 }
		 
		 return isPrime;
	 }
	 
	 //remove brackets from algebric expression 
	 
	 
	public static void main(String args[]) {
		
		
		System.out.print(sumOfTwoPrime(34));
		
	}
	
	
	
	
	
	
	
	
	
}
