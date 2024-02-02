package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
 public static void main (String[] args){
     Department obj = new Department(1, "Books");
     System.out.println(obj);

     Seller seller = new Seller(21, "Bob", "bob@email.com", new Date(), (double)3000, obj);
     System.out.println(seller);
 }
}
