/**
 * Created by James on 02/09/2017.
 */
public class StringUtils {

    public static boolean included(String word, String searched){
        String newWord = word.trim().toUpperCase();
        String newSearched = searched.trim().toUpperCase();
        if (newWord.contains(newSearched)){
            return true;
        }
        if (word.isEmpty()||searched.isEmpty()){
            return false;
        }
        return false;
    }
}
