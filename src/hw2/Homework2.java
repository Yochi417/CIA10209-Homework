package hw2;

public class Homework2 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=2;i<=1000;i+=2) {
			sum+=i;
		}
		System.out.println(sum);
		
		System.out.println("----------------------------------");
		
		int num=1;
		for(int j=1;j<=10;j++) {
			num*=j;
		}
		System.out.println(num);
		
		System.out.println("----------------------------------");
		
		int num1=1,a=1;
		while(num1<=10) {
			
			a*=num1;
			num1++;
		}
		System.out.println(a);
		
		System.out.println("----------------------------------");
		
		int num3;
		for(int num2=1;num2<=10;num2++) {
			num3=num2*num2;
			System.out.print(num3+" ");
			
		System.out.println("----------------------------------");
			
		
		int sum4=0;
		for(int num4=1;num4<50;num4++) {
			if((num4%10==4) || (num4/10==4)) {
				continue;
			}
			else {
			System.out.println(num4);
			sum4++;
			}
		
		}
		System.out.println(sum4+"個");
		
		System.out.println("----------------------------------");
		
		
		}
	}

}
