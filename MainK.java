import java.util.*;
public class MainK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int w,s,p;
		double f,d;
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			w = cin.nextInt();
			s = cin.nextInt();
			p = cin.nextInt();
			if (s<250)
			{
			d=0;
			f = w*s*p*(1 - d);
			System.out.print("freight = ");
			System.out.printf("%.6f\n", f);
			}
			else if(s>=250&&s<500)
			{d=0.02;
			f = w*s*p*(1 - d);
			System.out.print("freight = ");
			System.out.printf("%.6f\n", f);
			}
			else if(s>=500&&s<1000)
			{d=0.05;
			f = w*s*p*(1 - d);
			System.out.print("freight = ");
			System.out.printf("%.6f\n", f);
			}
			else if(s>=1000&&s<2000)
			{d=0.08;
			f = w*s*p*(1 - d);
			System.out.print("freight = ");
			System.out.printf("%.6f\n", f);
			}
			else if(s>=2000&&s<3000)
			{d=0.1;
			f = w*s*p*(1 - d);
			System.out.print("freight = ");
			System.out.printf("%.6f\n", f);
			}
			else
			{d=0.15;
			f = w*s*p*(1 - d);
			System.out.print("freight = ");
			System.out.printf("%.6f\n", f);
			}
		}
		cin.close();
	}

}
