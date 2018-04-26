/**
 * ProjectTest
 */
public class ProjectTest {

    public static void main(String[] args) {

        Project create1 = new Project();
        Project create2 = new Project("Nique", "Another descriptions");


        create1.setName("Darnell");
        create1.setDescription("This is a description");
        System.out.println ("The first name: " + create1.getName());
        System.out.println ("The first name: " + create1.getDescription());
        System.out.println(create1.elevatorPitch());

    }
}