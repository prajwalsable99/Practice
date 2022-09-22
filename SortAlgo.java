




public class SortAlgo{


   

    public  static void selectionSort(int [] arr){
        int min=-1;
        int temp;
        for(int i=0;i<arr.length -1 ;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){

                    min=j;
                }
            }

            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            
        }
    
    }

    public static void bubbleSort(int [] arr) {
        int temp;
        boolean swap=false;
        for(int i=0;i<arr.length-1;i++){
            swap=true;
            for(int j=0;j<arr.length -i-1;j++){

                if(arr[j]>arr[j+1]){
                    swap=false;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
            if(swap){
                break;
            }

        }
    }


    public static void insertionSort(int [ ]arr) {
        int key=-1,j=-1;
        for(int i=1;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key ){

                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        
    }

    public static int pivot(int [] arr,int s,int e){

        int piv=arr[e];
        int j=s-1;
        for(int i=s;i<e;i++){
            if(arr[i]<piv){
                j++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
      int temp = arr[e];
        arr[e] = arr[j+1];
        arr[j+1] = temp;

        return j+1;
    }

    public static void quickSort(int [ ] arr,int s,int e) {

        if(s<e){
        int piv=pivot(arr,s,e);
        quickSort(arr,s,piv-1);
        quickSort(arr,piv+1,e);
        }
    }


    public static void countSort(int [] arr) {
        int n=arr.length;
        
        int mn=Integer.MAX_VALUE;
        int mx=Integer.MIN_VALUE;

        for (int el : arr){
                mx=Math.max(mx,el);
                mn=Math.min(mn, el);

        }

        int range=mx-mn;
      //  System.out.println(range);
        int [] freq= new int[range+1];

        for(int i=0;i<range+1;i++){
            freq[i]=0;
        }

        for(int i=0;i<n;i++){

            int x=arr[i];
            freq[x-mn]+=1;
        }
        

        for (int i=1;i<freq.length;i++){
            freq[i]=freq[i]+freq[i-1];

        }
        
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){

            ans[ freq[ arr[i] -mn ]-1 ]=arr[i];
            freq[arr[i]-mn]=freq[arr[i]-mn]-1;
        }
        for(int x:ans){

            System.out.println(x);
        }

    }


        
  
    public static void main(String [ ] args){

        int [] arr ={4,5,6,1,11,-2,3,-90};
        //file1.selectionSort(arr);
        //bubbleSort(arr);
       // insertionSort(arr);
        //quickSort(arr, 0, arr.length-1);
        
        countSort(arr);
       // System.out.println("\n");
        // for(int x :arr){
        //     System.out.println(x);
        // }

       
    }


}