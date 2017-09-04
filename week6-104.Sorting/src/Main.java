
public class Main {
    public static void main(String[] args) {

    }
    public static int smallest(int[] array) {
        int smallest=array[0];
        for(int num:array){
            if (num<smallest){
                smallest=num;
            }
        }
        return smallest;
    }
    public static int indexOfTheSmallest(int[] array) {
        int index=0;
        for(int i=0;i<array.length;i++){
            if (array[i]==smallest(array)){
                index= i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int pos=index;
        int smallest=array[index];
        for(int i=index;i<array.length;i++){
            if (array[i]<smallest){
                smallest=array[i];
                pos= i;
            }
        }
        return pos;
    }

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }

    public static void sort(int[] array){
        int temp;
        for (int i=0;i<array.length;i++){
            temp = indexOfTheSmallestStartingFrom(array,i);
            if (array[temp]<array[i]){
                swap(array,i,temp);
            }
        }

    }
}
