
import daoImpl.ParentDaoImp;
import daoImpl.ChildDaoImp;
import models.Parent;
import models.Child;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ParentDaoImp parentDao = new ParentDaoImp();
        ChildDaoImp childDao = new ChildDaoImp();

        // Create a new Parent
        Parent parent = new Parent();
        parent.setName("John Doe");
        parentDao.save(parent);

        // Create a new Child
        Child child = new Child();
        child.setName("Jane Doe");
        child.setParent(parent);
        childDao.save(child);

        // Retrieve and print all Parents
        List<Parent> parents = parentDao.findAll();
        System.out.println("Parents:");
        for (Parent p : parents) {
            System.out.println("ID: " + p.getId() + ", Name: " + p.getName());
        }

        // Retrieve and print all Children
        List<Child> children = childDao.findAll();
        System.out.println("Children:");
        for (Child c : children) {
            System.out.println("ID: " + c.getId() + ", Name: " + c.getName() + ", Parent: " + c.getParent().getName());
        }

        // Update a Parent
        parent.setName("John Smith");
        parentDao.update(parent);

        // Delete a Child
        childDao.delete(child);

        // Retrieve and print all Parents after update
        parents = parentDao.findAll();
        System.out.println("Parents after update:");
        for (Parent p : parents) {
            System.out.println("ID: " + p.getId() + ", Name: " + p.getName());
        }

        // Retrieve and print all Children after delete
        children = childDao.findAll();
        System.out.println("Children after delete:");
        for (Child c : children) {
            System.out.println("ID: " + c.getId() + ", Name: " + c.getName() + ", Parent: " + c.getParent().getName());
        }
    }
}