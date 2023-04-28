package school.management.system;

//this class is responsible for keeping track of students name, id, grade and fees paid.

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    /**
     * the job of the constructor is to create a new student obj by initializing
     * fees for every student is $30,000/year
     * fees paid initially is $0
     * @param id is id of student: unique
     * @param name is the name of the student
     * @param grade is the grade of the student
     */
    public Student(int id, String name, int grade){
        this.feesPaid =0;
        this.feesTotal = 30000;
        this.id =id;
        this.name = name;
        this.grade = grade;
    }

    //Not going to alter Students name & id; So, don't need setName & setId;

    /**
     * used to upgrade student's grade
     * @param grade is the new grade of the student
     */
    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     * add the fees to the fees paid.
     * the school is going to receive the funds.
     * @param fees that the student pays
     */
    public void updateFeesPaid(int fees)














}