
package com.atos.Syntel.IOStream;

import java.io.Serializable;

/*serialize the object , flat the object*/
public class Person implements Serializable{
    private String name;
    private int age;
    private String gener;
    
    public Person() {
        super();
        this.name = "NA";
        this.age = 0;
        this.gener ="NA";
    }

    public Person(String name, int age, String gener) {
        super();
        this.name = name;
        this.age = age;
        this.gener = gener;
    }
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

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    
    
    
    
}
