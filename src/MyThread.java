
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
			System.out.println("线程开始："+this.name+",i="+i);			
		}		
	}
	public static void main(String args[]){
		MyThread a=new MyThread("a");
		MyThread b=new MyThread("b");
		//a.run();
		//b.run();
		a.start();//有交互的效果
		b.start();
	}
}

