package ASM1;
import java.util.Random;
import java.util.Scanner;

public class TinhThuatToan {
    public void timeBubleSort(int arr[]){
        final long startTimeB = System.currentTimeMillis();
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
        final long endTimeB = System.currentTimeMillis();
        
        System.out.println("Thời gian sắp xếp Bubblesort: " + (endTimeB - startTimeB));
    }
    public void timeSelectionSort(int arr[]){
        final long startTimeS = System.currentTimeMillis();
        int indexMin;
        int temp;
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
        }
        final long endTimeS = System.currentTimeMillis();
                 System.out.println("Thời gian sắp xếp SelectionSort:  " + (endTimeS - startTimeS));
    }
    public void timeInsertionSort(int arr[]){
        final long startTimeI = System.currentTimeMillis();
        for(int i=1;i< arr.length;i++){
            int key = arr[i];
            int j =i;
            while (j > 0 && arr[j-1] > key) {
                arr[j] = arr[j-1];
                j--;
            }
            if (j != i) {
                arr[j]=key;
            } 
        }
        final long endTimeI = System.currentTimeMillis();
        System.out.println("Thời gian theo insert sort: " + (endTimeI - startTimeI));
    }    
    public void displayArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");

    }
    public void assginArray(int arrA[], int arrB[]){
        for(int i=0; i<arrA.length;i++){
            arrB[i]= arrA[i];
            }
    }
public static void main(String[] args) {
    TinhThuatToan tinhThuatToan = new TinhThuatToan();
    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    Scanner s = new Scanner(System.in);
    System.out.println("Tổng phần tử trong mảng");
    int n = sc.nextInt();
    int[] arrA = new int[n];
    int[] arrB = new int[n];
    do{System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("1. Tính thời gian theo tăng dần.");
    System.out.println("2. Tính thời gian theo ngẫu nhiên.");
    System.out.println("3. Tính thời gian theo giảm dần.");
    System.out.println("4. Kết thúc chương trình.");
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("Mời bạn nhập chương trình");
    int key = s.nextInt();
    String enter;
switch(key){
    case 1 :
    System.out.println("Mảng sắp theo thứ tự tăng dần");
    for (int i = 0; i < arrA.length; i++) {
        arrA[i] = i;
    }
    tinhThuatToan.timeBubleSort(arrA);
    tinhThuatToan.timeInsertionSort(arrA);
    tinhThuatToan.timeSelectionSort(arrA);
    System.out.println("Nhấn Y để quay lại chương trình");
    enter = sc.next();
    break;
    case 2:
    System.out.println("Mảng sắp theo thứ tự ngẫu nhiên");
    for (int i = 0; i < arrA.length; i++) {
        arrA[i] = random.nextInt(n)+1;
    }
    tinhThuatToan.assginArray(arrA, arrB);
    tinhThuatToan.timeBubleSort(arrB);
    tinhThuatToan.assginArray(arrA, arrB);
    tinhThuatToan.timeInsertionSort(arrB);
    tinhThuatToan.assginArray(arrA, arrB);
    tinhThuatToan.timeSelectionSort(arrB);
    System.out.println("Nhấn Y để quay lại chương trình");
    enter = sc.next();
    break;
    case 3:
    System.out.println("Mảng sắp theo thứ tự giảm dần");
    for (int i = arrA.length-1; i >= 0; i--) {
        arrA[arrA.length-i-1] = i;
    }
    tinhThuatToan.assginArray(arrA, arrB);
    tinhThuatToan.timeBubleSort(arrB);
    tinhThuatToan.assginArray(arrA, arrB);
    tinhThuatToan.timeInsertionSort(arrB);
    tinhThuatToan.assginArray(arrA, arrB);
    tinhThuatToan.timeSelectionSort(arrB);
    System.out.println("Nhấn Y để quay lại chương trình");
    enter = sc.next();
    break;
    case 4:
    System.exit(0);
}
    }while(true);
        
}
}
