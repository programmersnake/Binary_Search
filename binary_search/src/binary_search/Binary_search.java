package binary_search;

/**
 *
 * @author kosti_dgizedt
 */
public class Binary_search {

    public static void main(String[] args) {
        //int[] array = sortArr(array(1000));
        int[] array = {1,2,4,5,7,8,9,10,11,22,44,50,51,53,54,55,57,97,100};
        int start=0, end=array.length; int temp, search=11;
        for(int i=0;i<array.length/2;i++){
            temp=array[(start+end)/2];
            if(temp>search)
                end=(start+end)/2;
            else if(temp<search)
                start=(start+end)/2;
            else if(temp==search||end==start){
                System.out.println(temp+"["+((start+end)/2)+"]Hachel!!!");    
                break;            
            }
        }
    }
    
    static int[] array(int n){
        int Array[]=new int[n];
        for(int i=0;i<n;i++)
            Array[i]=(int)(Math.random()*100);
        return Array;
    }
    
    static int[] sortArr(int arr[]){
        for(int i=0;i<arr.length-1;i++) {
            int temp;            
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i=-1;
            }             
        }
    return arr;
    }
}
