package replace_null_value;

import replace_null_value.model.Batch;
import replace_null_value.model.Student;


public class MainTest {
    public static void main(String[] args) throws Throwable {
     /*   System.out.println(enum_test.DateFormat.NAME_ONE.getValue());
        System.out.println(enum_test.DateFormat.NAME_TWO.getValue());*/

        Student student = new Student(null, 1, "10", new Batch(null, "2022"));
        Student fname = Factor.loadClass(student);
        System.out.println("====================================");
        System.out.println(fname);
        System.out.println("----------------------------------------");


 /*       List<String> items = new ArrayList<>();

        items.add("coins");
        items.add("pens");
        items.add("keys");
        items.add("sheets");

        System.out.println("=====================================");

        new OptionalUtil();*/


    }
}
