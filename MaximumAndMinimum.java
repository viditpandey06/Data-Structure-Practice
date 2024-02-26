import java .util.*;
public class MaximumAndMinimum{
    public static void main(String[] args) {
        int size;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter size of array");
        size=sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
          sc.close();
         MaxandMin(arr,size);
         System.out.println("[Program Terminated]");
    }
    public static void MaxandMin(int [] arr, int size){
        int front=0,rear=size-1,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        while (front<rear) {
            if(arr[front]<arr[rear]){
               if(arr[front]<min){
                  min =arr[front];
               }
               if(arr[rear]>max){
                max=arr[rear];
               }
            }
            else if (arr[front] > arr[rear]) {
                if (arr[rear] < min) {
                    min = arr[rear];
                }
                if (arr[front] > max) {
                    max = arr[front];
                }
            }
            rear--;
            front++;
        }
        System.out.println(min+" "+max);
    }
}