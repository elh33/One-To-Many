package models;

import jakarta.persistence.*;

@Entity
@Table(name = "child")
public class Child {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Parent parent;

    public Child() {}

    public long getId(){
        return this.id;
    }
    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Parent getParent(){
        return this.parent;
    }

    public void setParent(Parent parent){
        this.parent = parent;
    }




}
