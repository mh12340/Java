public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Bitte gib deinen Namen ein:");
        String name = scanner.nextLine();

        System.out.println("Hallo " + name + "!");

        scanner.close();
    }
}