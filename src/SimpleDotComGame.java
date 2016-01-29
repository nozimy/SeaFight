/**
 * Created by Admin on 29.01.2016.
 */
public class SimpleDotComGame {
    public static void main(String[] args){
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random()*5);
        int[] locations = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationCells(locations);
        boolean isActive = true;
        while (isActive == true){
            String guess = helper.getUserInput("Введите чило");
            String result = theDotCom.checkYourSelf(guess);
            numOfGuesses++;
            if (result.equals("Потопил")){
                isActive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
            }
        }
    }
}
