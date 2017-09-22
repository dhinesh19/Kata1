package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person rafaelo = new Person ("Rafaelo", new Date(97, 7, 17));
        System.out.println(rafaelo.getName() + " tiene " + rafaelo.getAge());
    }
    
}
