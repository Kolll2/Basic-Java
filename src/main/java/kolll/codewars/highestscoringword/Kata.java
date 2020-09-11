package kolll.codewars.highestscoringword;

public class Kata {

    public static String high(String s) {
        long highScore = 0;
        String highScoreString = " ";
        for (String str : s.split(" ")){
            long temp = 0;
            if ((temp = calculateWordScore(str)) > highScore) {
                highScore = temp;
                highScoreString = str;
            }
        }
        return highScoreString;
    }

    private static long calculateWordScore(String str) {
        long temp = 0;
        for (char ch : str.toCharArray()){
            temp += ch - 96;
        }
        return temp;
    }

    //Best Practices
    /*
    public static String high(String s) {
    return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i - 96).sum()
                )).get();
  }
     */

}
