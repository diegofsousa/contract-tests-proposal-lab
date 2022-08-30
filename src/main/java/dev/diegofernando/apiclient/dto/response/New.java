package dev.diegofernando.apiclient.dto.response;

import dev.diegofernando.apiclient.annotations.SchemaTestsScan;

@SchemaTestsScan(key = "new")
public class New {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "New{" +
                "age=" + age +
                '}';
    }
}
