package net.honux.springbootdemo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.util.*;

public class User {

    @Id
    private Long id;
    private String email;
    private String name;
    @Embedded.Empty
    private Github github;

    private Long groupId;

    private List<Food> foods = new ArrayList<>();

    public User(String email, String name, Github github) {
        this.email = email;
        this.name = name;
        this.github = github;
    }

    public void addFood(Food... foods) {
        Collections.addAll(this.foods, foods);
    }

    public Collection<Food> getFoods() {
        return this.foods;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() { return email; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGithub(Github github) {
        this.github = github;
    }

    public Github getGithub() {
        return github;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", github=" + github +
                '}';
    }

    public Long getGroupId() {
        return groupId;
    }
}
