public class TypeCastingDemo
{
	public static void main(String[] args)
	{
		int nums = 20;

		float price = nums;
		System.out.println(nums); // 2
		System.out.println(price); // 2.0 (float)

		float discount = 1.95f;
 
		int priceOne = (int)discount;
		System.out.println("================"); 
		System.out.println(priceOne); //1 


		
		
	}
}

// Widening Casting (automatically) - converting a smaller type to a larger type size
// byte -> short -> char -> int -> long -> float -> double

// Narrowing Casting (manually) - converting a larger type to a smaller size type
// double -> float -> long -> int -> char -> short -> byte 