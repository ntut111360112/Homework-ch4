package whch4;

public class sample4_6
{
	public static void main(String[] args)
	{
		Car6 cars[];
		cars=new Car6[2];
		
		cars[0]=new Car6();
		cars[0].setCar6(1234, 20.5);
		
		cars[1]=new RacingCar6();
		cars[1].setCar6(4567, 30.5);
		for(int i=0;i<cars.length;i++)
		{
			cars[i].show();
		}
	}
}
class Car6
{
	protected int num;
	protected double gas;
	public Car6()
	{
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public void setCar6(int n, double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽車量是"+gas);
	}
}
class RacingCar6 extends Car6
{
	private int course;
	public RacingCar6()
	{
		course=0;
		System.out.println("生產了賽車");
	}
	public void setCourse6(int c)
	{
		course = c;
		System.out.println("將賽車編號設為"+course);
	}
	public void show()
	{
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}
