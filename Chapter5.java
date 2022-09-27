import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Chapter5 {

 
    public static void reverseArr(int [] arr,int i ,int j) {

        while(i<j){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;j--;
        }

        // for(int x:arr){
        //     System.out.println(x);
        // }
        
    }


    public static void rotateL1(int [] arr){

        int x=arr[0];

        for (int i=0;i<arr.length-1;i++){

            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=x;

        for(int i:arr){
            System.out.println(i);
        }

    }

    public static boolean isSorted(int [] arr) {

        for(int i=0;i<arr.length-1;i++){

            if(arr[i]>arr[i+1]){

                return false;
            }
        }
        return true;
    }

    public static void rotLK(int []arr ,int k){
        k=k%arr.length;

        reverseArr(arr, 0, k-1);
        reverseArr(arr,k,arr.length-1);
        reverseArr(arr,0,arr.length-1);
       

    }

    public static void printLeaders(int arr []) {

        Stack<Integer> st = new Stack<Integer>();
  
        
        int n=arr.length;
        int ld=arr[n-1];
        //System.out.println(ld);
        st.push(ld);
        

        for(int i=n-2;i>=0;i--){
            if(ld<arr[i]){
                // System.out.println(arr[i]);
                st.push(arr[i]);
                ld=arr[i];
            }

        }

        while(!st.empty()){

            System.out.println(st.peek());
            st.pop();
        }
        
    }


    public static void maxdiffProb(int [] arr){
        int n=arr.length;
        int mn=arr[0];
        int diff=Integer.MIN_VALUE;
        


        for(int i=1;i<n;i++){
                if(arr[i]-arr[0]>diff){
                    diff=arr[i]-arr[0];
                }
                mn=Math.min(mn, arr[i]);

        }

        System.out.println(diff);
    }

    public static void printfreq(int arr[]) {
        int n=arr.length;
       
        int c=1;
        for(int i=1;i<n;i++){

            if(arr[i]==arr[i-1]){
                c=c+1;
            }else{

                System.out.println(arr[i-1] +"==>"+c);
                c=1;

            }

        }
 
            System.out.println(arr[n-1]+"==>"+c);
        
    }


    public static void  mxproftstock(int [] arr) {

        int mn=arr[0];
        int ans=0;

        for(int i=1;i<arr.length;i++){
            mn=Math.min(mn, arr[i]);
            if(arr[i]-mn>ans){
                ans=arr[i]-mn;
            }
           
        }

        System.out.println(ans);
        
    }

    public static int traprainwater(int [] arr) {

        int n=arr.length;
        int [] left=new int[n];
        int [] right=new int[n];
        int ans=0;
        left[0]=arr[0];
        right[n-1]=right[n-1];

        for(int i=1;i<n;i++){

            left[i]= Math.max(left[i-1], arr[i]);
        }

        for(int i=n-2;i>=0;i--){

            right[i]=Math.max(right[i+1],arr[i]);
        }

        ans=0;
        for(int i=1;i<n-1;i++){
            ans =ans + ( (Math.min(left[i], right[i]) - arr[i]));

        }
        
        return ans;

        
    }

    public static void main(String[] args) {
        
        System.out.println("------------------------");
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int n = arr.length;
        System.out.println(traprainwater(arr));
        
    }
    
}
