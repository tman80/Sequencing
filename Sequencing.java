import java.util.Scanner;

public class Sequencing {
	public static void main( String[] args ) {
		
		
		Scanner keyboard = new Scanner(System.in);
		double price = 0, salesTax, total;  // declared a double variable called price and assigned it a value of 0
		                                    // declared two other double variables salesTax and total but didn't asign them any values.
		System.out.print( "How much is the purchase price? " );
		price = keyboard.nextDouble();
		
		salesTax = price * 0.0825;
		total = price + salesTax;
		
		System.out.println( "Item price:\t" + price );
		System.out.println( "Sales tax:\t" + salesTax );
		System.out.println( "Total cost:\t" + total );
	}
}