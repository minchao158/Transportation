package transport;

public class Car implements Transport{
	String name="汽车";
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	@Override
	public double cal() {
		// TODO Auto-generated method stub
		double TimeGo=1.1;//到车站时间
		double TimeBack=1;//返回时间
		double GetTicketsTime=0.2;//取票时间
		double CheckTime=0.2;//检票时间
		double WaitTime=1.5;//候车时间
		double sum=TimeGo+TimeBack+GetTicketsTime+CheckTime+WaitTime;
		return sum;
	}
	@Override
	public double result(double distance) {
		// TODO Auto-generated method stub
		double SumTime=0;
		double V=32;
		SumTime=cal()+distance/V;
		return SumTime;
	}
}