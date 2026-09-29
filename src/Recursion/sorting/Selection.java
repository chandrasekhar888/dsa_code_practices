package Recursion.sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] select = {2,1,4,5,3};

        for (int i = 0; i < select.length ; i++) {
            int min = i;

            for (int j = i+1; j < select.length; j++) {
                if (select[j] < select[min]) {
                    min = j;
                }
            }
            int temp = select[i];
            select[i] = select[min];
            select[min] = temp;
        }

        System.out.println(Arrays.toString(select));
        }
    }

