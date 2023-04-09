import java.util.Scanner;
import java.util.List;

public class School {
    private List<Teacher>teacher;
    private List<Student> student;
    private int totalMoneySpent;
    private int totalMoneyEarned;

    public School(List<Teacher> teacher, List<Student> student) {
        this.teacher = teacher;
        this.student = student;
        totalMoneySpent = 0;
        totalMoneyEarned = 0;

    }
 public List<Teacher>getTeacher(){
        return teacher;
    }
    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
  public int updateTotalMoneySpent(int totalMoneySpent){
      return totalMoneyEarned-=totalMoneySpent;
  }

}
