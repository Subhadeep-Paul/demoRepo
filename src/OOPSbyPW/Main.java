package OOPSbyPW;


public class Main {

    public static void main(String[] args){
        /*ClassStudent Ranjan = new ClassStudent();
        Ranjan.name = "Ranjan Sharma";
        Ranjan.rno = 12;
        System.out.println(Ranjan.rno);
        Ranjan.setRno(23);
        System.out.println(Ranjan.getRno());*/



        //Writing the lines of code written below for 50 student would be a tedious task.
        //and unnecessary the code will be bigger.
        // Ranjan.name = "Ranjan Sharma";
        // Ranjan.rno = 12;
        //So we make a Constructor...in the Student class itself.

        ClassStudent s1 = new ClassStudent("Subhadeep Paul", 12);
        ClassStudent s2 = new ClassStudent("Ranjan Sharma", 13);
        ClassStudent s3 = new ClassStudent("Nikhil Poddar", 14);

        //By the above lines of code it is evident that, we have just written only a3 lines of
        //code but given all the necessary information to the objects we have just created.


    }

}
