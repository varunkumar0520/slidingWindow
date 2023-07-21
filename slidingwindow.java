import java.util.Arrays;

class slidingwindow{
    public static void main(String args[]){
        System.out.println("hello world");
        int[] arr = {1,3,2,6,-1,4,1,8,2};

        System.out.println(Arrays.toString(findAve(arr, 5)));

    }

    public static double[] findAve(int[] arr, int k){
        
        double[] ret = new double[arr.length - k + 1];

        int end = 0;
        double sum = 0;
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            System.out.println("a: " + sum);
            if(i >= k - 1){
                ret[index] = sum / k;
                sum -= arr[index];
                System.out.println("b: " + sum);
                index++;
            }
        }

        return ret;
    }

}

