package lovelettermystery;
import java.util.Scanner;
public class Lovelettermystery {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
/*We scan in the number of test cases.*/
		int T = s.nextInt();
/*For each test case, we scan the string and see how many operations we need to
carry out.*/
		while (T > 0) {
/*We start by scanning in the string.*/
			String word = s.next();
/*We print out the number of operations in the string.*/
			System.out.println(getNumRotations(word));

			--T;
		}
/*We close the scanner.*/
		s.close();
	}
/*We have a function that will calculate the number of operations we need to
perofrm on the string.*/
	public static int getNumRotations(String word) {
/*We turn the string into a character array.*/
		char[] wordArr = word.toCharArray();
		
		int count = 0;
		int j = word.length() - 1;
		
		for(int i = 0; i < wordArr.length / 2; i++, j--){
			count += Math.abs((int)(wordArr[i] - wordArr[j]));
		}

		return count;
	}

}
