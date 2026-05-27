import java.util.Scanner;
class ifelse2{
    public static void main(String[] args){
        Scanner Scan=new Scanner(System.in);
        int income=Scan.nextInt();
        if(income>7000){
            System.out.println("scholorship is available");
        }
        else{
            System.out.println("scholorship not available");
        }
    }
}