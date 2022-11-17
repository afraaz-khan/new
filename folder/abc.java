// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         System.out.print("Enter Number of Lines : ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int spaces = n;

//        for (int i=1; i<=n; i++){

//             for (int k=1; k<=spaces; k++){
//                 System.out.print("$");
//             }

//             for (int j=1; j<i+1; j++){
//                 System.out.print(j + " ");
//             }
//             spaces-- ;
//             System.out.println("");
//        }
//     }
// }



import java.util.Scanner;
public class abc {
    public static void main(String[] args) {
        System.out.print("Enter Number of Lines : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = n;
        int num=1;

       for (int i=0; i<n; i++){

            for (int k=1; k<=spaces; k++){
                System.out.print("$");
            }
            
            num=1;
            for (int j=0; j<=i; j++){
                System.out.print(num + " ");
                num=num*(i-j)/(j+1);
            }
            spaces-- ;
            System.out.println("");
       }
    }
}
