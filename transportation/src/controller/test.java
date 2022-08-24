package controller;

import model.transportation;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String args[])
    {
        List<transportation> list = new ArrayList<transportation>();
        int budget = 500;
        transportation car = new transportation(500, "car");
        list.add(car);
        transportation bus = new transportation(300, "bus");
        list.add(bus);
        transportation train = new transportation(400, "train");
        list.add(train);
        transportation plane = new transportation(1000, "plane");
        list.add(plane);

        System.out.println("You can take the ff:");
        for (transportation trans : list)
        {
            if (trans.getPrice()<= budget) {
                System.out.println(trans.getName());
            }
        }



    }

}
