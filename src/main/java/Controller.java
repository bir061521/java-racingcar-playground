import view.Car;
import view.InputView;
import view.OutputView;

import java.util.Scanner;

public class Controller {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OutputView outputView = new OutputView();
        InputView inputView = new InputView();

        System.out.println(outputView.name);
        String nameParam = sc.next();
        String[] arr = inputView.splitCar(nameParam);

        System.out.println(outputView.num);
        int numParam = sc.nextInt();
        inputView.tryNum(numParam);

        System.out.println(outputView.result);



        //car1 :
        //car2
        //car3

        Car car1 = new Car();
        car1.name = arr[0];
        String userName1 = car1.name;
        boolean user1=car1.randomNum(numParam);


        Car car2 = new Car();
        car2.name = arr[1];
        String userName2 = car2.name;
        boolean user2 = car2.randomNum(numParam);

        Car car3 = new Car();
        car3.name = arr[2];
        String userName3 = car3.name;
        boolean user3 = car3.randomNum(numParam);

        System.out.print(userName1 + ":");
        move(user1,numParam);
        System.out.println();

        System.out.print(userName2 + ":");
        move(user2,numParam);
        System.out.println();

        System.out.print(userName3 + ":");
        move(user3,numParam);



    }

    public static void move(boolean user, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("-");
        }

    }


}
