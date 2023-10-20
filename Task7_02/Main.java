package Task7_02;

public class Main {
    public static void main(String[] args) {
        MyDictionary<String> dictionary=new MyDictionary<>();
        dictionary.add("rainbow", "веселка");
        dictionary.add("ice","лід");
        dictionary.add("meat","м'ясо");
        System.out.println("Number of words is "+dictionary.getWordsCount());
        String word="ice";
        System.out.println(word+" is translated as "+dictionary.getTranslation(word));
    }
}
