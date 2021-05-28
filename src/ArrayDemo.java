public class ArrayDemo {
    public static void main(String[] args) {
        int temp;
        int[] arr = {1,3,6,9,80,7};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
