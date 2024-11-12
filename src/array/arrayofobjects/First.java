package array.arrayofobjects;

public class First {
	public static Employee[] createArray() {
		Employee err[] = new Employee[3];
		err[0] = new Employee(1, "Ajinkya", 50000, 10);
		err[1] = new Employee(2, "Abhi", 40000, 10);
		err[2] = new Employee(3, "Aniket", 45000, 10);
		return err;
	}

	public static void printArray(Employee e[]) {
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
	}
	public static double totalDeptwiseSal(Employee e[],int dno) {
		double sum=0;
		for(int i=0;i<e.length;i++) {
			if(e[i].dno==dno) {
				sum=sum+e[i].sal;
			}
		}
		return sum;
	}
	public static void maxSalofDept(Employee e[]) {
		double max=0;
		for(int i=0;i<e.length;i++) {
			if(e[i].sal>max) {
				max=e[i].sal;
			}
		}
		System.out.println("MAx sal is : "+max);
	}
	public static void main(String[] args) {
		Employee err[] = createArray();
		printArray(err);
		System.out.println("Total sal of dept is: "+totalDeptwiseSal(err, 10));
		maxSalofDept(err);
	}

}
