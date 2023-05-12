public class Array1
{
	public static void main(String[] args) {
		int[] nums_original = {1,2,3,4,5,6,7,8,9,10};
		int[] nums_copy = new int[10];
		System.out.println("Array to copy to: ");
		for(int x:nums_copy){
		    System.out.print(x + " ");
		}
		System.out.println("\nArray to copy from: ");
		for(int x:nums_original){
		    System.out.print(x + " ");
		}
		for(int i = 0;i<nums_original.length;i++){
		    nums_copy[i] = nums_original[i];
		}
		System.out.println("\nCopied array: ");
		for(int x:nums_copy){
		    System.out.print(x + " ");
		}
	}
}
