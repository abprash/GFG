package com.gfg.www;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by fortress on 3/22/17.
 */
public class PatternTest {
    public static void main(String[] args) {
        String data = "private abstract class     ABC implements d,f,g{   ferfref";
        String pattern = "(public|protected|private)?\\s*(final|abstract)?\\s*(class|interface)\\s+(\\w+)(\\s+extends\\s+\\S+)?(\\s+implements\\s+\\S+)?\\s*[{]\\s*(.*)";
        String functionData = "visibility static return-type method-name (parameter-list) throws exceptions {";
        String data2 = " public    final String getName (int ID,int age, String desig  )      {";
        String pattern3 = "(public|private|protected)\\s*(static|final|abstract|synchronized)?\\s*(static|final|abstract|synchronized)?\\s*(static|final|abstract|synchronized)?\\s*(void|\\w+)\\s*(\\w+)?\\s*([(].*[)])\\s*([throws .*])?\\s*(.*)";
        Matcher m = Pattern.compile(pattern3).matcher(data2);
        if(m.find()) {
            for(int i=0;i<=m.groupCount();i++) {
                System.out.println("GROUP "+i+": "+m.group(i));
            }
        }
    }
}