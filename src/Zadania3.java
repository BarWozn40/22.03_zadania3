import java.util.Random;

public class Zadania3 {
    public static void main(String[] args){
        System.out.println(array());
    }
    public static int array(){
        final int arrLen = 15;
        int[] arrayInt = new int[arrLen];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i]=InputInt();
        }
        return arrLen;
    }
    public static int InputInt(){
        Random rand = new Random();
        int liczba = rand.nextInt(43)-10;
        return liczba;
    }
    public static float Sum(int[] array){
        float sum= 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
//        for (int item:array) {
//            sum+=item;
//        }
        return sum;
    }
    public static float Avg(int[] array){
        float avg = 0;
        avg=Sum(array)/array.length;
        return avg;
    }
}
