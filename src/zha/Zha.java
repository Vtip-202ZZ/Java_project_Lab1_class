/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zha;

/**
 *
 * @author student
 */
public class Zha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human1 albert = new Human1("Albert ", 19, true, "Student", 18);
        System.out.println(albert);
        System.out.println("");
        
        Human2 dennis = new Human2("Dennis", 25, true, "Boss", 18);
        System.out.println(dennis);
        System.out.println("Dennis " + dennis.HUMAN("Boss"));
        System.out.println("");
        
        Human3 olesya = new Human3("Olesya", 31, false, "Worker", 18) {
            @Override
            public String getJob() {
                return "Worker";
                
            }

            @Override
            public void sayYourJob() {
                
            }
        };
        System.out.println(olesya);
        System.out.println("Olesya " + olesya.getJob("Worker"));
        System.out.println("");
        
        
        Person zhanibek = new Person("Zhanibek", 19, true,"Student", 18);
        System.out.println(zhanibek);
        System.out.println("Zhanibek " + zhanibek.sayYourJob("Student"));
        System.out.println("");
            
            
            
            
            
            
            
            
        }
        
    }
    
    

