package exercice2;

import java.util.Arrays;

public class ArrayUtils {
	
	private int[] table;
	//constructeur
	public ArrayUtils(int[] table) {
		this.table = table;
	}
	//getter
	public int[] getTable() {
		return this.table;
	}
	
	public int[] rearrangeArray() {
        ;
        for (int i = 0; i < this.table.length; i++) {
            if (this.table[i] != -1 && this.table[i] != i) {
                int x = this.table[i];
                while (this.table[x] != -1 && this.table[x] != x) {
                    int y = this.table[x];
                    this.table[x] = x;
                    x = y;
                }
                this.table[x] = x;
                if (this.table[i] != i) {
                	this.table[i] = -1;
                }
            }
        }
        return this.table;
    }

    // Example usage:
    public static void main(String[] args) {
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        ArrayUtils arrayUtils = new ArrayUtils(arr);
        System.out.println(Arrays.toString(arrayUtils.getTable()));
        System.out.println(Arrays.toString(arrayUtils.rearrangeArray()));
        //System.out.println(rearrangedArr);
        //System.out.println(Arrays.toString(arr)); // Output: [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
    }
    
}
