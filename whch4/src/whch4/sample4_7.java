package whch4;

public class sample4_7
{
	public static void main(String[] args)
	{
		Car7 car1;
		car1 =new Car7();
		
		car1.setCar7(1234, 20.5);
		System.out.println(car1);
	}
}
class Car7
{
	protected int num;
	protected double gas;
	public Car7()
	{
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public void setCar7(int n, double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	public String toString()
	{
		String str ="車號."+num+",汽車量:"+gas;
		return str;
	}
}