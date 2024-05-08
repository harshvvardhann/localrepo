import java.util.*;
public class addressOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        for 1-dimensional array
        System.out.println("Enter base address:");
        int baseaddress=sc.nextInt();
        System.out.println("Enter size:");
        int size=sc.nextInt();
        System.out.println("Enter i:");
        int i=sc.nextInt();
        System.out.println("Enter lowerbound:");
        int lowerbound=sc.nextInt();
        System.out.println("Enter upperbound:");
        int upperbound=sc.nextInt();
        System.out.println("BASE ADDRESS:"+(baseaddress+size*(i-lowerbound)));
        System.out.println("TOTAL NUMBER OF ELEMENTS:"+(upperbound-lowerbound+1));

//        for 2-dimensional array
//        -We can store 2dimensional address by 2 methods , Row major order annd column major order
//        (1)ROW MAJOR ORDER
//        FORMULA: Baseaddress + [number of columns(i-lowerbound of row) + (j-lowerbound of column)] * size;
//        (2)COLUMN MAJOR ORDER
//        FORMULA: Baseaddress + [(i-lowerbound of row) + nuumber of rows(j-lowerbound of column)] * size;

        System.out.println("Enter base address:");
        int baseaddress=sc.nextInt();
        System.out.println("Enter size:");
        int size=sc.nextInt();
        System.out.println("Enter lowerbound of row:");
        int lowerboundOfrow=sc.nextInt();
        System.out.println("Enter upperbound of row:");
        int upperboundOfrow=sc.nextInt();
        System.out.println("Enter lowerbound of column:");
        int lowerboundOfcolumn=sc.nextInt();
        System.out.println("Enter upperbound of colummn:");
        int upperboundOfcolumn=sc.nextInt();
        System.out.println("Enter number of rows");
        int rows=sc.nextInt();
        System.out.println("Enter number of columns:");
        int columns=sc.nextInt();

        rows=upperboundOfrow-lowerboundOfrow+1;
        columns=upperboundOfcolumn-lowerboundOfcolumn+1;
        System.out.println("Enter i:");
        int i=sc.nextInt();
        System.out.println("Enter j:");
        int j=sc.nextInt();

        System.out.println("Enter 1 for row major");
        System.out.println("Enter 2 for column wmajor");
        int c=sc.nextInt();
        switch(c) {
            case 1:
                int answer=baseaddress + (columns*(i-lowerboundOfrow) + (j-lowerboundOfcolumn)) * size;
                System.out.println("BASE ADDRESS using row major order:"+answer);
                break;
            case 2:
                int answer1=baseaddress + ((i-lowerboundOfrow) + rows*(j-lowerboundOfcolumn)) * size;
                System.out.println("BASE ADDRESS using columns major order:"+answer1);
                break;
        }
    }
}
