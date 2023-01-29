package classes.dice;

import java.util.Random;

public class Dice {
    private int randomMostNum = createRandomNum(6, 1);
    private int point;

    public int getRandomMostNum() {
        return randomMostNum;
    }

    public int getPoint() {
        return point;
    }

    public int createRandomNum(int max, int min) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public void setPoint() {
        int randomArray[] = new int[100];
        int x = getRandomMostNum();
        switch(x) {
            case 1:
                for (int i = 0; i < 20; ++i) randomArray[i] = 1;
                for (int i = 20; i < 100; i += 5) {
                    randomArray[i] = 2;
                    randomArray[i + 1] = 3;
                    randomArray[i + 2] = 4;
                    randomArray[i + 3] = 5;
                    randomArray[i + 4] = 6;
                }
                break;
            case 2:
                for (int i = 0; i < 20; ++i) randomArray[i] = 2;
                for (int i = 20; i < 100; i += 5) {
                    randomArray[i] = 1;
                    randomArray[i + 1] = 3;
                    randomArray[i + 2] = 4;
                    randomArray[i + 3] = 5;
                    randomArray[i + 4] = 6;
                }
                break;
            case 3:
                for (int i = 0; i < 20; ++i) randomArray[i] = 3;
                for (int i = 20; i < 100; i += 5) {
                    randomArray[i] = 1;
                    randomArray[i+1] = 2;
                    randomArray[i+2] = 4;
                    randomArray[i+3] = 5;
                    randomArray[i+4] = 6;
                }
                break;
            case 4:
                for (int i = 0; i < 20; ++i) randomArray[i] = 4;
                for (int i = 20; i < 100; i += 5) {
                    randomArray[i] = 1;
                    randomArray[i + 1] = 2;
                    randomArray[i + 2] = 3;
                    randomArray[i + 3] = 5;
                    randomArray[i + 4] = 6;
                }
                break;
            case 5:
                for (int i = 0; i < 20; ++i) randomArray[i] = 5;
                for (int i = 20; i < 100; i += 5) {
                    randomArray[i] = 1;
                    randomArray[i + 1] = 2;
                    randomArray[i + 2] = 3;
                    randomArray[i + 3] = 4;
                    randomArray[i + 4] = 6;
                }
                break;
            case 6:
                for (int i = 0; i < 20; ++i) randomArray[i] = 6;
                for (int i = 20; i < 100; i += 5) {
                    randomArray[i] = 1;
                    randomArray[i + 1] = 2;
                    randomArray[i + 2] = 3;
                    randomArray[i + 3] = 4;
                    randomArray[i + 4] = 5;
                }
                break;
        }
        int index = createRandomNum(99, 0);
        this.point =  randomArray[index];
    }
}
