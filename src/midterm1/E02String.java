package midterm1;

public class E02String {
    public static void main(String[] args) {
        String name = "Liverpool";
        String newName = name.replace("pool", "----");
        name.toUpperCase();

        name = name.toUpperCase();

        System.out.println(name);
        System.out.println(newName.equals("Liver----"));
    }

}
