
package journal;

import java.util.ArrayList;


public class Marks {
    
    public static String getName(int value) {
        
        switch(value) {
            case 1: return "пересдача";
            case 2: return "не удовлетворительно";
            case 3: return "удовлетворительно";
            case 4: return "хорошо";
            case 5: return "отлично";
        }
        return "неизвестная оценка";
    }
    
    
}
