public class patterns {
    public static void pattern1(int n){
        System.out.println("Pattern-1 : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        System.out.println("Pattern-2 : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        System.out.println("Pattern-3 : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        System.out.println("Pattern-4 : ");
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        System.out.println("Pattern-5 : ");
        for (int i = n; i >0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        System.out.println("Pattern-6 : ");
        for (int i = n; i >0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        System.out.println("Pattern-7 : ");
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < (n-i-1); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < (n-i-1); k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern8(int n){
        System.out.println("Pattern-8 : ");
        for (int i = n; i > 0; i--) {
            for (int k = 0; k < (n-i); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < (n-i); k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        // pattern7(n)
        // pattern8(n)
        System.out.println("Pattern-9 : ");
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < (n-i-1); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < (n-i-1); k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int k = 0; k < (n-i); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < (n-i); k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern10(int n){
        System.out.println("Pattern-10 : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern11(int n){
        System.out.println("Pattern-11 : ");
        int start;
        for (int i = 1; i <= n; i++) {
            if(i%2==0) start=0;
            else start=1;
            for (int j = 0; j < i; j++) {
                System.out.print(start);
                start = 1- start;
            }
            System.out.println();
        }
    }
    public static void pattern12(int n){
        System.out.println("Pattern-12 : ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=(n-i)*2;j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern13(int n){
        System.out.println("Pattern-13 : ");
        int num=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void pattern14(int n){
        System.out.println("Pattern-14 : ");
        for (int i = 0; i < n; i++) {
            for(char ch='A';ch<=('A'+i);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern15(int n){
        System.out.println("Pattern-15 : ");
        for (int i = n; i > 0; i--) {
            for(char ch='A';ch<('A'+i);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern16(int n){
        System.out.println("Pattern-16 : ");
        for (int i = 0; i < n; i++) {
            char ch = (char)('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern17(int n) {
        System.out.println("Pattern-17 : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for (int j = 1; j <= 2*i+1; j++) {
                System.out.print(ch);
                if(j<=breakpoint) ch++;
                else ch--;
            }
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern18(int n){
        System.out.println("Pattern-18 : ");
        for (int i = 0; i < n; i++) {
            char ch = (char)('A'+(n-1)-i);
            for(char j =ch;j <= 'A'+(n-1);j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern19(int n){
        System.out.println("Pattern-19 : ");
        int spaces = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            spaces += 2;
            System.out.println();
        }
        spaces = 2*n-2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            spaces -= 2;
            System.out.println();
        }
    }
    public static void pattern20(int n){
        System.out.println("Pattern-20: ");
        int spaces = 2*n-2;
        for (int i = 0; i < 2*n-1; i++) {
            int stars = i<n ? i+1 : (2*n-1)-i;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if(i<n-1) spaces -= 2;
            else spaces += 2;
        }
    }
    public static void pattern21(int n){
        System.out.println("Pattern-21 : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern22(int n){
        System.out.println("Pattern-22 : ");
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                int right = (2*n-2)-j;
                int down = (2*n-2)-i;
                int minValue = Math.min(Math.min(i,down),Math.min(j,right));
                System.out.print(n- minValue+" ");
            }
            System.out.println();
        }
    }


    
    public static void main(String[] args) {
        System.out.println("Striver's Patterns : ");
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(5);
        System.out.println();
        pattern10(5);
        System.out.println();
        pattern11(5);
        System.out.println();
        pattern12(5);
        System.out.println();
        pattern13(5);
        System.out.println();
        pattern14(5);
        System.out.println();
        pattern15(5);
        System.out.println();
        pattern16(5);
        System.out.println();
        pattern17(5);
        System.out.println();
        pattern18(5);
        System.out.println();
        pattern19(5);
        System.out.println();
        pattern20(5);
        System.out.println();
        pattern21(5);
        System.out.println();
        pattern22(5);
        System.out.println();

    }
}
