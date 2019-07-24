package cn.normal;

import java.beans.Transient;
import java.io.*;

public class Serial implements Serializable {

    private static final long serialVersionUID = 1232131412313213213L;

    private String name;

    private Integer age;

    private transient String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(age);
        out.writeObject(address);
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        age = in.readInt();
        address = (String) in.readObject();
    }

    @Override
    public String toString() {
        return "{ name:" + this.getName() +  "; address:  " + this.getAddress() +   "; age: " + this.getAge() + "}" ;
    }
}
