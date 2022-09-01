import java.util.Scanner;

public class Daire {

	public static void main(String[] args) {
		double pi= 3.14;
		double a, r, alan;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Yarýcapi giriniz: ");
		r=input.nextDouble();
		System.out.println("Merkez açý ölçüsü giriniz: ");
		a=input.nextDouble();
		
	
		alan= (pi*r*r*a)/360;
		System.out.print("Dairenin alaný: ");
		System.out.println(alan);

	}

}
