package view;

//자동차 이름과, 시도할 횟수 이력받는다.
public class InputView {
    public int tryNum;

    public String[] splitCar(String input) {
        return input.split(",");
    }

    public void tryNum(int input){
        this.tryNum = input;
    }

    public int validate(String[]arr){
        for (String x : arr) {
            if (x.length() > 5) return 0;
        }
        return 1;
    }
}
