package g;
public class SwapFirstNameAndLastName {
    public static void main(String[] args) {
        String name="Vaibhav Tanavde";
        System.out.println("Before Swap:\n"+name);
        String firstName=name.substring(0,name.indexOf(" "));
        System.out.println(firstName);
        String lastName=name.substring(name.indexOf(" "));
        System.out.println(lastName);
        String swapName=lastName+" "+firstName;
        System.out.println("After Swap:\n"+swapName);

    }
}