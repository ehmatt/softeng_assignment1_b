import org.joda.time.DateTime;
import java.util.ArrayList;
import ehmatt.softeng_assignment1;

public class CreateStudent {

	public ArrayList<Module> modules = new ArrayList<Module>();
	public ArrayList<CourseProgramme> courses = new ArrayList<CourseProgramme>();

	public static void main(){

		Student student_1 = new Student("Matt Moran", "22", new DateTime("02/09/1996"), "15445226");
		Student student_2 = new Student("Micheal Lynch", "20", new DateTime("16/11/1997"), "12345678");
		Student student_3 = new Student("Ailbhe Looby", "21", new DateTime("30/06/1997"), "98765432");
		Student student_4 = new Student("Laoise Buchholtz", "22", new DateTime("09/09/1996"), "34567890");

		Module module_1 = new Module("Software Engineering");
		Module module_2 = new Module("AI");
		Module module_3 = new Module("Professional Skills");
		Module module_4 = new Module("Programming");

		modules.add(module_1);
		modules.add(module_2);
		modules.add(module_3);
		modules.add(module_4);

		CourseProgramme course_1 = new CourseProgramme("CSIT", new DateTime("01/09/2015"), new DateTime("01/05/2019"));
		CourseProgramme course_2 = new CourseProgramme("Engineering", new DateTime("01/09/2015"), new DateTime("01/05/2019"));

		courses.add(course_1);
		courses.add(course_2);

		module_1.addStudent(student_1);
		module_1.addStudent(student_2);
		module_2.addStudent(student_1);
		module_2.addStudent(student_2);
		module_3.addStudent(student_3);
		module_3.addStudent(student_4);
		module_4.addStudent(student_3);
		module_4.addStudent(student_4);

		course_1.addModule(module_1);
		course_1.addModule(module_2);
		course_2.addModule(module_3);
		course_2.addModule(module_4);

		System.out.println("Courses: ");
		for (int x = 0; x < courses.size(); x++){
			System.out.println(courses.get(x).getName());
			System.out.println("Modules: ");
			for (int y = 0; y < courses.get(y).getModules.size(); y++){
				System.out.println(courses.get(y).getModules().getName());
			}
		}

		System.out.println("Students: ");
		for (int x = 0; x < students.size(); x++){
			System.out.println(students.get(x).getName());

			System.out.println("Course: ");
			for(int y = 0; y < students.get(y).getCourses.size(); y++){
				System.out.println(students.get(y).getCourses().getName());
			}

			System.out.println("Username: ");
			for(int z = 0; z < students.size(); z++){
				System.out.println(students.get(z).getUsername());
			}
		}
	}
}