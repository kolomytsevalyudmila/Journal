
package journal;


public class Teacher {
    private String name;
    private String patronymic;
    private String surname;
    private Subject item;
    private String level;
    private double experience;

    public Teacher(String name, String patronymic, String surname) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name=" + name + ", patronymic=" + patronymic + ", surname=" + surname + ", disciplines=" + item + ", experience=" + experience + ", level=" + level + '}';
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public Subject getItem() {
        return item;
    }

    public String getLevel() {
        return level;
    }

    public double getExperience() {
        return experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setItem(Subject item) {
        this.item = item;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }
    
    
}
