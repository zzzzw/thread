//����ʵ�ַ�ʽ���������ϵ��
//�ڳ��򿪷���ֻҪ�Ƕ��߳̿϶���Զ��ʵ��Runnable�ӿ�Ϊ������Ϊʵ��Runnable�ӿ���ȼ̳�Thread�������ºô���
//�����̳еľ��ޣ�һ������Լ̳ж���ӿڡ�
//�ʺ�����Դ�Ĺ���  10��Ʊû����Դ����
public class TicketThreadImpl implements Runnable {
	private int ticket=10;
	public void run(){
		for(int i=1;i<=20;i++){
			if(ticket>0)
			System.out.println("�߳̿�ʼ��"+ticket--);			
		}	
	}
	public static  void main(String args[]){
		TicketThreadImpl m1=new TicketThreadImpl();
		//TicketThreadImpl m2=new TicketThreadImpl();
		//TicketThreadImpl m3=new TicketThreadImpl();
		new Thread(m1).start();//ͬһ��mt��������Thread�оͲ����ԣ������ͬһ
		new Thread(m1).start();//��ʵ��������mt���ͻ�����쳣  
		new Thread(m1).start();
	}

}
