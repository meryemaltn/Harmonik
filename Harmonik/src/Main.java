import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner inp= new Scanner (System.in);
		System.out.println("Sayýyý Giriniz: ");
		double n, result=0;
		n = inp.nextInt();
		
		for(double i=1 ; i<=n ; i++) {
			
			result+= (1 / i);
			}		
		System.out.println(result);
	}
}
