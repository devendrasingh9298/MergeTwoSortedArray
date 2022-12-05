public class index{
     public static void merge(int[] arr, int[] brr){
        int m = arr.length;
        int n = brr.length;

        int len = m+n;
        int[] ans = new int[len];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j < n){
            if(arr[i] < brr[j]){
                ans[k++] = arr[i++];
            }else{
                ans[k++] = brr[j++];
            }
        }
        while(i < m){
            ans[k++] = arr[i++];
        }
        while(j < n){
            ans[k++] = brr[j++];
        }
        for(i = 0; i <len; i++){
            System.out.print(ans[i]+" ");
        }
     }
    public static void main(String[] args){
        int[] arr = {1,5,7,9};
        int[] brr = {2,4,10};
        merge(arr,brr);
    }
}
