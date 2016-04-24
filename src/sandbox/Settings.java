package sandbox;

public enum Settings {

    min_hard(10),
    med_hard(20),
    max_hard(40);

    private final int value;

    private Settings(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

}
