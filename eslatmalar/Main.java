public class Main {

    public static void main(String[] args) {
        String name = "Jahongir";
        
        for(String i : name.split("")) {
            System.out.println(i);
        }

        System.out.println(name.charAt(0)); // Birinchi harf
        System.out.println(name.charAt(name.length() - 1)); // Oxirgi harf
    }
}