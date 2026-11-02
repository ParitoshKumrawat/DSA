class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] arr: image){
            reverse(arr);
            flip(arr);
        }

        return image;
    }

    private void reverse(int[] arr){
        int n = arr.length;

        int left = 0;
        int right = n - 1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    private void flip(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                arr[i] = 1;
            }else{
                arr[i] = 0;
            }
        }
    }
}