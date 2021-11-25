package kz.state.states;

import kz.state.VendingMachine;
import kz.state.VendingMachineState;

public class NormalState implements VendingMachineState {
    @Override
    public void nextStep(VendingMachine vm) {
        vm.setState(new SelectingProductState());
        System.out.println("LOG: State changed! | normal -> selecting product");
    }

    @Override
    public String toString() {
        return "normal state";
    }
}
