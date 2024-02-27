import java.util.*;

class Array4{
	int duplicateRemove(int arr[]){
		Set<Integer> st=new HashSet<>();
		for(int i:arr){
			st.add(i);
		}
		Integer[] s = st.toArray(new Integer[0]);
		Arrays.sort(s);
		int index=0;
		for(int i:s){
			arr[index]=i;
			index++;
		}
		return index;
	}
}
class Run{
	public static void main(String[] ar){
        Array4 a=new Array4();
		int arr[]={9,9,18,18,27,27,49};
        int n=a.duplicateRemove(arr);
        for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}		
	}
}