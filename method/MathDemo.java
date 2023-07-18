public class MathDemo
{
	public static void main(String[] args)
	{
		double PI = Math.PI;

		System.out.println(PI);

		circleArea(25.35);

		// maximun math.max
		System.out.println(Math.max(52,53)); // 53

		// math .min
		System.out.println(Math.min(12,0));

		// Math.sqrt()
		System.out.println((int) Math.sqrt(4)); // 2*2 = 4 => 2

		// Math.round
		System.out.println(Math.round(5.5)); //  => 5.5 => 6

		System.out.println((int) Math.floor(5.5)); //=> 5.5 => 5

		// math.random
		double rand = (Math.random() *10000);

		System.out.println(rand);

		System.out.println(Math.pow(2,3)); // 8


	}

	public static void circleArea(double radius)
	{
		double area = Math.PI * radius * radius;

		System.out.println(area);
	}

}