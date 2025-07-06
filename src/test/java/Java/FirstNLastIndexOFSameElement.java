package Java;

public class FirstNLastIndexOFSameElement {
    public static void fNLElement(int [] array, int target){
        int firstIndex = -1;
        int lastIndex = -1;
        for(int i = 0;i<array.length;i++){
            if(array[i]==target){
                if(firstIndex==-1) firstIndex=i;
                lastIndex=i;
            }
        }
        System.out.println("The first Index of "+target+": "+firstIndex+"\nThe last Index of "+target+": "+lastIndex);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 6, 7};
        fNLElement(arr,5);
    }
}
