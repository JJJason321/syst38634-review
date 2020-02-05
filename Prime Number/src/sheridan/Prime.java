package sheridan;

public class Prime {
	
	
	public static boolean isPrime( int number ) {
		for ( int i = 2 ; i <= number /2 ; i ++) {
			if ( number % i == 0  ) {
				return false;
			}
		}
		return true;
 	}

	public static void main(String[] args) {
		

		System.out.println( "Number 29 is prime? " + Prime.isPrime( 29 ) );
		System.out.println( "Number 29 is prime? " + Prime.isPrime( 30 ) );		
		System.out.println( "Number 33 is prime? " + Prime.isPrime( 33 ) );
		System.out.println( "Number 34 is prime? " + Prime.isPrime( 34 ) );	
		System.out.println( "Number 35 is prime? " + Prime.isPrime( 35 ) );		
		System.out.println( "Number 36 is prime? " + Prime.isPrime( 36 ) );				
		
	}

}
