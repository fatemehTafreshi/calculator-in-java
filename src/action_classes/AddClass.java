package action_classes;

import interfaces.ActionInterface;

public class AddClass implements ActionInterface {

    @Override
    public int action(int a, int b) {
        return a + b;
    }
}
