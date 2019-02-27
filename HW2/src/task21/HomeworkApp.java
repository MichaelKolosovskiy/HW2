package task21;

public class HomeworkApp {

	public static void main(String[] args) {
		Person person = new Person.Builder()
                .setName("Name")
                .setSurname("Surname")
                .setAge(18)
                .build();
	 System.out.println(person);
	}
}
