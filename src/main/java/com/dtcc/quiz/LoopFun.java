package com.dtcc.quiz;

public class LoopFun {
    /**
     * Given a number, return the factorial of that number.
     * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
     * @param number
     * @return the factorial of the number
     */
			    	       
    public Integer factorial(Integer number){
    	    int factorial = number;
            for(int i = number-1; i > 0; i--){
                factorial = i * factorial;
            }
            return factorial;
    }    


    /**
     * Given a phrase, get the acronym of that phrase. Acronym is the combination of
     * the first character of each word in upper case.
     * For example, given "Ruby on Rails", this method will return "ROR"
     * @param phrase
     * @return Upper case string of the first letter of each word
     */
    
    public String acronym(String phrase) {
        String strAcro="";
        for(String newAcro:phrase.split(" "))
            strAcro += newAcro.charAt(0);
        return strAcro.toUpperCase();

    }

    /**
     * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
     * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
     * at the end of the alphabet, it will wraps around.
     * For example:
     *  'a' => 'd'
     *  'w' => 'z'
     *  'x' => 'a'
     *  'y' => 'b'
     * @param word
     * @return the encrypted string by shifting each character by three character
     */

    public String encrypt(String word) {
        int j = 0;
        String newEncrypt = "";

        for(int i=0; i < word.length();i++){
            j = (int)(word.charAt(i));

            //Less then x check
            if((j >= 65 && j <= 87)
                    ||(j >= 97 && j <=119));
            newEncrypt += (char)(j + 3);

            //Greater than = x check
            if((j >= 88 && j <= 90)
                    ||(j >= 120 && j <=122));
            j -= 23;

        }
        //Encrypted string
        return newEncrypt;

    }
}
