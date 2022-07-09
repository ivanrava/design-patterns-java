package designpatterns.patterns.behavioral.state;

public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    void play() {
        state.play(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
