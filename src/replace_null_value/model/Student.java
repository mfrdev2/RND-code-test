package replace_null_value.model;

public class Student {
    private String name;
    private Integer roll;
    private String clas;

    private Batch batch;

    public Student(String name, Integer roll, String clas, Batch batch) {
        this.name = name;
        this.roll = roll;
        this.clas = clas;
        this.batch = batch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "replace_null_value.model.Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", clas='" + clas + '\'' +
                ", batch=" + batch +
                '}';
    }
}
