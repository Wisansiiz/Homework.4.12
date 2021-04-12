import java.util.*;
class MainH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,month;
		Scanner cin = new Scanner (System.in);
		while(cin.hasNext()){
		year = cin.nextInt();
		month = cin.nextInt();
		if(month==2)
			if ((year%4==0&&year%100!=0)||year%400==0)
			System.out.println(29);
			else System.out.println(28);
		else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			System.out.println(31);
		else System.out.println(30);}
		cin.close();
	}

}
