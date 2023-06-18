package com.example.hafizpara;

public class modelClass {

    String id;
    String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    String age;

    public modelClass(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


}
