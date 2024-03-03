import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 4));

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()
        String d = "58";
        String e = "89";

        System.out.println(  d.compareTo(e));

        System.out.println("Om Jain" + new ArrayList<>());
        System.out.println("Om jain" + (56));
      //  String ans = new Integer(56) + " OM JAIN " + new ArrayList<>();
     //   System.out.println(ans);


        System.out.println("a" + 'b');

    }
}
