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
		
		System.out.println("����������㣬Ŀ�ĵأ����룺��ʽΪYY YY YY");
		Plane plane=new Plane();
		Scanner sc=new Scanner(System.in);
		try {
		String str=sc.nextLine();
		String[] s= str.split(" ");
		double d=Double.parseDouble(s[2]);
		double t1=car.result(d);
		double t2=highway.result(d);
		double t3=plane.result(d);
		System.out.println("��"+s[0]+"��"+s[1]+"�����ʱ��Ϊ��"+"\n"+car.getName()+" "+String.format("%.2f",t1)+"Сʱ");
		System.out.println(highway.getName()+" "+String.format("%.2f",t2)+"Сʱ"+"\n"+plane.getName()+" "+String.format("%.2f",t3)+"Сʱ");
		double m=min(t1,t2,t3);
		if(m==t1)
			System.out.println("���������");
		else if(m==t2)
			System.out.println("���������");
		else
			System.out.println("���ɻ����");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("�뽫����������������ո������"+e.getMessage());
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
			System.out.println("��������ȷ�����֣�");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
			System.out.println("���������룡");
		}

	}
}
