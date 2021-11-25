package kz.state.states;

import kz.state.Product;
import kz.state.VendingMachine;
import kz.state.VendingMachineState;

import java.util.Scanner;

public class SelectingProductState implements VendingMachineState {
    @Override
    public void nextStep(VendingMachine vm) {
        if (vm.getProducts().isEmpty()) {
            System.out.println("Sorry!!! Inventory is empty");
            System.out.println("LOG: State changed! | selecting product -> normal");
            vm.setState(new NormalState());
        } else {
            int i = 1;
            for (Product product: vm.getProducts()) {
                System.out.println(i + ") " + product.toString());
            }
            System.out.print("your choose: "); i = new Scanner(System.in).nextInt() - 1;
            if (vm.getProducts().get(i).getAmount() > 0) {
                vm.setState(new DepositeMoneyState());
                vm.setSelectedProduct(vm.getProducts().get(i));
                System.out.println("LOG: State changed! | selecting product -> deposite money");
            } else
            {
                System.out.println("Sorry!!! No product due to inventory depletion");
                System.out.println("LOG: State changed! | selecting product -> normal");
                vm.setState(new NormalState());
            }
        }
    }

    @Override
    public String toString() {
        return "selecting product state";
    }
}
