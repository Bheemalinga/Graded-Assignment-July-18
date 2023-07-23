import java.util.*;

class Student implements Comparable<Student> {
    String name;
    double cgpa;
    int id;

    public Student(String name, double cgpa, int id) {
        this.name = name;
        this.cgpa = cgpa;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Student s) {
        if (cgpa == s.cgpa) {
            if (name.equals(s.name)) {
                return Integer.compare(id, s.id);
            } else {
                return name.compareTo(s.name);
            }
        }
        return Double.compare(s.cgpa, cgpa);
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Collections.reverseOrder());
        List<Student> result = new ArrayList<>();

        for (String event : events) {
            String[] s = event.split(" ");
            if (s[0].equals("ENTER")) {
                pq.add(new Student(s[1], Double.parseDouble(s[2]), Integer.parseInt(s[3])));
            } else {
                pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }

        return result;
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
