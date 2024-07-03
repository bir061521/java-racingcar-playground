package view;

import java.util.Random;

public class Car {
    public String name;
    public int move;


    public Car() {}



    public boolean randomNum(int cnt) {
        for (int i = 0; i < cnt; i++) {
            Random random = new Random();
            int num =  random.nextInt(10);
            if(4<=num && num<=10) {
                goFront();
            }
            return false;
        }
      return true;
    }

    public int goFront() {
        return move++;
    }



}
