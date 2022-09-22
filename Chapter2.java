
class Chapter2{

    public static int countDigit(int n){
        if(n<0){
            n=-n;
        }        
        int c=0;
        while(n>0){
            n=n/10;
            c=c+1;
        }
        return c;
    }


    private static boolean isPal(int n) {

        int temp=n;
        int rev=0;
        int rem=0;
        while(n!=0){
            rem=n%10;
            rev=(rev*10)+rem;
            
            n=n/10;

        }
        System.out.println(rev);
        if(temp==rev){
            return true;
        }else{
            return false;
        }

        
    }

    public static int  recurFact(int n) {
        if(n==1)return 1;
        return recurFact(n-1)*(n);
        
    }
    public static int iterFact(int n) {
        int f=1;

        for(int i=2;i<=n;i++){
            f=f*i;
        }
        return f;
        
    }

    public static int recGCD(int a,int b){
        if(a==0)return b;
        if(b==0)return a;
        if(a==b)return a;

        if(a<b){
            return recGCD(a,b-a);
        }
        else{
            return recGCD(a-b,b);
        }
    }

    public static int iterGCD(int a,int b) {

        int rem=Math.min(a, b);

        while(rem!=0){
            if(a%rem==0 && b%rem==0){
                break;
            }
            rem=rem-1;
        }
        return rem;
        
    }
    // a*b= lcm * gcd

    public static int LCM(int a,int b) {

        return (a*b)/iterGCD(a, b);
        


    }

    public static boolean isPrime(int n){

        if( n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void printPrimefactors(int n){

            int x=2;

            while(n!=1){
                if(n%x==0){
                    n=n/x;
                    System.out.println(x+" ");
                }else{
                    x++;
                }
            }
    }

    public static void printPrimelessN(int n){

        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            
            if (prime[p] == true) {
             
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                System.out.print(i + " ");
        }

    }

    public static int givePower(int x,int y){

        if(y==0)return 1;

        if(y%2==0){

            return givePower(x, y/2)*givePower(x, y/2);
        }else{
            return givePower(x, y/2)*givePower(x, y/2)*x;
        }



    }



    public static void main(String[] args) {
        int n=12321;

        // System.out.println("----------------------");
        // System.out.println("Count of digit in "+n+ " : "+countDigit(n));
        // System.out.println("----------------------");
        
        // System.out.println("ispal "+n+ " : "+isPal(n));
        // System.out.println("----------------------");

        // System.out.println(recurFact(10));
        // System.out.println(iterFact(9));
        // System.out.println("----------------------");

        // System.out.println(recGCD(98, 56));
        // System.out.println(iterGCD(56, 98));
        // System.out.println("----------------------");

        // System.out.println(LCM(20, 15));
        // System.out.println("----------------------");

        // System.out.println(isPrime(843));
        // System.out.println("----------------------");

        // printPrimefactors(75);
        // System.out.println("----------------------");

       // printPrimelessN(50);

       System.out.println(givePower(2, 8));
    }
}