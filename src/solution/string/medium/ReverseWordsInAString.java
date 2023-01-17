package solution.string.medium;


public class ReverseWordsInAString {

    public static void main(String[] args) {
        ReverseWordsInAString ob = new ReverseWordsInAString();
        System.out.println("example good a"+ob.reverseWords("a good   example"));
    }

    public String reverseWords(String s) {
        String[] temp = s.split(" ");
        String result = "";

        for (int i = 0; i < temp.length; i++) {

            if(temp[i].equals("")){
                continue;
            }

            if (i == temp.length - 1) {
                result = temp[i] + result;
            }
            else {
                    result = " "+ temp[i] + result;
            }
        }
        return result.trim();
    }
}
