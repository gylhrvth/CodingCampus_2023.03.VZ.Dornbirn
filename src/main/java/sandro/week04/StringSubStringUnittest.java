package sandro.week04;

public class StringSubStringUnittest {
    public static void main(String[] args) {

        String text1 = "Hallo";
        String text2 = "all";

        String substring = longestSubString(text1,text2);
        System.out.println(substring);
    }

    public static String longestSubString(String text1,String text2) {

        int maxFoundLength = 0;
        String maxFoundString = null;



        for (int i = 0; i < text1.length(); i++) {
            for (int j = i; j <=text1.length() ; j++) {
                String substring1 = text1.substring(i,j);

                System.out.println(substring1);

//                if (substring1.contains(substring2)){
//                    int temp = substring1.length();
//                    if (temp > maxFoundLength){
//                        maxFoundLength = temp;
//                        maxFoundString = substring1;
//                    }
//                }
            }


        }


        return maxFoundString;
    }
}
