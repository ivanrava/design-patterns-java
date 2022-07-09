package designpatterns.patterns.behavioral.state;

public class PauseState implements State {
    @Override
    public void play(Context context) {
        context.setState(new PlayingState());
    }
}
