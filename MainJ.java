import java.util.*;

class MainJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		Scanner cin = new Scanner (System.in);
		while(cin.hasNext()){
			a = cin.nextInt();
			b = cin.nextInt();
			c = cin.nextInt();
			int f=0,s=0,t=0; 
			if(a>b&&a>c){
				f=a;
				s=Math.max(b, c);
				t=Math.min(b, c);
			}
			else if(b>a&&b>c){
				f=b;
				s=Math.max(a, c);
				t=Math.min(a, c);
			}
			else if(c>a&&c>b){
				f=c;
				s=Math.max(a, b);
				t=Math.min(a, b);
			}
			System.out.println(t+" "+s+" "+f);
			
		}
		cin.close();
	}

}
