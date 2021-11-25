package kz.state.states;

import kz.state.VendingMachine;
import kz.state.VendingMachineState;

public class FinalState implements VendingMachineState {
    @Override
    public void nextStep(VendingMachine vm) {
        System.out.println("Result: \n-------------------");
        System.out.println("You have: " + vm.getSelectedProduct().toString());
        System.out.println("Your change: " + vm.getChange() + "tg");
        System.out.println("Good bye");

        vm.setState(new NormalState());
        vm.setSelectedProduct(null);
        vm.setChange(0);

        System.out.println("LOG: State changed! | final state -> normal");
    }

    @Override
    public String toString() {
        return "final state";
    }
}
