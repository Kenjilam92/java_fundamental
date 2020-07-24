import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava {
    public static void main (String[] args) {
        ArrayList<Integer> X = new ArrayList<Integer>();
        X.add(3);
        X.add(5);
        X.add(1);
        X.add(2);
        X.add(7);
        X.add(9);
        X.add(8);
        X.add(13);
        X.add(25);
        X.add(32);
        printArrayList(X);
        printArrayList(checkGreater(X,10));
        ArrayList <String> Names= new ArrayList<String>();
        Names.add("Nancy");
        Names.add("Jinichi");
        Names.add("Fujibayashi");
        Names.add("Momochi");
        Names.add("Ishikawa");
        printArrayStringList(Names);
        printArrayStringList(moreThanChar(Names,5));

        ArrayList<String> Alphabets = new ArrayList<String>();
        for (int i=0; i<26; i++){
            char tempChar = (char)(i+'a');
            Alphabets.add(String.format("%s",tempChar));
        }
        ShuffleAndCheckVowel(Alphabets);
//        printArrayStringList(Alphabets);
        ArrayList<Integer> ranInt = TenRandomFrom55To100();
        printArrayList(ranInt);
        SortArrayMinMax(ranInt);
        printArrayList(ranInt);
        printArrayStringList(RandomStringList(10,5));
    }
    public static ArrayList<String> RandomStringList (int ListLength, int StringLength){
        ArrayList<String> result = new ArrayList<String>();
        for (int i=0; i<ListLength; i++){
            result.add(RandomChar(StringLength));
        }
        return result;
    }
    public static String RandomChar (int num){
        Random r = new Random();
        String result = "";
        for (int i=0; i<num; i++) {
            char c = (char)(r.nextInt(26)+'a');
            result = result + c;
        }
        return result;
    }
    public static ArrayList<Integer> TenRandomFrom55To100(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        Random r = new Random();
        while(a.size()<10){
            a.add(r.nextInt(45) + 55);
        }
        return a;
    }
    public static void SortArrayMinMax (ArrayList<Integer> a){
        Collections.sort(a);
        System.out.println("Max is: " + a.get(a.size()-1));
        System.out.println("Min is: " + a.get(0));
    }
    public static void ShuffleAndCheckVowel ( ArrayList<String> a){
        Collections.shuffle(a);
        System.out.println("Shuffled! First character is " + a.get(0));
        if (a.get(0).equals("a")  || a.get(0).equals("e")  || a.get(0).equals("i") || a.get(0).equals("o") || a.get(0).equals("u")){
            System.out.println("Yay! It's a vowel");
        }
    }
    public static void printArrayList( ArrayList<Integer> x){
        System.out.print("[");
        for (int i=0; i<x.size()-1;i++){
            System.out.print( x.get(i) + ",");
        }
        System.out.println(x.get(x.size()-1)+"]");
    }
    public static ArrayList<String> moreThanChar(ArrayList<String> a, int b){
        ArrayList<String> result = new ArrayList<String>();
        for (String i : a){
            if (i.length() > b){
                result.add(i);
            }
        }
        return result;
    }
    public static void printArrayStringList( ArrayList<String> x){
        System.out.print("[");
        for (int i=0; i<x.size()-1;i++){
            System.out.print( x.get(i) + ",");
        }
        System.out.println(x.get(x.size()-1)+"]");
    }
    public static ArrayList<Integer> checkGreater(ArrayList<Integer> x,int a){
        ArrayList<Integer> results = new ArrayList<Integer>();
        for (int num : x){
            if (num > a){
                results.add(num);
            }
        }
        return results;
    }
}
