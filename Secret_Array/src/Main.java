import java.util.Random;


public class Main {
    public static void generateArray(int[]arr,int size){
        Random rand = new Random();
        for (int i = 0;i<size;i++){
            arr[i]= rand.nextInt(101);
        }
    }
    public static int countDivisbleBy(int[]arr,int divisor){
        int numDivisible = 0;
        for(int elem: arr){
            if(elem%divisor==0){
                numDivisible++;
            }
        }
        return numDivisible;
    }
    public static void complementArray(int[] arr,int[] complement){
        for(int i=0;i<arr.length;i++){
            complement[i] = 100 - arr[i];
        }
    }
    public static void print(int[] arry){
        for(int elem: arry) {
            System.out.println(elem + " ");
        }
    }
    public static void main(String[] args) {
    int size = 5;
    int[] Original_arr = new int[size];
    int[] complement_arr = new int[size];
    generateArray(Original_arr,size);
    System.out.println("Original array generated: ");
    print(Original_arr);

    int count = countDivisbleBy(Original_arr,7);
    complementArray(Original_arr,complement_arr);
    System.out.println("Complement array generated: ");
    print(complement_arr);

    }
}