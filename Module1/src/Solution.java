public class Solution {
    public static void main(String[] args) {


        int[] array = new int[15];

        for(int i=0; i<array.length; i++) {
            if(i == 0){
                array[i] = 1;
            } else {
                array[i] = array[i-1] + ((int)(100*Math.random()));
            }
        }

        for(int i: array){
            System.out.print(i+" ");
        }

        System.out.println();

        for(int i=array.length-1; i>=0; i--){
            System.out.print(array[i]+" ");
        }
    }
}
