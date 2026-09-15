public class ProductArrayExceptItself {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] answer = new int[n];

        int prefix = 1;

        for (int i = 0; i < n; i++) {
            answer[i] = prefix;
            prefix = prefix * nums[i];
        }

        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * suffix;
            suffix = suffix * nums[i];
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] res = productExceptSelf(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i] +" ");
        }
    }
}
