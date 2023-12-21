public class Main {
 public static void main(String[] args) {
  Person person1 = new Person.PersonBuilder("Agostino", "Arcadi")
          .setAge(21)
          .setAddress("Roma")
          .build();

  System.out.println(person1);

  Person person2 = new Person.PersonBuilder("Mario", "Rossi")
          .setAddress("Milano")
          .build();

  System.out.println(person2);
 }
}
