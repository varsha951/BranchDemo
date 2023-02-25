public class AverageOfCenter {
	public static int[] ascending(int []a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		return a;
	}
public static void skipLargestAndSmallest(int []a){
	int []b=new int[a.length];
	b=ascending(a);
	int sum=0;
	float avg;
	for (int i = 1; i < b.length-1; i++) {
		sum=sum+b[i];
	}
	avg=(float)sum/(b.length-2);
	System.out.println(avg+" is the average of an array except largest and smallest");
}
}
