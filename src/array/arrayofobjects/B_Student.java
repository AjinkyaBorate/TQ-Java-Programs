package array.arrayofobjects;
//8 oct

/*2. Create array of students, student has (roll, name, age, marks[]). Print only
those students who have percentage more than 60 
Find the topper of the all student *
*/

class Students {
    int roll;
    String name;
    int age;
    int[] marks;

    public Students(int roll, String name, int age, int[] marks) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public double getPercentage() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return (double) totalMarks / marks.length;
    }

    @Override
    public String toString() {
        return "Roll: " + roll + ", Name: " + name + ", Age: " + age + ", Percentage: " + getPercentage();
    }
}

public class B_Student {
    public static void main(String[] args) {
        Students[] students = new Students[]{
            new Students(1, "Aj", 20, new int[]{70, 80, 90}),
            new Students(2, "Bb", 21, new int[]{60, 65, 70}),
            new Students(3, "Cc", 22, new int[]{50, 55, 60}),
            new Students(4, "Dd", 20, new int[]{80, 85, 90}),
            new Students(5, "Ee", 21, new int[]{40, 45, 50})
        };

        System.out.println("Students with percentage more than 60:");
        for (Students studen : students) {
            if (studen.getPercentage() > 60) {
                System.out.println(studen);
            }
        }

        Students topper = students[0];
        for (Students student : students) {
            if (student.getPercentage() > topper.getPercentage()) {
                topper = student;
            }
        }

        System.out.println("Topper:");
        System.out.println(topper);
    }
}

