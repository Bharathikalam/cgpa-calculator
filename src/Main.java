import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
                System.out.print("Enter the number of subjects:");
                int n=sc.nextInt();
                System.out.println("---------------------------------");
                int cre=0;
                int ci=0;
                int []arr=new int[n];
                int []arr1=new int[n];
                for(int i=0;i<n;i++){
                    System.out.print("Enter the credits of subject "+ (i+1)+":");
                    arr[i]=sc.nextInt();
                    System.out.print("Enter the gradepoint "+(i+1)+":");
                    arr1[i]=sc.nextInt();
                    cre+=arr[i]*arr1[i];
                    ci+=arr[i];
                }
                System.out.printf("The CGPA is:"+"%.2f",(float)cre/ci);
            }
        }

