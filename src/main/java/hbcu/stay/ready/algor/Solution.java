package hbcu.stay.ready.algor;

import java.util.*;

public class Solution {

    public Boolean harmlessRansomNote(String message , String magazineText){
        /*
        Goal: to see if the message has unique values from magazine text;
            if message is unique >true
            if not > false
        1. put magazine text in a set
        2. put message in a collection
        (3. Set.containsall to compare whether message is in magazine)

        3.loop to add to set
        4. if add = false then return false
            if add = true then continue and
         */

        //magazine set
        String[] magazineSplit= magazineText.split(" ");
        Set<String> magazineSet = new LinkedHashSet<>(Arrays.asList(magazineSplit));


        //message split into words
        String[] messageSplit = message.split(" ");


        for (String word:messageSplit) {
            if (!magazineSet.add(word)==true)
                return false;
            else {
                magazineSet.add(word);
                return true;
            }

        }
        return null;
    }
}
