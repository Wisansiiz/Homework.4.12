import java.util.*;
class MainD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double bike,walk;
		Scanner cin = new Scanner (System.in);
		a = cin.nextDouble();
		bike = a/3+27+23;
		walk = a/1.2;
		if (bike>walk)System.out.print("Walk");
		else if (walk>bike)System.out.print("Bike");
		else System.out.print("All");
		cin.close();
	}
}
