package enum_test;

public enum Number {
    NAME_ONE(1),
    NAME_TWO(2);

    private final int value;


    Number(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}
