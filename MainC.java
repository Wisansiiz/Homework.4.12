import java.util.*;
class MainC {

	public static void main(String[] args) {
		
		int x,a,b,c,max;
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()){
			x = cin.nextInt();
			a = x/100;
			b = (x/10)%10;
			c = (x%100)%10;
			if(a>b)
				if (b>c)
					if(c!=0)max=c*100+b*10+a;
				    else if(b!=0)max= b*100+a;
				    else max=a*100;
				else if (a>c)
					if (b!=0)max=b*100+c*10+a;
				    else if(c!=0)max=c*100+a;//第二位为0
				    else max=a*100;//
				else if (b!=0)max=b*100+a*10+c;
				else if(a!=0)max=a*100+c;//第二位为0
				else max=c*100;//第三位为0
			else if (c>a)
				if (a!=0)max=a*100+b*10+c;
			    else if(b!=0)max=b*100+c;//第二位为0
			    else max=c*100;//
			    else if(a>c)
			    	if(c!=0)max=c*100+a*10+b;
			    	else if(a!=0)max=a*100+b;//第二位为0
			    	else max = b*100;//
			    else 
			    	if(a!=0)max=a*100+c*10+b;
			    	else if(c!=0)max = c*100+b;//第二位为0
			    	else max=b*100;//
			System.out.println(max);
		}
		cin.close();
	}

}