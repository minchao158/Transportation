package transport;

public class HighWay implements Transport {
	String name="高铁";
	public String getName() {
		return this.name;
	}
	@Override
	public double cal() {
		// TODO Auto-generated method stub
		double TimeGo=1;//到车站时间
		double TimeBack=1;//返回时间
		double GetTicketsTime=0.5;//取票时间
		double CheckTime=0.3;//检票时间
		double WaitTime=1.5;//候车时间
		double sum=TimeGo+TimeBack+GetTicketsTime+CheckTime+WaitTime;
		return sum;
	}
	@Override
	public double result(double distance) {
		// TODO Auto-generated method stub
		double SumTime=0;
		double V=45;
		SumTime=cal()+distance/V;
		return SumTime;
	}
}

