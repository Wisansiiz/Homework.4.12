import java.util.*;
class MainM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x1,y1,r1,x2,y2,r2;
		Scanner cin = new Scanner (System.in);
		while (cin.hasNext()){
			x1=cin.nextDouble();
			y1=cin.nextDouble();
			r1=cin.nextDouble();
			x2=cin.nextDouble();
			y2=cin.nextDouble();
			r2=cin.nextDouble();
		double l;
		l=Math.sqrt(Math.pow(Math.abs(x1-x2),2)+Math.pow(Math.abs(y1-y2),2));
		if (r1+r2<l)System.out.println("disjoint");
		else if (r1+r2==l)System.out.println("externally tangent");
		else if (r1-r2==l||r2-r1==l)System.out.println("internally tangent");
		else if (r1+r2>l&&r1-r2>l)System.out.println("contain");
		else if ((r1+r2>l)&&(r1-r2<l))System.out.println("overlap");
			
		}
		cin.close();
	}

}
