package serialization.ejercicio;

import java.io.*;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person person = new Person();
        person.setName("Carlos");
        person.setAge(24);
        person.setCity("Colombia");

        //Serializado
        FileOutputStream fileOutputStream = new FileOutputStream("src/serialization/ejercicio/objectSerializate.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);
        objectOutputStream.close();

        //Deserializado
        FileInputStream fileInputStream = new FileInputStream("src/serialization/ejercicio/objectSerializate.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person personFichero = (Person) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(personFichero);

        /*
        new ByteArrayOutputStream();
        new FileOutputStream()
        new FilterOutputStream();
        new ObjectOutputStream();
        new PipedOutputStream();

        //Clases para sacar la informacion de algun lado
        new AudioInputStream();
        new ByteArrayInputStream();
        new FileInputStream();
        new FileInputStream();
        new ObjectInputStream();
        new PipedInputStream();
        new SequenceInputStream();
        */
    }
}
