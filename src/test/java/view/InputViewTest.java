package view;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {


    @Test
    void car(){
        InputView inputView = new InputView();

        String[]arr = inputView.splitCar("car,123,234");

        int arrLength = 3;
        assertEquals(arr.length, arrLength);
    }


    @Test
    void carNameLength1(){
        InputView inputView = new InputView();

        String[]arr = inputView.splitCar("car234235,123,234");

        //메소드
        int result = inputView.validate(arr);
        assertEquals(0, result, "자동차 이름이 5글자 넘는지 확인");
    }
    @Test
    void carNameLength2(){
        InputView inputView = new InputView();

        String[]arr = inputView.splitCar("ca,123,234");

        //메소드
        int result = inputView.validate(arr);
        assertEquals(1, result, "자동차 이름이 5글자 안넘는지");
    }
    @Test
    void num(){
        InputView inputView = new InputView();
        int tryNum = 5;
        inputView.tryNum(tryNum);

    }

}