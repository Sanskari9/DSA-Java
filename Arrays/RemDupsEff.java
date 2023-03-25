public class RemDupsEff {
    public static int remDups(int arr[]){
        int res= 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int arr[]={10,20,20,30,30,30};
        int el = remDups(arr);
        System.out.println(el);
    }
}
