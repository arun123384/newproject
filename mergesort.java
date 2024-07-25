package demo;

public class mergesort {
	public static void merge(int arr[],int low,int high) {
		if(low>=high) {
			return;
		}
		int mid=(low+high)/2;
		merge(arr,low,mid);
		merge(arr,mid+1,high);
		mergesort2(arr,low,mid,high);
	}
	public static void mergesort2(int arr[],int low,int mid,int high) {
		int a=mid-low+1;
		int b=high-mid;
		int[] temp1=new int[a];
		int[] temp2=new  int[b];
		
		for(int i=low;i<=mid;i++) {
			temp1[i-low]=arr[i];
		}
		for(int i=mid+1;i<=high;i++) {
			temp2[i-mid-1]=arr[i];
		}
		int i=0,j=0,k=low;
		while(i<a&&j<b) {
			if(temp1[i]<temp2[j]) {
				arr[k]=temp1[i];
				i++;
			}
			else {
				arr[k]=temp2[j];j++;
				
			}
			k++;
		}
		while(i<a) {
			arr[k]=temp1[i];k++;i++;
			
		}
		while(j<b) {
			arr[k]=temp2[j];k++;j++;
			
		}
	}
	public static void main(String[] args) {
		int arr[]= {5,2,34,9,4,6,5,1};
		int n=arr.length;
		merge(arr,0,n-1);
		for(int i: arr) {
			System.out.print(i+" ");
	}
	}

}
