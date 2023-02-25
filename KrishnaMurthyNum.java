public class KrishnaMurthyNum {
  public static void krishna(int num) {
	 int temp=num,temp1,sum=0;
	 while (temp>0) {
		temp1=temp%10;
		temp=temp/10;
		sum=sum+fact(temp1,temp1-1);
	}
	 if(sum==num) {
		 System.out.println(num+" is krishnamurthy number");
	 }
	 else {
		 System.out.println(num+" is not krishnamurthy number");
	 }
  }
  public static int fact(int num,int num1) {
	  if(num1>0) {
		  return  fact(num*num1,--num1);
	  }
	  else {
          return num;
	  }
  }
}
