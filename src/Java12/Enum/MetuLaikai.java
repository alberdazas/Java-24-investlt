package Java12.Enum;

public enum MetuLaikai {

//    ZIEMA,
//    PAVASARIS,
//    VASARA,
//    RUDUO
    ZIEMA(3, "tekstas labas"),
    PAVASARIS(1),
    VASARA(0),
    RUDUO(7);

    private int index;

    MetuLaikai(int i) {
        this.index = i;
    }
    MetuLaikai(int i, String tekstas) {
        this.index = i;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
