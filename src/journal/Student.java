
package journal;

import java.util.ArrayList;


public class Student implements Mean {

    private String name;
    private String surname;
    private int age;
    private int ageAdmission;
    private int tabNumber;
    private double rating;
    private Group group;
    private ArrayList<Mark> marks; 
    
    

    public Student(String name, String surname, int tabNumber) {
        this.name = name;
        this.surname = surname;
        this.tabNumber = tabNumber;
        marks = new ArrayList<>();
        
        
    }
    
    public void addMark(Mark mark){
        marks.add(mark);
    }
    
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", surname=" + surname + ", age=" + age + ", ageAdmission=" + ageAdmission + ", tabNumber=" + tabNumber + ", group=" + group + ", rating=" + rating + '}';
    }
    
    public double getMean(Subject item) {
        
        int n = 0;
        int s = 0;
        for (Mark mark : getSubjectMarks(item)) {
            
            n++;
            s += mark.getValue();
            
        }
        if(n == 0) return 0;
        return (double)s/n;
    }
    
    @Override
    public double getMean() {
        int n = 0;
        double s = 0;
        for (Subject subject : Journal.subjects) {
            n++;
            s+=getMean(subject);
        }
        if(n==0) return 0;
        return s/n;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAgeAdmission(int ageAdmission) {
        this.ageAdmission = ageAdmission;
    }

    public void setTabNumber(int tabNumber) {
        this.tabNumber = tabNumber;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setMarks(ArrayList<Mark> marks) {
        this.marks = marks;
    }

    public int getTabNumber() {
        return tabNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public ArrayList<Mark> getSubjectMarks(Subject subject) {
        ArrayList<Mark> mrk = new ArrayList<>();
        for (Mark mark : marks) {
            if(mark.checkSubjectName(subject)){
                mrk.add(mark);
            }
        }
        return mrk;
    }
    
    public String marksToString(Subject subject){
        ArrayList<Mark> m = getSubjectMarks(subject);
        if (m.isEmpty()) return "Empty";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < m.size()-1; i++) {
            sb.append(m.get(i).getValue()).append(", ");
        }
        sb.append(m.get(m.size()-1).getValue());
        sb.append("]");
        return sb.toString();
        
    }
    public String marksToString(){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < marks.size()-1; i++) {
            sb.append(marks.get(i).getValue()).append(", ");
        }
        sb.append(marks.get(marks.size()-1).getValue());
        sb.append("]");
        return sb.toString();
    }
    
    
    
}

