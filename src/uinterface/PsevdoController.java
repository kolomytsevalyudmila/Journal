/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uinterface;

import journal.Journal;

/**
 *
 * @author ludmila
 */
public class PsevdoController {
    private static int idCounter;
    
    public static void setStartId(){
        
        idCounter = Journal.students.size();
    }
    
    public static int generateId(){
        
        return ++idCounter;
    }
    
}
