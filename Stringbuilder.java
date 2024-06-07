import java.util.*;
public class Stringbuilder {
    public static void main(String args[]){
        StringBuilder ch=new StringBuilder("charan");
        int i=0;
        int j=ch.length()-1;
        while(i<=j){
            char first = ch.charAt(i);
            char last=ch.charAt(j);
             ch.setCharAt(i,last);
             ch.setCharAt(j,first);
             i=i+1;
             j=j-1;

        }
        System.out.println(ch);

    }
    
}
