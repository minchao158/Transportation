package transport;

public class Car implements Transport{
	String name="����";
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	@Override
	public double cal() {
		// TODO Auto-generated method stub
		double TimeGo=1.1;//����վʱ��
		double TimeBack=1;//����ʱ��
		double GetTicketsTime=0.2;//ȡƱʱ��
		double CheckTime=0.2;//��Ʊʱ��
		double WaitTime=1.5;//��ʱ��
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