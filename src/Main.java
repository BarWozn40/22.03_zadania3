import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arrayInt  = {1,2,3};
//        int[] arrayInt1  = {1,3,3};
//        int[] arrayInt2  = {1,2,3,2,3,4,5};
//        int[] arrayInt3  = {1,2,3};
//        int[] arrayInt = {1,2,3,4,5,6};
//        final int rozmiar = 10;
//        int[] array1 = new int[rozmiar];
//        String[] arrayString = {"Ala","ma","kota"};
//        char arrayChar[] = {'a','c'};
//        String tekst = new String(arrayChar);
//        System.out.println(Arrays.toString(arrayInt));
//        Arrays.fill(arrayInt,2);
//        System.out.println("equals: "+ Arrays.equals(arrayInt,arrayInt1));
//        System.out.println("equals: "+ Arrays.equals(arrayInt,arrayInt3));
//        System.out.println("compare: "+ Arrays.compare(arrayInt,arrayInt3));
//        System.out.println("compare: "+ Arrays.compare(arrayInt2,arrayInt3));
//        System.out.println("compare: "+ Arrays.compare(arrayInt,arrayInt1));
//        String tekst = "to jest tekst";
//        String[] textArr = tekst.split(" ");
//        System.out.println(Arrays.toString(textArr));
//        char[] charArray = tekst.toCharArray();
//        System.out.println(Arrays.toString(charArray));
//        int[] array = {1,2,3};
//        int[] arrayCopy = Arrays.copyOf(array,array.length);
//        int[] arraycCopy1 = Arrays.copyOfRange(array,1,2);
//        System.arraycopy(array,0,arraycCopy1,0,2);
        int[][] matrixA= new int[2][3];
        int[][] data = {
                {1,2,3},
                {2,3,4,5,6,778,34,-43},
                {1},
        };

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println(data[i][j]+" ");

            }
            System.out.println();
        }
        for (int[] item:data) {
            for (int i:item) {
                System.out.println(i+" ");
            }
            System.out.println();
        }
    }

}