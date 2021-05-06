package bubble;

public class exercise {

	public static void main(String[] args) {
		int []arrayBefore = {20,90,60,100,12,15,40,88,77,60,55,40};
		int []arrayafter = sorting(arrayBefore);
		printing(arrayafter);
	}
	public static int[] sorting(int [] theArray) {
		int size = theArray.length;
		int empty=0;
		for(int i =0;i<size-1;i++) {
			for(int j =0;j<size-1;j++) {
			if(theArray[j+1]<theArray[j]) {
				empty = theArray[j+1];
				theArray[j+1] = theArray[j];
				theArray[j] = empty;
			}	
			}
			
		}
		return theArray;
	}
	
	public static void printing(int [] theArray) {
		for(int i=0;i<theArray.length;i++) {
			System.out.println(theArray[i]);
		}
	}
}
