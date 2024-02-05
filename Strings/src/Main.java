public class Main {
    public static void main(String[] args) {
      String s = "Om jain";
      String b = "Om jain";
      String a = new String("Om jain");
        System.out.println(s == a);
        // == checks if the variables are pointing to the same object or not
        // whereas equals to function checks the contents of the objects.
        System.out.println(s.equals(a));


    }
}