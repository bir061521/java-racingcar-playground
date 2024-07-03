package view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {
    @BeforeEach
    void setUp() {
        InputView inputView = new InputView();
        inputView.splitCar("pobi,crong,honux");


    }

    @Test
    void random(){
        Car car = new Car();
        for (int i = 0; i <100; i++) {
            boolean random = car.randomNum();
            assertTrue(random);
        }

    }

    @Test
    void goFront(){
        Car car = new Car();
        car.goFront();
        assertTrue(car.move==1);
    }
}
