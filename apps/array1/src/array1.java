public class array1 {
	
	public static void main(String[] args){

		int[] names = {9, 10, 78, 10, 10, 10, 10, -4, 0, 100, 13, 45};

		System.out.print("### Original:\n");
		for (int name: names) {
			System.out.print(" " + name);
		}
		System.out.print("\n");

		int[] names2 = reverseOrder(names);
		System.out.print("### Reverse:\n");
		for (int name: names2) {
			System.out.print(" " + name);
		}
		System.out.print("\n");
		
		int[] names3 = removeDuplicates(names2);
		System.out.print("### Without duplicates:\n");
		for (int name: names3) {
			System.out.print(" " + name);
		}
		System.out.print("\n");
	}
	
	public static int[] reverseOrder( int[] array ) {
		int[] sorted = new int[array.length];
		int j = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			sorted[j] = array[i];
			j--;
		}
		return sorted;
		
	}
	
	public static int[] removeDuplicates( int[] array ) {
	int end = array.length;
	for (int i = 0; i < end; i++) {
		for (int j = i + 1; j < end; j++) {
			if (array[i] == array[j]) {
				int shiftLeft = j;
					for (int k = j+1; k < end; k++, shiftLeft++) {
					array[shiftLeft] = array[k];
					}
					end--;
					j--;
			}
		}
	}
	int[] whitelist = new int[end];
	for(int i = 0; i < end; i++){
	whitelist[i] = array[i];
	}
	return whitelist;
	}
}