import java.util.Scanner;


//PROBLEM 1:
//public class Main {
//    static Scanner scr = new Scanner(System.in);
//    public static void main(String[] args) {
//        int n = scr.nextInt();
//        int nums[] = new int[n];
//        for(int i = 0 ; i<n; i++){
//            nums[i] = scr.nextInt();
//        }
//        int min = nums[n-1];
//        int a = defMin(n,nums,min);
//        System.out.println(a);
//    }
//    public static int defMin(int n, int[] nums, int min) {
//        n = n - 1;
//        if(n == 0){return min;}
//            if (nums[n] < min) {
//                min = nums[n];
//            }
//        return defMin(n,nums,min);
//    }
//}


//PROBLEM 2:
//public class Main{
//    static Scanner scr = new Scanner(System.in);
//    public static void main(String[] args) {
//        int n = scr.nextInt();
//        int nums[] = new int[n];
//        for(int i = 0 ; i<n; i++){
//          nums[i] = scr.nextInt();
//        }
//        double a = defSum(n,nums) / (nums.length * 1.0);
//        System.out.println(a);
//    }
//    public static int defSum(int n, int[] nums) {
//        n=n-1;
//        if(n==-1){return 0;}
//        return nums[n] + defSum(n,nums);
//    }
//}


//PROBLEM 3:
//public class Main {
//    static Scanner scr = new Scanner(System.in);
//    public static void main(String[] args){
//        int n = scr.nextInt();
//        int counter= n/2;
//        boolean a = isPrime(n, counter);
//        if(a == true){System.out.println("Prime");}
//        else{System.out.println("Composite");}
//
//    }
//    public static boolean isPrime(int n, int counter){
//        if (n<2){return false;}
//        if (counter == 1){return true;}
//        if (n%counter==0){return false;}
//        counter = counter -1;
//        return isPrime(n,counter);
//    }
//}


//PROBLEM 4:
//public class Main{
//    static Scanner scr = new Scanner(System.in);
//    public static void main(String[] args){
//        int n = scr.nextInt();
//        System.out.println(defFactorial(n));
//    }
//    public static int defFactorial(int n){
//        if(n==0||n==1){return 1;}
//        return n * defFactorial(n-1);
//    }
//}


//PROBLEM 5:
//public class Main {
//    static Scanner scr = new Scanner(System.in);
//    public static void main(String[] args){
//        int n = scr.nextInt();
//        System.out.println(defFibNum(n));
//    }
//    public static int defFibNum(int n){
//        if (n==0){return 0;}
//        if (n==1){return 1;}
//        return defFibNum(n-2)+ defFibNum(n-1);
//    }
//}


//PROBLEM 6:
//public class Main {
//    static Scanner scr = new Scanner(System.in);
//    public static void main(String[] args){
//        int a = scr.nextInt();
//        int n = scr.nextInt();
//        System.out.println(defPower(a,n));
//    }
//    public static int defPower(int a, int n) {
//        if (n == 0) {return 1;}
//        if (n % 2 != 0) {return a * defPower(a, n - 1);}
//        else {
//            int temp = defPower(a, n / 2);
//            return temp * temp;
//        }
//    }
//}


//PROBLEM 7:
//public class Main {
//    static Scanner scr = new Scanner(System.in);
//    public static void main(String[] args) {
//        char[] a = scr.next().toCharArray();
//        allPerm(a, 0);
//    }
//    public static void allPerm(char[] a, int curInd) {
//        if (curInd == a.length - 1) {
//            System.out.println(a);
//        } else {
//            for (int i = curInd; i < a.length; i++) {
//                swap(a, curInd, i);
//                allPerm(a, curInd + 1);
//                swap(a, curInd, i);
//            }
//        }
//    }
//    public static void swap(char[] a, int i, int j) {
//        char temp = a[i];
//        a[i] = a[j];
//        a[j] = temp;
//    }
//}


//PROBLEM 8:
//public class Main {
//    static Scanner scr = new Scanner(System.in);
//    public static void main(String[] args){
//        char[] a = scr.next().toCharArray();
//        int ind = a.length-1;
//        boolean s = digCheck(a, ind);
//        if(s == true){System.out.println("Yes");}
//        else{System.out.println("No");}
//    }
//    public static boolean digCheck(char[] a, int ind) {
//        char[] alp = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
//        for(int i = 0;i< alp.length-1; i++){
//            if (a[ind] == alp[i]) {
//                return false;
//            }
//        }
//        if (ind ==0){
//            return true;
//        }
//        return digCheck(a, ind-1);
//    }
//}


//PROBLEM 9:
//public class Main {
//    static Scanner scr = new Scanner(System.in);
//    public static void main(String[] args){
//        int n = scr.nextInt();
//        int k = scr.nextInt();
//        System.out.println(defBinCoeff(n,k));
//    }
//    public static int defBinCoeff(int n, int k){
//        if(k == 0|| k==n){return 1;}
//        return defBinCoeff(n-1,k-1) + defBinCoeff(n-1,k);
//    }
//}


//PROBLEM 10:
//public class Main {
//    static Scanner scr = new Scanner(System.in);
//    public static void main(String[] args){
//        int a = scr.nextInt();
//        int b = scr.nextInt();
//        System.out.println(gcd(a,b));
//    }
//    public static int gcd(int a, int b){
//        if(b==0){return a;}
//        return gcd(b,a%b);
//    }
//}