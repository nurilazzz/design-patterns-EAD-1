package kz.state;

public interface VendingMachineState {
    void nextStep(VendingMachine vm);
}

// 1-st state              2-nd state                        3-rd state
// normal state -> client deposite money state -> 1) client takes product and no change   ->  normal state
//                                                2) client takes product and change
//                                                3) client doesn't take product due to
//                                                      insufficient currency on deposit
//                                                4) client doesn't take product due to
//                                                      inventory depletion

// how works: normal -> selecting product -> deposite money -> final (then again from start)