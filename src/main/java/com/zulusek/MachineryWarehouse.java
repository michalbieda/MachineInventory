package com.zulusek;

import java.util.List;
import java.util.Scanner;

public class MachineryWarehouse {

    int addMachine() {
        System.out.println("You are to add new machine to the database.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Specify the manufacturer:");
        String manufacturer = scanner.nextLine();
        System.out.println("Specify model:");
        String model = scanner.nextLine();
        System.out.println("Enter the year of production:");
        String productionDate = scanner.nextLine();

        List<String> machine = List.of(manufacturer, model, productionDate);

        if (new MachineryWarehouse().addMachine(machine)) {
            System.out.println("Success!");
            System.out.println(machine);
            return 1;
        } else {
            System.out.println("An error occurred!");
            return -1;
        }

    }


    boolean addMachine(List<String> machine) {
        new Machine(machine.get(0), machine.get(1), machine.get(2));
        return true;
    }


}
