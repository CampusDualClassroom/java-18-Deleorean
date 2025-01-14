package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

    public static int[] createAndInitializeArray(int positions) {
        int[] miArray = new int[positions];
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = i + 1;
        }
        return miArray;
    }

    public static void showInlineArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("numero" + array[i]);
            if (i < (array.length - 1)) {
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        int positions = Utils.integer("Introduce un número: ");
        int[] miArray = createAndInitializeArray(positions);
        showInlineArray(miArray);
    }
}
