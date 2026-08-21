class Solution {
    public int maxArea(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int width,height,flag = 0;
        int maxAns = 0;

        while(start < end){
            width = end-start;
            height = Math.min(arr[start],arr[end]);

            maxAns = Math.max(maxAns,(height * width));

            if (arr[start] < arr[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxAns;

    }
}
