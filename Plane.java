package transport;

public class Plane implements Transport{
	String name="�ɻ�";
	public String getName() {
		return this.name;
	}
	@Override
	public double cal() {
		// TODO Auto-generated method stub
		double TimeGo=1.5;//������ʱ��
		double TimeBack=1;//����ʱ��
		double GetTicketsTime=0.3;//ȡƱʱ��
		double CheckTime=0.3;//��Ʊʱ��
		double WaitTime=2;//���ʱ��
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
//��дһ���ܿ����࣬���û���������أ�Ŀ�ĵأ�����������Ϣ�Զ����㲢���ÿһ�ֽ�ͨ���������ʱ��
