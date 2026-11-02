class Solution {
    public String reverseOnlyLetters(String s) {

        int left = 0;
        int right = s.length() - 1;

        char[] arr = s.toCharArray();

        while(left < right){
           if(!isEnglishLetter(arr[left])){
                left++;
           }else if(!isEnglishLetter(arr[right])){
                right--;
           }else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
           }
        }

        return new String(arr);
    }

    private boolean isEnglishLetter(char ch){
        int check = ch;
        return (check >= 97 && check <= 122) || (check >= 65 && check <= 90);
    }

}