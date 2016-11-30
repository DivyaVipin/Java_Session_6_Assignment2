import java.util.Scanner;

class PrimeRunnable implements Runnable
{
	int no;
	PrimeRunnable(int n)
	{
		this.no=n;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int flag=0;
		for(int i=2;i<no;i++){
			if(no%i==0)
			{
				System.out.println(no+" is not a Prime Number");
				flag = 1;
				break;
			}
		}
		if(flag==0)
			System.out.println(no+" is a Prime Number");
	
	}
	
}
public class CheckPrimeRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int no=sc.nextInt();
		(new Thread(new PrimeRunnable(no))).start();
	}

}
