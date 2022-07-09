package designpatterns.patterns.behavioral.state;

public class StateRunner implements Runnable {
    @Override
    public void run() {
        Context context = new Context(new PauseState());

        context.play();
        context.play();
        context.play();
    }
}
