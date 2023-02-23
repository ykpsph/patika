public class HarmonikOrtalama {
    public static void main(String[] args) {
        double[] arr = {1,2,3,4,5,6,7,8,9};
        double result = 0;

        for(int i = 1; i <= arr.length; i++){
            System.out.print("1/"+i + " ");
            result += 1 / arr[i-1];
        }
        System.out.println();
        System.out.println(result);
    }
}
