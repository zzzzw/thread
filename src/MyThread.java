
public class MyThread extends Thread{
	private String name;
	private MyThread(String name)
	{
		super();
		this.name=name;
	}
	public void run(){
		for(int i=1;i<=10;i++)
		{
			System.out.println("�߳̿�ʼ��"+this.name+",i="+i);			
		}		
	}
	public static void main(String args[]){
		MyThread a=new MyThread("a");
		MyThread b=new MyThread("b");
		//a.run();
		//b.run();
		a.start();//�н�����Ч��
		b.start();
	}
}

