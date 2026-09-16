class Solution {
    public String[] findWords(String[] words) {
        String[] rows = {
            "qwertyuiop",
            "asdfghjkl", 
            "zxcvbnm"
        };

       List<String> result = new ArrayList<>();

       for(String word : words){

        String lower = word.toLowerCase();
        int row = -1;

        for(int i = 0 ; i < 3 ; i++){
            if(rows[i].indexOf(lower.charAt(0)) != -1){
                row = i;
                break;
            }
        }

        boolean valid = true;

        for(int i = 1 ; i < word.length() ; i++){
           if(rows[row].indexOf(lower.charAt(i)) == -1){
            valid = false;
            break;
           }
        }

        if(valid){
            result.add(word);
        }
       }

       return result.toArray(new String[0]);
    }
}