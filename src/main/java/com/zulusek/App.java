package com.zulusek;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        MachineInventory machineInventory = new MachineInventory();
        List<String> machine = List.of("Rotax", "MB12", "diesel");
        machineInventory.addMachine(machine);



    }
}
