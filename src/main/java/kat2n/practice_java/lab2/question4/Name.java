package main.java.kat2n.practice_java.lab2.question4;

public class Name {
  private String firstName;
  private String lastName;

  public Name(String first, String last) {
    firstName = first;
    lastName = last;
  }

  public String toString() {
    return firstName + " " + lastName;
  }

  public int compareTo(Name n) {
    int lastComp = lastName.compareTo(n.lastName);
    if (lastComp != 0) {
      return lastComp;
    } else {
      return firstName.compareTo(n.firstName);
    }
  }
}
