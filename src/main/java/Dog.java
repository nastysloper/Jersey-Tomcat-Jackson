import com.fasterxml.jackson.annotation.JsonCreator;

public class Dog {

  public String name;
  public int age;
  public String breed;

  @JsonCreator
  public Dog() {
    this.breed = "mutt";
    this.name = "doggy";
    this.age = 5;
  }

  public Dog(String name, String breed, int age) {
    this.age = age;
    this.name = name;
    this.breed = breed;
  }
}
