package collections.Comparator_Comparable.LabAssignments_Comparable;
/*9. Add Profile(state,country) object in NewEmp object. Do sorting of e on the country basis.
Comparator Assignments*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Profile {
	String state;
	String country;

	public Profile(String state, String country) {
		this.state = state;
		this.country = country;
	}

	public String getCountry() {
		return country;
	}
}

class NewEmp implements Comparable<NewEmp> {
	String name;
	Profile profile;

	public NewEmp(String name, Profile profile) {
		this.name = name;
		this.profile = profile;
	}

	@Override
	public int compareTo(NewEmp other) {
		return this.profile.getCountry().compareTo(other.profile.getCountry());
	}

	@Override
	public String toString() {
		return "NewEmp{name='" + name + "', country='" + profile.getCountry() + "'}";
	}
}

public class A9 {
	public static void main(String[] args) {
		List<NewEmp> emp = new ArrayList<>();
		emp.add(new NewEmp("Ajinkya", new Profile("Maharashtra", "India")));
		emp.add(new NewEmp("Steve", new Profile("Texas", "USA")));
		emp.add(new NewEmp("Mike", new Profile("Ontario", "Canada")));
		emp.add(new NewEmp("Smith", new Profile("Sydney", "Austrelia")));

		Collections.sort(emp);

		for (NewEmp e : emp) {
			System.out.println(e);
		}
	}
}
