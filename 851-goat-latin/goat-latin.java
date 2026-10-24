class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");

        String ans = "";

        for(int i = 0; i < words.length; i++){
            String word = words[i];

            char ch = word.charAt(0);
            String goat = "";

            if(ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U'
            ){
                goat += word + "ma";
            }

            else{
                goat += word.substring(1) + word.charAt(0) + "ma";
            }

            for(int j = 0; j <= i; j++){
                goat += "a";
            }

            ans += goat + " ";
        }

        return ans.trim();
    }
}