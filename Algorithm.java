package ASM1;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Algorithm {
    // hàm dùng để gán kết quả vị trí vào file txt
    public void output(int number, String name){
        try { 
           FileOutputStream input = new FileOutputStream(name);
           DataOutputStream dataInput = new DataOutputStream(input);
            dataInput.writeFloat(number);              
            dataInput.close();
            } catch (Exception e) {
            System.out.println("Lỗi biên dịch" + e);
            }
    }
    // hàm dùng để gán kết quả mảng vào file txt
    public void output(float arr[], String name){
        try { 
           FileOutputStream input = new FileOutputStream(name);
           DataOutputStream dataInput = new DataOutputStream(input);
            for(int i =0; i<arr.length;i++){
            float index = arr[i];
            dataInput.writeFloat(index);  
            }
            dataInput.close();
            } catch (Exception e) {
            System.out.println("Lỗi biên dịch" + e);
            }
    }
    // hàm dùng chạy để sắp xếp mảng theo nôi bọt
    public static void bubbleSort(float arr[]){
        float temp;
        System.out.println("Bubble sort");
        int i, j;
        boolean swapped;
        for (i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    for(int k=0;k<arr.length;k++){
                        System.out.print(arr[k]+" ");
                        }
                        System.out.println("");
                }
            }
            if (swapped == false)
                break;
        }
    }
    // hàm dùng chạy để sắp xếp mảng theo sắp xếp lựa chọn
    public static void selectionSort(float arr[]){
        int indexMin;
        float temp;
        System.out.println("Secction sort");
        for(int i=0; i<arr.length-1;i++){
            indexMin = i;
            for(int j =i+1;j<arr.length;j++){
              if(arr[j]<arr[indexMin]){
                  indexMin = j;
              } 
            }
              if(indexMin!=i){
                temp = arr[indexMin];
                arr[indexMin] = arr[i];
                arr[i] = temp; 
              }
              for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
                }
                System.out.println("");
        }
    }
    // hàm dùng chạy để sắp xếp mảng theo sắp xếp chèn
    public static void insertionSort(float arr[]){
        System.out.println("Insert sort");
        for(int i=1;i< arr.length;i++){
            float key = arr[i];
            int j =i;
            while (j > 0 && arr[j-1] > key) {
                arr[j] = arr[j-1];
                j--;
            }
            if (j != i) {
                arr[j]=key;
            } 
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
                }
                System.out.println("");
        }
            
            
    }
    // hàm dùng tìm  thuật toán tìm kiếm tuần tự
    public static void linarSearch(float arrA[], int x){
            int result = 0;
            for(int i =0; i<arrA.length;i++){
                if(arrA[i]>x){
                    result =i;
                    System.out.print("Số lớn hơn là: "+arrA[result] + " vị trí: "+result+". ");
                    try { 
                        FileOutputStream input = new FileOutputStream("output4.txt");
                        DataOutputStream dataInput = new DataOutputStream(input);
                        dataInput.writeInt(result);  
                        dataInput.close();
                        } catch (Exception e) {
                        System.out.println("Lỗi biên dịch" + e);
                        }
                } 
            }
            System.out.println("");
    }
    // hàm dùng tìm  thuật toán tìm kiếm nhị phân 
    public int binarySearch(float arr[], int l, int r,float x ){
        if(r>=l){
            int mid = l+(r-l)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]>x){
                return binarySearch(arr, l,mid-1, x);
            }
            
                return binarySearch(arr, mid+1, r, x);
            
        }
        return -1;
    }  
    // hàm dùng để in ra mảng ra console
    public void displayArray(float arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");

    }
    // hàm gán giá trị mảng A sang mảng B
    public void assginArray(float arrA[], float arrB[]){
        for(int i=0; i<arrA.length;i++){
            arrB[i]= arrA[i];
            }
    }
}
