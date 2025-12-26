import java.util.*;
public class LMSManagement {
  public static void main(String[] args) {
List<String> courses = new ArrayList<>();
courses.add("Java");
courses.add("Python");
courses.add("Spring");
Set<String> students = new HashSet<>();
students.add("a@gmail.com");
students.add("b@gmail.com");
Set<String> recentCourses = new LinkedHashSet<>();
recentCourses.add("Java");
recentCourses.add("Python");
Queue<String> doubts = new PriorityQueue<>();
doubts.add("Premium Student Doubt");
doubts.add("Normal Student Doubt");
Deque<String> history = new ArrayDeque<>();
history.push("Enrolled Java");
history.push("Enrolled Python");
history.pop(); // undo
Map<String, String> enrollment = new HashMap<>();
enrollment.put("a@gmail.com", "Java");
enrollment.put("b@gmail.com", "Python");
Map<String, String> schedule = new TreeMap<>();
schedule.put("2025-09-01", "Java Live");
schedule.put("2025-09-03", "Python Live");
Iterator<String> itr = students.iterator();
while (itr.hasNext()) {
if (itr.next().equals("b@gmail.com")) {
itr.remove();
}
}
ListIterator<String> litr = courses.listIterator();
while (litr.hasNext()) {
if (litr.next().equals("Spring")) {
litr.set("Spring Boot");
}
}
System.out.println("Courses: " + courses);
System.out.println("Students: " + students);
System.out.println("Enrollments: " + enrollment);
System.out.println("Schedule: " + schedule);
}
}