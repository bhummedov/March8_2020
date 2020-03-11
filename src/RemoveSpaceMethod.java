public class RemoveSpaceMethod {
    public static void main(String[] args) {
        stringArray("I like to be part of company");
    }

    public static void stringArray(String words) {
        String result = " ";
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) != ' ') {
                result += words.charAt(i);
                System.out.println(removeSpace("We are today Java warriors"));
            }
        }

        System.out.println(result);
    }
public static String removeSpace (String sentence){
    String result=" ";
    for (int i=0; i<sentence.length(); i++){
        if (sentence.charAt(i)!=' ')
            result+=sentence.charAt(i);
        else{
            result+='-';
        }
    }
    return result;
}
}


