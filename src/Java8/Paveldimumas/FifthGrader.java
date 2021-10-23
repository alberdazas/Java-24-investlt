package Java8.Paveldimumas;

public class FifthGrader extends Student {
    private boolean hasProgrammingLesson;

    public FifthGrader(String name, String lastName, boolean hasProgrammingLesson) {
        super(name, lastName, "5");
        this.hasProgrammingLesson = hasProgrammingLesson;
    }

    public boolean isHasProgrammingLesson() {
        return hasProgrammingLesson;
    }

    public void setHasProgrammingLesson(boolean hasProgrammingLesson) {
        this.hasProgrammingLesson = hasProgrammingLesson;
    }

    @Override
    public String toString() {
        return getName() + " " + getLastName() + " " + getClassName() + " " + isHasProgrammingLesson();
    }
}
