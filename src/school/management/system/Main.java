package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher vanderhorn = new Teacher(3, "Vander Horn", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);

        Student gm = new Student(1, "GM", 4);
        Student iqbal = new Student(2, "Iqbal", 12);
        Student mahmud = new Student(3, "Mahmud", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(gm);
        studentList.add(iqbal);
        studentList.add(mahmud);

        School ghs = new School(teacherList, studentList);
        iqbal.payFees(5000);
        mahmud.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("----Making School pay salary------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to: " + lizzy.getName() +
                " and now has $" + ghs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to: " + vanderhorn.getName() +
                " and now has $" + ghs.getTotalMoneyEarned());

        System.out.println(iqbal);
        System.out.println(vanderhorn);

        mellisa.receiveSalary(mellisa.getSalary());
        System.out.println(mellisa);
    }
}
