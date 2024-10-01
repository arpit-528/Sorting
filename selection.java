package Sorting;
public class selection {
        public static void selectionsort(int arr[], int n){
            for(int i = 0; i<=n-2; i++){
                int min = i;
                for(int j = i; j <= n-1 ; j++) {
                    if(arr[j] <  arr[min]) {
                        min = j;
                    }
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        public static void main(String[] args) {
            int arr[] = new int[6];
            arr[0] = 50;
            arr[1] = 30;
            arr[2] = 32;
            arr[3] = 85;
            arr[4] = 41;
            arr[5] = 23;
            selectionsort(arr, 6);
            for(int i = 0; i<= 5; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

