class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String>unique = new HashSet<>() ;
     String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};
    for(String word : words){
        StringBuilder transform = new StringBuilder();
        for(char x : word.toCharArray()){
            transform.append(MORSE[x - 'a']);
        }
        unique.add(transform.toString());
    }
    return unique.size();
    
    } 
   
}
