//�̳�Thread��ʽ
public class TicketThread extends Thread{
	private int ticket=10;
	public void run(){
		for(int i=1;i<=10;i++)
		{
			if(ticket>0)
			System.out.println("�߳̿�ʼ��"+ticket--);			
		}
	}
	public static void main(String args[])
	{
		TicketThread m1=new TicketThread();//ÿ���̶߳�������10�ţ�������30��Ʊ  
		TicketThread m2=new TicketThread();//��ʵ��ֻ��10��Ʊ��ÿ���̶߳����Լ���Ʊ  
		TicketThread m3=new TicketThread();//û�дﵽ��Դ����  
		m1.start();
		m2.start();
		m3.start();
		
	}
	

}
