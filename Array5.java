import java.util.*;

class Array5{
	int duplicateRemove(int arr[]){
		int i=0;
		for(int j=1;j<arr.length;j++){
			if(arr[j]!=arr[i]){
				arr[i+1]=arr[j];
				i++;
			}
		}
		return i+1;
	}
}
class Run{
	public static void main(String[] ar){
        Array5 a=new Array5();
		int arr[]={9,9,18,18,27,27,49};
        int n=a.duplicateRemove(arr);
        for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}		
	}
}