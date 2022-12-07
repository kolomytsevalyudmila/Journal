
package journal;


public class Group implements Mean {
    private int numberGroup;
    private String nameGroup;
    private String profOriental;
    private double rating;
    

    public Group() {
    }

    public Group(int numberGroup, String nameGroup) {
        this.numberGroup = numberGroup;
        this.nameGroup = nameGroup;
        
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public String getProfOriental() {
        return profOriental;
    }

    public void setProfOriental(String profOriental) {
        this.profOriental = profOriental;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Group{"+ numberGroup + " " + nameGroup + ", profOriental=" + profOriental + ", rating=" + rating + '}';
    }

    public String getGroupName() {
        return nameGroup;
    }
    
    @Override
    public double getMean(){
        
        return JournalMath.calcMean(Groups.createGroupList(this));
        
    }
}
