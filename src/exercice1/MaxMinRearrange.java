package exercice1;

import java.util.Arrays;

public class MaxMinRearrange {

    public static void rearrangeArray(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int left = 0, right = n - 1;
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (flag)
                temp[i] = arr[right--];
            else
                temp[i] = arr[left++];

            flag = !flag;
        }

        // Copier les éléments du tableau temporaire dans le tableau d'origine
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Tableau d'origine : " + Arrays.toString(arr));
        rearrangeArray(arr);
        System.out.println("Tableau réarrangé : " + Arrays.toString(arr));
    }
}

