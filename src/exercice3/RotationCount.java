package exercice3;

public class RotationCount {
	
	 public static int findRotationCount(int[] arr) {
	        int n = arr.length;
	        int min = arr[0], minIndex = -1;
	        
	        // Find the minimum element and its index
	        for (int i = 0; i < n; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	                minIndex = i;
	            }
	        }
	        
	        // Return the index of the minimum element
	        return minIndex;
	    }
	    
	    public static void main(String[] args) {
	        int[] arr1 = {15, 18, 2, 3, 6, 12};
	        System.out.println("Rotation count for arr1: " + findRotationCount(arr1));
	        
	        int[] arr2 = {7, 9, 11, 12, 5};
	        System.out.println("Rotation count for arr2: " + findRotationCount(arr2));
	        
	        int[] arr3 = {7, 9, 11, 12, 15};
	        System.out.println("Rotation count for arr3: " + findRotationCount(arr3));
	    }

}
