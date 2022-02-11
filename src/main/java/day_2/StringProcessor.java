package day_2;

public class StringProcessor {
    public static void main(String[] args) {
        //Task 2. Given a string, find the number of words in it.

        String s = "Given a string, find the number of words in it";
        System.out.println(s.split(" ").length);

        String[] wordArray = s.split(" ");

        //Task 3. Given a string, show number of chars in each word
        for(String w:wordArray){
            System.out.println(w + " = " + w.length()+"\t");
        }

        //Task 4. Create function which takes 2 parameters:
        //1st(String) – text; 2nd (int) - index of word.
        //Function should return number of chars in word by its index in text

        System.out.println(stringWCount(wordArray, 4));
    }

    private static int stringWCount(String[] wordArray, int i) {
        if(wordArray.length < (i+1)){
            throw new RuntimeException("Invalid index. must be < " + (wordArray.length-1));
        }
        return wordArray[i].length();
    }
}
