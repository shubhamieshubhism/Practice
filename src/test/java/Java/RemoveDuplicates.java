package Java;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicates {
    /*Remove characters which occurs twice altogether*/
    public static String removeDup(String str){
        Map<Character,Integer>map = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();
        for(char ch :str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : str.toCharArray()){
            if(map.get(ch)<2){
                result.append(ch);
            }
        }
        return result.toString();
    }
    /*This method remove character which has been occurs twice but keep the one of them */
    public static String removeDups(String str){
        Set<Character>set=new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }
}
