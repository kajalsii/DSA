package Array;

public class First {
    public static void main(String[] args) {
        int arr[]= {3,2,1,5,2};
        int Largest= arr[0];
        for(int i=1; i < arr.length; i++){
            if (arr[i]>Largest) {
                Largest = arr[i];
            }
        }
        System.out.println("the largest number is: " + Largest);
    }
    
}
