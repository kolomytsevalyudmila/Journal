
package journal;

import java.util.ArrayList;


public class Mark {
    private int numberPoint;
    private String namePoint;
    private Subject item;
    private ArrayList<Mark> marks = new ArrayList<>();
    
    public Mark(int numberPoint, Subject item) {
        this.numberPoint = numberPoint;
        this.item = item;
        namePoint = Marks.getName(numberPoint);
    }

    Mark(int i) {
    }

    public int getNumberPoint() {
        return numberPoint;
    }

    public void setItem(Subject item) {
        this.item = item;
    }

    public void setMarks(ArrayList<Mark> marks) {
        this.marks = marks;
    }

    public Subject getItem() {
        return item;
    }

    public ArrayList<Mark> getMarks() {
        return marks;
    }

    public void setNumberPoint(int numberPoint) {
        this.numberPoint = numberPoint;
    }

    public String getNamePoint() {
        return namePoint;
    }

    public void setNamePoint(String namePoint) {
        this.namePoint = namePoint;
    }
    

    @Override
    public String toString() {
        return "Mark{" + "numberPoint=" + numberPoint + ", namePoint=" + namePoint + ", item=" + item + '}';
    }
    public boolean checkSubjectName(Subject item){
        
        return this.item.getItemsName().equals(item.getItemsName());
    }

    public int getValue() {
        return numberPoint;
    }

    boolean checkSubjectName(ArrayList<Mark> subject) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
