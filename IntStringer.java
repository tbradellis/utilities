import java.util.*;

class IntStringer {

	public static void main (String args[]) {
	
		int a = 1234;
		String b = "1F";
		String myIntString = stringer( a );
		System.out.println(myIntString);
		int c = hexAmount( b );
		System.out.println( c );
		
	}	
		
	public static String stringer( int number){
		
		Hashtable<Integer, String> numbers = new Hashtable<Integer, String>();
		numbers.put(0, "0");
		numbers.put(1, "1");
		numbers.put(2, "2");
		numbers.put(3, "3");
		numbers.put(4, "4");
		numbers.put(5, "5");
		numbers.put(6, "6");
		numbers.put(7, "7");
		numbers.put(8, "8");
		numbers.put(9, "9");
		
			
		int modBuffer = 0;
		String inverseInt = "";
		
		while ( number != 0 ) {
			
			modBuffer = number % 10;
			
			inverseInt += numbers.get(modBuffer);		
			number = number / 10;
		
		}	

		String turnaround = new StringBuilder(inverseInt).reverse().toString();	
		
		return turnaround;
	}	
	
	public static int hexAmount( String hexNum){
	
		Hashtable<String, Integer> hexDigi = new Hashtable<String, Integer>();
		
		hexDigi.put("0", 0);
		hexDigi.put("1", 1);
		hexDigi.put("2", 2);
		hexDigi.put("3", 3);
		hexDigi.put("4", 4);
		hexDigi.put("5", 5);
		hexDigi.put("6", 6);
		hexDigi.put("7", 7);
		hexDigi.put("8", 8);
		hexDigi.put("9", 9);
		hexDigi.put("A", 10);
		hexDigi.put("B", 11);
		hexDigi.put("C", 12);
		hexDigi.put("D", 13);
		hexDigi.put("E", 14);
		hexDigi.put("F", 15);
		int numCounter = 0;
		int numBuffer = 0;
		for ( int i = 0; i < hexNum.length(); i++ ){
			double multiplier = Math.pow(16, i );
			int place = hexNum.length() - 1;
			//numBuffer = hexDigi.get(hexNum.valueOf(place - i));
			numBuffer = hexDigi.get(hexNum.charAt(place - i));
			numCounter += numBuffer * multiplier;
			
		}
		
		return numCounter;	
	}		
			
	
}	
