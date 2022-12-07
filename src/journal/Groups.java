
package journal;

import java.util.ArrayList;


public class Groups {
    
    public static ArrayList<Student> createGroupList(Group group) {
        
        ArrayList<Student> st = new ArrayList<>();
        for (Student student : Journal.students) {
            if(student.getGroup().equals(group)) st.add(student);
        }
        return st;
    }
    
    
}
