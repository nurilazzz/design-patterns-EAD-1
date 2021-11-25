package kz.state.states;

import kz.state.VendingMachine;
import kz.state.VendingMachineState;

import java.util.Scanner;

public class DepositeMoneyState implements VendingMachineState {
    int change1000tg = 0, change500tg = 0, change200tg = 0, change100tg = 0;
    @Override
    public void nextStep(VendingMachine vm) {
        Scanner scanner = new Scanner(System.in);
        vm.listCurrencies();
        System.out.println("\nEnter the " + vm.getSelectedProduct().getPrice() + " tenge: ");
        System.out.print("100tg: "); int tg100 = scanner.nextInt();
        System.out.print("200tg: "); int tg200 = scanner.nextInt();
        System.out.print("500tg: "); int tg500 = scanner.nextInt();
        System.out.print("1000 tg: "); int tg1000 = scanner.nextInt();

        vm.getCurrencies().put("100tg", vm.getCurrencies().getOrDefault("100tg", 0) + tg100);
        vm.getCurrencies().put("200tg", vm.getCurrencies().getOrDefault("200tg", 0) + tg200);
        vm.getCurrencies().put("500tg", vm.getCurrencies().getOrDefault("500tg", 0) + tg500);
        vm.getCurrencies().put("1000tg", vm.getCurrencies().getOrDefault("1000tg", 0) + tg1000);

        int change = (tg100*100 + tg200*200 + tg500*500 + tg1000*1000) - vm.getSelectedProduct().getPrice(); // total - price = change
        if (change != 0)
            if (canGiveChange(vm, change)) {
                vm.setChange(change);
                System.out.println("You've got change in value: " + change);
                vm.listCurrencies();
                vm.setState(new FinalState());
                System.out.println("LOG: State changed! | deposite money -> final state");
            } else {
                vm.setChange(0);
                System.out.println("Sorry!!! we cannot give change to you");
                System.out.println("LOG: State changed! | selecting product -> normal");
                vm.setState(new NormalState());
            }
        else {
            vm.setChange(0);
            vm.setState(new FinalState());
            System.out.println("LOG: State changed! | deposite money -> final state");
        }
    }

    public boolean canGiveChange(VendingMachine vm, int change){
        boolean result = false;
        // MachineWallet:  1000tg: 2  |  500tg: 2  |  200tg: 2 |  100tg: 2  // price: 800tg
        // UserWallet:     1000tg: 0  |  500tg: 1  |  200tg: 2 |  100tg: 0  //total: 900tg
        // ################################################################################
        // finalWallet:    1000tg: 2  |  500tg: 3  |  200tg: 4 |  100tg: 2
        // change: 100tg

        if (change >= 1000) {
            int inMachine1000tg = vm.getCurrencies().getOrDefault("1000tg", 0);
            if (change / 1000 <= inMachine1000tg) { // купюр по 1000 больше в машине
                change1000tg = change / 1000;
                change = change % 1000;
            } else {
                change1000tg = inMachine1000tg;
                change = change - (1000 * inMachine1000tg);
            }
        }

        if (change >= 500) {
            int inMachine500tg = vm.getCurrencies().getOrDefault("500tg", 0);
            if (change / 500 <= inMachine500tg) { // купюр по 500 больше в машине
                change500tg = change / 500;
                change = change % 500;
            } else {
                change500tg = inMachine500tg;
                change = change - (500 * inMachine500tg);
            }
        }

        if (change >= 200) {
            int inMachine200tg = vm.getCurrencies().getOrDefault("200tg", 0);
            if (change / 200 <= inMachine200tg) { // купюр по 200 больше в машине
                change200tg = change / 200;
                change = change % 200;
            } else {
                change200tg = inMachine200tg;
                change = change - (200 * inMachine200tg);
            }
        }

        if (change >= 100) {
            int inMachine100tg = vm.getCurrencies().getOrDefault("100tg", 0);
            if (change / 100 <= inMachine100tg) { // купюр по 100 больше в машине
                change100tg = change / 100;
                change = change % 100;
            } else {
                change100tg = inMachine100tg;
                change = change - (100 * inMachine100tg);
            }
        }

        if (change <= 0) {
            result = true;
            vm.getCurrencies().put("100tg", (vm.getCurrencies().getOrDefault("100tg", 0) - change100tg));
            vm.getCurrencies().put("200tg", (vm.getCurrencies().getOrDefault("200tg", 0) - change200tg));
            vm.getCurrencies().put("500tg", (vm.getCurrencies().getOrDefault("500tg", 0) - change500tg));
            vm.getCurrencies().put("1000tg", (vm.getCurrencies().getOrDefault("1000tg", 0) - change1000tg));
        }

        return result;
    }

    @Override
    public String toString() {
        return "Deposite Money State";
    }
}
