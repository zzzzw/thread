//两种实现方式的区别和联系：
//在程序开发中只要是多线程肯定永远以实现Runnable接口为主，因为实现Runnable接口相比继承Thread类有如下好处：
//避免点继承的局限，一个类可以继承多个接口。
//适合于资源的共享  10张票没有资源共享
public class TicketThreadImpl implements Runnable {
	private int ticket=10;
	public void run(){
		for(int i=1;i<=20;i++){
			if(ticket>0)
			System.out.println("线程开始："+ticket--);			
		}	
	}
	public static  void main(String args[]){
		TicketThreadImpl m1=new TicketThreadImpl();
		//TicketThreadImpl m2=new TicketThreadImpl();
		//TicketThreadImpl m3=new TicketThreadImpl();
		new Thread(m1).start();//同一个mt，但是在Thread中就不可以，如果用同一
		new Thread(m1).start();//个实例化对象mt，就会出现异常  
		new Thread(m1).start();
	}

}
