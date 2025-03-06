package Lesson_2.User;

public class Address {
   private String street;
   private String suite;
   private String city;
   private int zipcode;
   private Geo geo;

   public Address(String street, String suite, String city, int zipcode, Geo geo) {
      this.street = street;
      this.suite = suite;
      this.city = city;
      this.zipcode = zipcode;
      this.geo = new Geo(-37.3159,81.1496);
   }
}
