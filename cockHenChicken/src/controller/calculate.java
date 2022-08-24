package controller;

import model.*;

public class calculate {



    public static void main(String[] args)
    {
        chicken chicken = new chicken(3);

        cock cock = new cock(5);

        hen hen = new hen(3);

        int cocknum;
        int hennum;
        int chickennum;

        for (cocknum = 1 ; cocknum<100/cock.getPrice(); cocknum++)
        {
            for (hennum = 1 ; hennum<100/chicken.getPrice(); hennum++)
            {
                chickennum = (100 - cocknum * cock.getPrice() - hennum * hen.getPrice()) * chicken.getPrice();


                if (chickennum + cocknum + hennum == 100)
                {
                    System.out.println("Chicken: " + chickennum);
                    System.out.println("Cock: " + cocknum);
                    System.out.println("Hen: " + hennum);

                    System.out.println("total cost of all is " + (cocknum * cock.getPrice() + hennum * hen.getPrice() + chickennum/chicken.getPrice()));
                    System.out.println("total amount is " + (chickennum + cocknum + hennum));
                }
            }
        }
    }


}
