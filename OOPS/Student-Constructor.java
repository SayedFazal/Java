import java.util.*;
class Student{
  String name;
  int id;
  int[] grades;
  Student(String name, int id, int[] grades){
    this.name = name;
    this.id = id;
    this.grades = grades;
  }
  double calculateAverage(){
    int sum = 0;
    for (int g : grades){
      sum += g;
    }
    return (double) sum / grades.length;
  }
  char calculateLetterGrade(){
    double avg = calculateAverage();
    if (avg >= 90) return 'A';
    else if (avg >= 80) return 'B';
    else if (avg >= 70) return 'C';
    else if (avg >= 60) return 'D';
    else return 'F';
  }
}
public class R192311291{
  public static void main(String[] args){
    int[] grades = {85, 90, 78, 92};
    Student s = new Student("Fazal", 192311291, grades);
    System.out.println("Name: " + s.name);
    System.out.println("ID: " + s.id);
    System.out.println("Average Grade: " + s.calculateAverage());
    System.out.println("Letter Grade: " + s.calculateLetterGrade());
  }
}
