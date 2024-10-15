package conditionalstatements.switchcase;
import java.util.Scanner;

public class YearSubjects {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year (1-4): ");
        int year = scanner.nextInt();

        System.out.print("Enter branch ('C' for CSE, 'E' for ECE, 'M' for Mechanical): ");
        char branch = scanner.next().charAt(0);

        switch (year) {
            case 1:
                System.out.println("Subjects for First Year:");
                System.out.println("1. Mathematics I");
                System.out.println("2. Physics");
                System.out.println("3. Chemistry");
                System.out.println("4. Basic Electrical Engineering");
                System.out.println("5. Engineering Drawing");
                break;

            case 2:
            case 3:
            case 4:
                switch (branch) {
                    case 'C':
                        System.out.println("Subjects for CSE Year " + year + ":");
                        if (year == 2) {
                            System.out.println("1. Data Structures");
                            System.out.println("2. Discrete Mathematics");
                            System.out.println("3. Digital Logic Design");
                            System.out.println("4. Object-Oriented Programming");
                        } else if (year == 3) {
                            System.out.println("1. Algorithms");
                            System.out.println("2. Operating Systems");
                            System.out.println("3. Computer Networks");
                            System.out.println("4. Database Management Systems");
                        } else {
                            System.out.println("1. Machine Learning");
                            System.out.println("2. Compiler Design");
                            System.out.println("3. Distributed Systems");
                            System.out.println("4. Artificial Intelligence");
                        }
                        break;

                    case 'E':
                        System.out.println("Subjects for ECE Year " + year + ":");
                        if (year == 2) {
                            System.out.println("1. Electronic Devices and Circuits");
                            System.out.println("2. Signal Processing");
                            System.out.println("3. Electromagnetic Theory");
                            System.out.println("4. Analog Communication");
                        } else if (year == 3) {
                            System.out.println("1. Digital Signal Processing");
                            System.out.println("2. Microprocessors");
                            System.out.println("3. Control Systems");
                            System.out.println("4. VLSI Design");
                        } else {
                            System.out.println("1. Wireless Communication");
                            System.out.println("2. Antenna Theory");
                            System.out.println("3. Embedded Systems");
                            System.out.println("4. Optical Communication");
                        }
                        break;

                    case 'M':
                        System.out.println("Subjects for Mechanical Year " + year + ":");
                        if (year == 2) {
                            System.out.println("1. Thermodynamics");
                            System.out.println("2. Fluid Mechanics");
                            System.out.println("3. Material Science");
                            System.out.println("4. Machine Drawing");
                        } else if (year == 3) {
                            System.out.println("1. Heat Transfer");
                            System.out.println("2. Manufacturing Processes");
                            System.out.println("3. Dynamics of Machines");
                            System.out.println("4. Design of Machine Elements");
                        } else {
                            System.out.println("1. Automobile Engineering");
                            System.out.println("2. Robotics");
                            System.out.println("3. Advanced Manufacturing");
                            System.out.println("4. Finite Element Analysis");
                        }
                        break;

                    default:
                        System.out.println("Invalid branch entered. Please enter 'C', 'E', or 'M'.");
                }
                break;

            default:
                System.out.println("Invalid year entered. Please enter a year between 1 and 4.");
        }

        scanner.close();
    }
}
