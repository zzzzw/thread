
public class MyThreadTest implements Runnable{
	private String name;
	private MyThreadTest(String name){
		super();
		this.name=name;		
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("�߳̿�ʼ��"+this.name+",i="+i);
		}
	}
	public static void main(String args[]){
		MyThreadTest m1=new MyThreadTest("�߳�a");
		MyThreadTest m2=new MyThreadTest("�߳�b");
		new Thread(m1).start();
		new Thread(m2).start();
	}
	
}
