package jst.trycatch;

import java.util.ArrayList;
import java.util.List;

public class TryCatchTest {

    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();

        liste.add("22");
        liste.add("22");
        liste.add("22");
        liste.add("abc");

        List<String> liste2 = new ArrayList<>();
        liste.add(null);

        int testindex = 3;

        try {
            if (liste.get(testindex) == null) {
                throw new NullPointerException();
            }
            System.out.println(liste.get(testindex));
            Integer.parseInt(liste.get(testindex));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Element nicht vorhanden");
        } catch (NumberFormatException e) {
            System.out.println("Eingabe ist keine Zahl    ->" + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Element nicht vorhanden (Null)");
        }

    }
}
