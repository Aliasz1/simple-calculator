package cc_homework_2.cc_bad_code;
public class Calculator{

    //add
    public static int Addition(int first, int second){
        return (first + second);
    }
    //subtract
    public static int Subtract(int first, int second){
        return (first - second);
    }
    //multiply
    public static int multiply(int first, int second){
		return (first * second);
	}
    //remainder
    public static int remainder(int first, int second){
		return (first % second);
	}
    //find gcd
	public static int GCD(int first, int second){
        int result;
		if(second == 0){
			result = first;
		} else{
			result = GCD(second, first%second);
		} return result;
		}
    //find lcm
	public static int LCM(int first, int second){
        int result, gcdresult;
		gcdresult = GCD(first, second);
		result = (first*second)/gcdresult;
		return result;
	}
    public static void main(String[] args){
        //declare variables
        int first = 1, second = 3;
        //add variables
        System.out.println(Addition(first, second));
    }
}