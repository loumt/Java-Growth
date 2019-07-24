package cn.test;

import cn.normal.Serial;

import java.io.*;

public class SerialTest {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //wirte object to file
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
        Serial serial = new Serial();
        serial.setAge(18);
        serial.setName("Loumt");
        serial.setAddress("大桥镇中学");
        oos.writeObject(serial);

        //read object from file
        File file = new File("tempFile");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Serial serial1 = (Serial)ois.readObject();

        //output
        System.out.println(serial1);
        System.out.println(serial1.getName());


    }


}
