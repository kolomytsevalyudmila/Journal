
package journal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Journal {
    
    public static ArrayList<Student> students = new ArrayList();
    public static ArrayList<Mark> markList = new ArrayList<>();
    public static ArrayList<Subject> subjects= new ArrayList<>();
    public static ArrayList<Group> groups = new ArrayList<>();
    public static ArrayList<Teacher> teachers = new ArrayList<>();
    

    
    public static void main(String[] args) {
        
        fillStudents();
        fillTeachers();
        fillGroups();
        fillSubjects();
        fillMarks();
        
        for (Student student : students) {
            for (int i = 0; i < 5; i++) {
                student.addMark(new Mark(new Random().nextInt(3, 6),subjects.get(new Random().nextInt(subjects.size()))));
            }
        }
        
        for (Student student : students) {
           student.setGroup(groups.get(0));
        }
        //students.get(2).setGroup(groups.indexOf(0));
        
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getSurname() + " " + student.marksToString(subjects.get(6))+ " "
                    + student.getMean(subjects.get(6)));
        }
        
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getSurname() + " " + student.marksToString());
        }
        //System.out.println(students.get(2).getMean() + " " + g1.getMean());
        System.out.println(students.get(2).getGroup().getMean());
    }

    public static void fillStudents() {
        
        students.add(new Student("Sergey", "Ivanov", 1));
        students.add(new Student("Petr", "Petrov", 2));
        students.add(new Student("Ivan", "Ivanov", 3));
        students.add(new Student("Svetlana", "Nikitichna", 4));
        students.add(new Student("Marina", "Egorova", 5));
    
    }

    private static void fillTeachers() {
        
        teachers.add(new Teacher("Olga", "Leonidovna", "Chusch"));
        teachers.add(new Teacher("Vladimir", "Sergeevich", "Koko"));
        teachers.add(new Teacher("Semen", "Olegovich", "Pupok"));
        teachers.add(new Teacher("Dmitriy", "Alekseevich", "Tsar"));
        teachers.add(new Teacher("Alexandr", "Olegovich", "Kotov"));
    
    }

    private static void fillGroups() {
        
        groups.add(new Group(1, "technical"));
        groups.add(new Group(2, "physical"));
        groups.add(new Group(3, "kadet"));
        groups.add(new Group(4, "A"));
        groups.add(new Group(5, "Б"));
    
    }

    private static void fillSubjects() {
        
        subjects.add(new Subject(1, "physics"));
        subjects.add(new Subject(2, "biology"));
        subjects.add(new Subject(3, "chemistry"));
        subjects.add(new Subject(4, "computer science"));
        subjects.add(new Subject(5, "music"));
        subjects.add(new Subject(6, "philosophy"));
        subjects.add(new Subject(7, "history"));
        subjects.add(new Subject(10, "sociology"));
    
    }

    private static void fillMarks() {
        
        markList.add(new Mark(1));
        markList.add(new Mark(2));
        markList.add(new Mark(3));
        markList.add(new Mark(4));
        markList.add(new Mark(5));
    
    }
    
}
