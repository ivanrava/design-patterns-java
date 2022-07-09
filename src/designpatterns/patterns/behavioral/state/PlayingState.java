package designpatterns.patterns.behavioral.state;

public class PlayingState implements State {
    @Override
    public void play(Context context) {
        context.setState(new PauseState());
    }
}
