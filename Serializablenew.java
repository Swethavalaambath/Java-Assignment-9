package FileIo;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;

 class Person implements Serializable {

    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name , int age){
        this.name=name;
        this.age= age;
    }


}
public class Serializablenew{
 public static void main(String[] args) {

     Person p = new Person("Prasad", 18);

     try {
         FileOutputStream fout = new FileOutputStream("C:/Users/swetha.valambath//Fileiopractice//serial.ser");
         ObjectOutputStream o = new ObjectOutputStream(fout);
         o.writeObject(p);
         o.close();
         System.out.println("Done");


     } catch (Exception e) {e.printStackTrace();
     }

 }



}
