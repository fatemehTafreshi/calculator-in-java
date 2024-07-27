import interfaces.ActionInterface;

public class Calculater {

    public int calculate(ActionInterface actionInterface, int a, int b) {
        return actionInterface.action(a, b);
    }
}
