import java.util.*;
class MainE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,x,y,t,sx;
		Scanner cin = new Scanner (System.in);
		n = cin.nextInt();
		x = cin.nextInt();
		y = cin.nextInt();
		t = y/x;
		if (y%x!=0)t++;
		sx = n-t;
		System.out.print(sx);

	}

}
