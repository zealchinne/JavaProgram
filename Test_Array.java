// sorting is one the most common opeation done by array also
class Test_Array {
	public static void ArrSort(int a[]) {
		int temp=0;
		for(int i=0; i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}System.out.println();
		for(int i=0; i<a.length; i++)
			System.out.print(" "+a[i]);
	}	
	public static void main(String args[]){
		int a[]={55,8,79,12,92,41,82,77,65};
		//System.out.println("Length of the array: "+a.length);
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
		ArrSort(a);
		}
}