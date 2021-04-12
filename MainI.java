import java.util.*;
class MainI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double a,b,c;
        Scanner reader = new Scanner (System.in);
        while (reader.hasNext()){
        	a = reader.nextDouble();
        	b = reader.nextDouble();
        	c = reader.nextDouble();
        	double x1=0,x2=0,dieta,t;
        	dieta = b*b-4*a*c;
        	if (dieta>=0){
        		x1=(-b-Math.sqrt(dieta))/(2*a);
        		x2=(-b+Math.sqrt(dieta))/(2*a);
        		if (x1<x2){
        			t=x2;
        			x2=x1;
        		    x1=t;
        		    System.out.print("the roots are ");
        		    System.out.printf("%.6f",x1);
        		    System.out.print(" and ");
        		    System.out.printf("%.6f",x2);
        		    
        		}
        		else {System.out.print("the roots are ");
        		    System.out.printf("%.6f",x1);
        		    System.out.print(" and ");
        		    System.out.printf("%.6f",x2);
        		    }
        		    System.out.println();
        	}
        	else System.out.println("delta is negative, no root.");
        	reader.close();
        }
	}

}
