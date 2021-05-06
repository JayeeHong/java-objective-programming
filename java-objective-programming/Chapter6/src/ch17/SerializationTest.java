package ch17;

import java.io.*;

class Person implements Serializable {
    String name;
    //transient String job; //transient : 직렬화할 수 없는 것, 직렬화하지 않는 것에 써준다.
    String job;

    public Person() {}

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String toString() {
        return name + ", " + job;
    }
}

public class SerializationTest {
    public static void main(String[] args) {

        Person personLee = new Person("Lee", "대표이사");
        Person personKim = new Person("Kim", "상무이사");

        try (FileOutputStream fos = new FileOutputStream("serial.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(personLee);
            oos.writeObject(personKim);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (FileInputStream fos = new FileInputStream("serial.txt");
             ObjectInputStream ois = new ObjectInputStream(fos)) {

            Person pLee = (Person) ois.readObject();
            Person pKim = (Person) ois.readObject();

            System.out.println(pLee);
            System.out.println(pKim);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ce) {
            System.out.println(ce);
        }
    }
}
