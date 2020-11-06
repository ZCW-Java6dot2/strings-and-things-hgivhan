package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        char letter1 = 'y';
        char letter2 = 'z';
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) == letter1 || input.charAt(i) == letter2)
                    && (i == input.length() - 1 || input.charAt(i + 1) == ' ')) {
                result++;
            }
        }
        return result;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {
        String legit = base;
        String illegit = remove;
        String replaceIt = "";
        String master = legit.replace(illegit,replaceIt);
        return master;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        int indexEs = input.indexOf("is");
        int indexNo = input.indexOf("not");
        int countEs = 0;
        int countNo = 0;
        boolean trueFalse;
        String input2 = input;

        while (indexEs != -1) {
            String newIn = input2.substring(indexEs+2);
            int indexx = newIn.indexOf("is");
            indexEs = indexx;
            countEs++;
            input2 = newIn;
        }
        input2 = input;

        while (indexNo != -1){
            String newIn2 = input2.substring(indexNo+3);
            int indexx2 = newIn2.indexOf("not");
            indexNo = indexx2;
            countNo++;
            input2 = newIn2;

            }
            if (countEs == countNo) {
                trueFalse = true;
            } else {
                trueFalse = false;
            }
        return trueFalse;
     }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        String toFind = "gg";
        boolean substring = input.contains(toFind);
        return substring; }

    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int count = 0;

        for (int i = 0; i < input.length()-2; i++) {
            char ch = input.charAt(i);
            if (ch == input.charAt(i+1) && ch == input.charAt(i+2))
                count++;
        }
        return count; }
    }
