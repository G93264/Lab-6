package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       Animal[] farmAnimals = {
               new Cow("Martha"),
               new Chicken("Ken")
                };

        for (Animal a: farmAnimals) {
            System.out.println(a.feed());
        }

        for (Animal a: farmAnimals) {
            if(a instanceof Cow){
                ((Cow) a).milk();
            }
            if (a instanceof Chicken){
                ((Chicken) a).layEgg();
            }
        }

        farmAnimals = Arrays.copyOf(farmAnimals, 4);
        farmAnimals[2] = new Cow("Betina");
        farmAnimals[3] = new Chicken("Chickeletta");




//        Non Generic List
        List myfarmList = new ArrayList();
        for (Animal a:
             farmAnimals) {
            myfarmList.add(a);
        }
//        Print Array List to Console
        System.out.println(myfarmList);

//        Print Names Array List to Console
        for (Object o:
             myfarmList) {
            System.out.println(((Animal) o).getName());
            }

//        Remove last two elements

        myfarmList.remove(myfarmList.size()-2);
        myfarmList.remove(myfarmList.size()-1);

        ((ArrayList) myfarmList).trimToSize();

//        Generic List
        List<Animal> myFarmGeneric = new ArrayList<>(myfarmList);
        for (Animal a:
             myFarmGeneric) {
            System.out.println(a.getName());
            if (a instanceof Cow ){
                ((Cow) a).milk();
            }
            else if (a instanceof Chicken){
                ((Chicken) a).layEgg();
            }
        }

    }
}
