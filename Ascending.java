public class Ascending {
	public static void sortInAscending(int[]a) {
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]);
		}
	}
}
