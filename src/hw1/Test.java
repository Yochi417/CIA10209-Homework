package hw1;

public class Test {

	public static void main(String[] args) {
		int num1 = 12,num2 = 6;
		int sum = num1+num2;
		int mult = num1*num2;
		System.out.println("合為"+sum+",積為"+mult);
		
		System.out.println("--------------------");
		
		int eggs = 200;
		int dozen = 12;
		System.out.println("總共有"+(eggs/dozen)+"打雞蛋,還剩下"+(eggs%dozen)+"不足一打");
		
		System.out.println("--------------------");
		
		int s = 256559,ss,m,mm,h,hh,day;
		ss=s%60;
		m = s/60;
		mm = m%60;
		h = m/60;
		hh = h%24;
		day = h/24;
		
		System.out.println("總共有"+day+"天:"+hh+"時:"+mm+"分:"+ss+"秒");
		
		System.out.println("--------------------");
		
		final double PI = 3.1415,girth,circle;
		int r=5;
		girth = 2*PI*r;
		circle = PI*(r*r);
		System.out.printf("圓面積是%.2f%n", circle);
		System.out.printf("圓周長是%.2f%n", girth);
		
		System.out.println("--------------------");
		
		int money = 1500000;
		for(int i = 1;i<=10;i++) {
			money *=1.02;
		}
		System.out.println(money);
		
		System.out.println("--------------------");
		
		System.out.println(5+5);    //因為兩個5都是int型別，所以相加起來為int型別的10
		System.out.println(5+'5');  //單引號為字元，單引號5對應萬元碼內的值為53,所以相加起來為58
		System.out.println(5+"5");  //int型別與字串相加代表前後做串接，因此5串5為55
		
	}

}
