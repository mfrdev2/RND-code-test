package replace_null_value.model;

import replace_null_value.model.Student;

public class Batch extends Student {
    private String batchYear;
    private String batchEnd;
    private int x;

    public Batch(String batchYear, String batchEnd) {
        super(null,null,null,null);
        this.batchYear = batchYear;
        this.batchEnd = batchEnd;
    }

    public String getBatchYear() {
        return batchYear;
    }

    public void setBatchYear(String batchYear) {
        this.batchYear = batchYear;
    }

    public String getBatchEnd() {
        return batchEnd;
    }

    public void setBatchEnd(String batchEnd) {
        this.batchEnd = batchEnd;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "replace_null_value.model.Batch{" +
                "batchYear='" + batchYear + '\'' +
                ", batchEnd='" + batchEnd + '\'' +
                ", x=" + x +
                '}';
    }
}
