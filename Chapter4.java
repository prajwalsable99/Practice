public class Chapter4 {
    
    public static int fact(int n) {
        if( n==0)return 1;
        return fact(n-1)*n;
        
    }

    public static int fib(int n) {
        if(n==1)return 0;
        if(n==2)return 1;
        return fib(n-1)+fib(n-2);
        
    }
    public static void print1_N(int n) {
        if(n==0)return ;
        print1_N(n-1);
        System.out.println(n);
        
    }
    public static void printN_1(int n) {
        if(n==0)return ;
        System.out.println(n);
        printN_1(n-1);
        
        
    }

    public static int ispal(String s,int i,int j) {

        if(i>=j)return 1;

        if(s.charAt(i)!=s.charAt(j))return 0;

        return ispal(s,++i,--j);
        
    }
    public static int sumdig(int n){

        if(n==0){
            return 0;
        }
        
        return n%10 + sumdig(n/10);
    }


    public static int rodcut(int []arr ,int n){

        if(n==0)return arr[0];
        int ans =Integer.MIN_VALUE;
        for(int i=0;i<n;i++){

           ans= Math.max(ans, arr[i]+rodcut(arr,n-i-1));
        }
        return ans;
    }

    public static void main(String[] args) {
        
        System.out.println("---------------------------");
        //System.out.println(fact(5));

        //System.out.println(fib(5));
        // print1_N(12); 
        // printN_1(12);

        // String s="wddw";
        // System.out.println(ispal(s, 0, s.length()-1));

        //int x=12345;
       
        
        //System.out.println(sumdig(x));


        //rod cutting

        // int arr[ ] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        // System.out.println(rodcut(arr, arr.length));
    }
}
