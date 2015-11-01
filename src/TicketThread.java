//继承Thread方式
public class TicketThread extends Thread{
	private int ticket=10;
	public void run(){
		for(int i=1;i<=10;i++)
		{
			if(ticket>0)
			System.out.println("线程开始："+ticket--);			
		}
	}
	public static void main(String args[])
	{
		TicketThread m1=new TicketThread();//每个线程都各卖了10张，共卖了30张票  
		TicketThread m2=new TicketThread();//但实际只有10张票，每个线程都卖自己的票  
		TicketThread m3=new TicketThread();//没有达到资源共享  
		m1.start();
		m2.start();
		m3.start();
		
	}
	

}
