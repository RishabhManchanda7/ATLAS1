public class task27 {

    public static void sum (int [] arr){
        int sum =0;

        for (int i=0; i <arr.length;i++){
            sum = arr[i]++;

            System.out.println(sum);
        }
    }
    public static void main(String[] args) {

        int arr [] = {3,2,1,5,4};

        sum (arr);
    }
}
