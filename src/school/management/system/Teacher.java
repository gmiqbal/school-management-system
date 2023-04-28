package school.management.system;

/**
 * this class is responsible for keeping track of
 * teacher's id, name, salary
 */

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    /**
     * this constructor creates new teacher object
     * @param id of the teacher
     * @param name of the teacher
     * @param salary of the teacher
     */
    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    /**
     * returns the id for current teacher
     * @return
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return name of the teacher
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return salary of the teacher
     */
    public int getSalary(){
        return salary;
    }

    /**
     * don't need getter for id and name as they won't be changing
     * need getter for salary due to increment or decrement
     */
    public void setSalary(int salary){
        this.salary=salary;
    }


    /**
     * adds to the salary
     * removes from the total money earned by the school
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher's name: " + name +
                " Total salary received so far: $" + salaryEarned;
    }
}
