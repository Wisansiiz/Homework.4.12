import java.util.*;
class MainG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Y;
		Scanner cin = new Scanner (System.in);
		
		while(cin.hasNext()){
			Y = cin.nextInt();
			if (Y%4==0)
				if(Y%100!=0)System.out.print(Y+" is a leap year.");
				else System.out.print(Y+" is not a leap year.");
			else System.out.print(Y+" is not a leap year.");
		}
	}
}
