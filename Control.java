package transport;

import java.util.Scanner;

public class Contral {
	static double min(double t1,double t2,double t3)
	{
		 double min=t1<t2?t1:t2;
		min=min<t3?min:t3;
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		HighWay highway=new HighWay();
		
		System.out.println("请输入出发点，目的地，距离：格式为YY YY YY");
		Plane plane=new Plane();
		Scanner sc=new Scanner(System.in);
		try {
		String str=sc.nextLine();
		String[] s= str.split(" ");
		double d=Double.parseDouble(s[2]);
		double t1=car.result(d);
		double t2=highway.result(d);
		double t3=plane.result(d);
		System.out.println("从"+s[0]+"到"+s[1]+"所需的时间为："+"\n"+car.getName()+" "+String.format("%.2f",t1)+"小时");
		System.out.println(highway.getName()+" "+String.format("%.2f",t2)+"小时"+"\n"+plane.getName()+" "+String.format("%.2f",t3)+"小时");
		double m=min(t1,t2,t3);
		if(m==t1)
			System.out.println("坐汽车最快");
		else if(m==t2)
			System.out.println("坐高铁最快");
		else
			System.out.println("坐飞机最快");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("请将输入的内容用两个空格隔开！"+e.getMessage());
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
			System.out.println("请数入正确的数字！");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
			System.out.println("请重新输入！");
		}

	}
}
