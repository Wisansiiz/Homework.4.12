import java.util.*;
class MainF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner cin = new Scanner (System.in);
		a = cin.nextInt();
		b = cin.nextInt();
		c = cin.nextInt();
		int m;
		if(a>b)
			if(a>c)m=a;
			else m=c;
		else m=b;
		if(b>c)
			if(b>a)m=b;
			else m=a;
		else m=c;
		if(a>c)
			if(a>b)m=a;
			else m=b;
		else m=c;
		System.out.println(m);

	}

}
