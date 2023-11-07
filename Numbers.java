import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		int firstNum,secondNum,thirdNum;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		firstNum = input.nextInt();
		secondNum = input.nextInt();
		thirdNum = input.nextInt();
		System.out.println("Sum="+(firstNum+secondNum+thirdNum));
		System.out.println("Mult="+(firstNum*secondNum*thirdNum));
		System.out.println("Avr="+(firstNum+secondNum+thirdNum)/3.0);
		System.out.println("pow="+Math.pow(firstNum, secondNum));
		input.close();
	}

}
