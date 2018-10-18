package transport;

public class Plane implements Transport{
	String name="飞机";
	public String getName() {
		return this.name;
	}
	@Override
	public double cal() {
		// TODO Auto-generated method stub
		double TimeGo=1.5;//到机场时间
		double TimeBack=1;//返回时间
		double GetTicketsTime=0.3;//取票时间
		double CheckTime=0.3;//检票时间
		double WaitTime=2;//候机时间
		double sum=TimeGo+TimeBack+GetTicketsTime+CheckTime+WaitTime;
		return sum;
	}
	@Override
	public double result(double distance) {
		// TODO Auto-generated method stub
		double SumTime=0;
		double V=75;
		SumTime=cal()+distance/V;
		return SumTime;
	}
}
//编写一个总控制类，由用户输入出发地，目的地，距离三个信息自动计算并输出每一种交通工具所需的时间
