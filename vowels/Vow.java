import java.util.*;

public class Vow{
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string:");
        String input = scanner.nextLine();
        int vowelcount = 0;
        for(char ch : input.toLowerCase().toCharArray()){
            if(isVowel(ch)){
                System.out.println(ch+" is a vowel");
                vowelcount++;
            }
        }
        System.out.println("total number of vowels:"+vowelcount);
        scanner.close();
    }
    public static boolean isVowel(char ch){
        return ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u';
    }
}