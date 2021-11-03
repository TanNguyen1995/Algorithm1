package ASM1;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class mainSort {
    public static void main(String[] args) {
        // Khai báo biến cho main
        Algorithm algorithm = new Algorithm();
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("Độ dài của mảng là.");
        int n = sc.nextInt();
        float mangA [] = new float[n];
        float mangB [] = new float[n];
        // vòng lặp để thực thi chương trình
        do{ System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("1. Nhập dữ liệu.");
        System.out.println("2. Xuất dữ liệu.");
        System.out.println("3. Sắp xếp theo Bubble Sort.");
        System.out.println("4. Sắp xếp theo Selection Sort.");   
        System.out.println("5. Sắp xếp theo Insertion Sort  .");
        System.out.println("6. Tìm kiếm các số lớn hơn số bạn nhập.");
        System.out.println("7. Tìm kiếm số bạn nhập.");
        System.out.println("8. Kết thúc chương trình.");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Mời bạn nhập chương trình");
        int key = sc.nextInt();
        String enter ;
            switch(key){
                case 1:
                // tạo ra file txt và lưu dữ liệu vào đó
                System.out.println("Tổng số trong mảng");
                n = sc.nextInt();
                System.out.println("Mời bạn nhập các số:");
                try {
                    FileOutputStream input = new FileOutputStream("input.txt");
                    DataOutputStream dataInput = new DataOutputStream(input);
                for(int i =0; i<n;i++){
                float a = sc.nextFloat();
                dataInput.writeFloat(a);  
                }
                dataInput.close();
                } catch (Exception e) {
                System.out.println("Lỗi biên dịch" + e);
                }
                System.out.println("Nhấn Y để quay lại chương trình");
                enter = sc.next();
                break;
                case 2:
                // lấy dữ liệu từ file txt đã tạo ở case 1 và gán giá trị vào mảng A
                try {
                    FileInputStream output = new FileInputStream("input.txt");
                    DataInputStream dataOutput = new DataInputStream(output);
                    for(int i=0; i<mangA.length;i++){
                        Float item= dataOutput.readFloat();
                        mangA[i]=item;
                        System.out.print(mangA[i]+" ");
                    }
                    System.out.println("");
                    dataOutput.close();
                    } catch (Exception e) {
                    System.out.println("Lỗi biên dịch " + e);
                    }
                    System.out.println("Nhấn Y để quay lại chương trình");
                    enter = sc.next();
                    break;
                case 3:
                    // chạy chương trình sắp xếp nổi bọt
                    algorithm.assginArray(mangA, mangB);
                    System.out.println("Thứ tự trước sắp xếp mảng là");
                    algorithm.displayArray(mangB);
                    algorithm.bubbleSort(mangB);
                    System.out.println("Thứ tự sau sắp xếp mảng là");
                    algorithm.displayArray(mangB);
                    algorithm.output(mangB, "output.txt");
                    System.out.println("Nhấn Y để quay lại chương trình");
                    enter = sc.next();
                    break;
                case 4:
                    // chạy sắp xếp lựa chọn
                    algorithm.assginArray(mangA, mangB);
                    System.out.println("Thứ tự trước sắp xếp mảng là");
                    algorithm.displayArray(mangB);
                    algorithm.selectionSort(mangB);
                    System.out.println("Thứ tự sau sắp xếp mảng là");
                    algorithm.displayArray(mangB);
                    algorithm.output(mangB, "output2.txt");
                    System.out.println("Nhấn Y để quay lại chương trình");
                    enter = sc.next();
                    break;
                case 5:
                // chạy sắp xếp theo chèn
                     algorithm.assginArray(mangA, mangB);
                    System.out.println("Thứ tự trước sắp xếp mảng là");
                    algorithm.displayArray(mangB);
                    algorithm.insertionSort(mangB);
                    System.out.println("Thứ tự sau sắp xếp mảng là");
                    algorithm.displayArray(mangB);
                    algorithm.output(mangB, "output3.txt");
                    System.out.println("Nhấn Y để quay lại chương trình");
                    enter = sc.next();
                    break;
                case 6:
                // chạy tìm kiếm theo tuần tự
                    System.out.println("Nhập số bạn cần tìm");
                    int findLS = s.nextInt();
                    algorithm.linarSearch(mangA, findLS);
                    System.out.println("Nhấn Y để quay lại chương trình");
                    enter = sc.next();
                    break;
                case 7:
                // chạy tìm kiếm nhị phân
                    System.out.println("Nhập số cần tìm");
                    Float findBS = sc.nextFloat();
                    int result = algorithm.binarySearch(mangB, 0,mangB.length-1, findBS);
                    if(result==-1){
                    System.out.println("Số cần tìm không có trong mảng");
                    }
                    else{
                    System.out.println("Số cần tìm tại vị trí: "+ result);
                    algorithm.output(result, "output5.txt");    
            }              
                System.out.println("Nhấn Y để quay lại chương trình");
                enter = sc.next();
                break;
               
                case 8:
                // kết thúc chương trình
                System.out.print("Cảm ơn bạn đã sử dụng chương trình.");
                    System.exit(0); 
        }                   
    }while(true);
}
}