import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args){
        Teacher renuka = new Teacher(1,"renuka",500);
        Teacher priyantha =new Teacher(2,"Priyantha",1000);
        Teacher Samarawickrama = new Teacher(3,"Samarawickrama",2000);

        List<Teacher> teacherList=new ArrayList<>();
        teacherList.add(renuka);
        teacherList.add(priyantha);
        teacherList.add(Samarawickrama);


        Student Bodhika = new Student(1,"Bodhika",1);
        Student Nishadhi =new Student(2,"Nishadhi",2);
        Student Lahiru = new Student(3,"Lahiru",3);

        List<Student> studentList=new ArrayList<>();
        studentList.add(Bodhika);
        studentList.add(Nishadhi);
        studentList.add(Lahiru);


        School emb = new School(teacherList,studentList);
        System.out.println("emb has earned"+emb.getTotalMoneyEarned());

    }
}
