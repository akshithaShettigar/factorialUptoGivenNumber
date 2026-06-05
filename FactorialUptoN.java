//Find the factorial upto the given number 
import java.util.Scanner;
class FactorialUptoN{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=sc.nextInt();
		if(n==1){	
			System.out.println(n);
		}
		int fact =1;
		for(int i=2;i<=n;i++){
			fact=fact*i;
			System.out.println(i+ "!=" +fact);
		}
		
	}
}

//OUTPUT
//Enter the number :10
//2!=2
//3!=6
//4!=24
//5!=120
//6!=720
//7!=5040
//8!=40320
//9!=362880
//10!=3628800
