package Java;

import java.util.*;

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
    /*This method will remove the character altogether and keep only unique chars */
    public static String removeDupChars(String str){
        HashMap<Character,Integer>map = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();
        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        map.forEach((ch,count)->{
            if(count==1){
                result.append(ch);
            }
        });
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "test";
        String output = removeDupChars(input);
        System.out.println(output);
    }
}
