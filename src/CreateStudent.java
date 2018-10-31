import org.joda.time.DateTime;
import java.util.ArrayList;
import ehmatt.softeng_assignment1;

public class CreateStudent {

	public static void main(){
		Student student_1 = new Student("Matt Moran", "22", new DateTime("02/09/1996"), "15445226");
		Student student_2 = new Student("Micheal Lynch", "20", new DateTime("16/11/1997"), "12345678");
		Student student_3 = new Student("Ailbhe Looby", "21", new DateTime("30/06/1997"), "98765432");
		Student student_4 = new Student("Laoise Buchholtz", "22", new DateTime("09/09/1996"), "34567890");

		Module module_1 = new Module("Software Engineering");
		Module module_2 = new Module("AI");
		Module module_3 = new Module("Professional Skills");

		CourseProgramme course = new CourseProgramme("CSIT", new DateTime("01/09/2015"), new DateTime("01/05/2019"));

		module_1.addStudent(student_1);
		module_1.addStudent(student_2);
		module_2.addStudent(student_2);
		module_2.addStudent(student_3);
		module_3.addStudent(student_3);
		module_3.addStudent(student_4);

		course.addModule(module_1);
		course.addModule(module_2);
		course.addModule(module_3);

		System.out.println()



	}
}