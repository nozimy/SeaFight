/**
 * Created by Admin on 29.01.2016.
 */
public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;
    public void setLocationCells(int[] locs){
        locationCells = locs;
    }
    public String checkYourSelf(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        for (int cell: locationCells){
            if (cell == guess) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length){
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}
