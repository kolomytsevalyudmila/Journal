
package journal;

import java.util.ArrayList;


public class JournalMath {
    
    public static double calcMean(ArrayList<? extends Mean> list) {
        int n = 0;
        double s = 0;
        for (Mean obj : list) {
            n++;
            s+= obj.getMean();
        }
        if(n==0) return 0;
        return s/n;
    }
    
}
