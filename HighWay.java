package transport;

public class HighWay implements Transport {
	String name="����";
	public String getName() {
		return this.name;
	}
	@Override
	public double cal() {
		// TODO Auto-generated method stub
		double TimeGo=1;//����վʱ��
		double TimeBack=1;//����ʱ��
		double GetTicketsTime=0.5;//ȡƱʱ��
		double CheckTime=0.3;//��Ʊʱ��
		double WaitTime=1.5;//��ʱ��
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

