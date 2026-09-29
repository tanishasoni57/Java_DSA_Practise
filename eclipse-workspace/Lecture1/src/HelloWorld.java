
public class HelloWorld{
	public static void main(String[] args) {
	/*	int max=0;
		int arr[]= {12,45,7,89,23};
		int i=0;
		while(i<arr.length) {
			if(arr[i]>max) {
				max=arr[i];
			}
			++i;
		}
		System.out.println("max element is " + max);
		*/
		
		
		/*int sum=0;
		int i=0;
		int[] arr= {5,10,15,20};
		while(i<arr.length) {
			sum=sum+arr[i];
			++i;
		}
		System.out.println(sum);
		*/
		
		
		/*int count=0;
		int arr[]= {1,2,3,4,5,6};
		int i=0;
		System.out.println("even numbers are: ");
		while(i<arr.length) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
				++count;
			}
			++i;
		}
		System.out.println();
		System.out.println("total number of even numbers in the array are : "+count);
		*/
		
		/*int arr[]= {1,2,4,5};
		int left=0;
		int right=arr.length-1;
		int temp;
		int i=0;
		while(left<right) {
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			++left;
			--right;
			++i;
			
		}
		int j=0;
		while(j<arr.length) {
			System.out.print(arr[j]+" ");
			++j;
		}
		*/
		
		
		/*int arr[]= {1, 2, 3, 4, 1};
		int left=0;
		int right=arr.length-1;
		boolean ispal=true;
		while(left<=right) {
			if(arr[left]!=arr[right]) {
				ispal=false;
				break;
			}
			++left;
			--right;
		}
		if(ispal==false) {
			System.out.println("not pallindrom");
		}
		else {
			System.out.println("pallindrome");
		}
		*/
		
		
		
		/*int arr[]={2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
		int target = 23;
		int result=binarySearch(arr,target);
		if(result!=-1) {
			System.out.println("target found");
		}
		else {
			System.out.println("not found");
		}
		
				
	}
	
	public static int binarySearch(int[] arr,int target) {
		int left=0;
		int right=arr.length-1;
		
		while(left<=right) {
			int mid=left + (right - left) / 2;
			
			if(arr[mid]==target) {
				return mid;
			}
			
			else if(arr[mid]>target){
				right=mid-1;
			}
			else if(arr[mid]<target) {
				left=mid+1;
			}
		}
		return -1;

	}
	*/
		
		
		/*int arr[]= {1, 2, 2, 2, 3, 4, 5};
		int target=6;
		
		int result=leftOccourance(arr,target);
		if(result!=-1) {
			System.out.println("first occourance is "+ result);
		}
		else {
			System.out.println("target not found");
		}
	}
	
	public static int leftOccourance(int [] arr,int target) {
		int left=0;
		int right=arr.length-1;
		int ans=-1;
		while(left<=right) {
		int mid=left+(right-left)/2;
		
			if(arr[mid]==target) {
				ans=mid;
				right=mid-1;
			}
			else if(arr[mid]>target) {
				right=mid-1;
			}
			else if(arr[mid]<target) {
				left=mid+1;
			}
		}
		return ans;
	}
	*/
}













