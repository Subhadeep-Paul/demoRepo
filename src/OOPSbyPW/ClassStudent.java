package OOPSbyPW;

public class ClassStudent {
    String name;
    int rno ;

   public int getRno(){
       return rno;
    }

    public void setRno(int x){
       rno = x;
    }


    //making a constructor
    public ClassStudent(String name , int rno){
       this.rno = rno;
       this.name = name;
    }

    //We'll make sure to write a default constructor also.
    public ClassStudent(){

    }
}
