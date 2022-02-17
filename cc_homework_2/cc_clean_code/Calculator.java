public class Calculator{

    //Methods will run the numbers respectively
    //method to add two numbers
    public static int Addition(int num1, int num2){
        return (num1 + num2);
    }

    //method to subtract two numbers
    public static int Subtract(int num1, int num2){
        return (num1 - num2);
    }

    //method to multiply two numbers
    public static int multiply(int num1, int num2){
		return (num1 * num2);
	}

    //method to find the remainder of two numbers
    public static int remainder(int num1, int num2){
		return (num1 % num2);
	}
   
    //method to find the greatest common denominator
	public static int GCD(int num1, int num2){
        int result;
        //checks if the second number is 0
		if(num2 == 0){
			result = num1;
		}
		
        //iterates until it reaches the common denominator
		else{
			result = GCD(num2, num1%num2);
		}
		
		return result;
		}
   
    //method to find the lowest common multiple
	public static int LCM(int num1, int num2){
        int result, gcdresult;
		gcdresult = GCD(num1, num2);
		result = (num1*num2)/gcdresult;
		return result;
	}

    public static void main(String[] args){

        int num1 = 1, num2 = 3;

        System.out.println(Addition(num1, num2));
    }
}