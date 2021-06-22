import java.util.HashMap;
import java.util.Map;

/*
Make a Map that associates the following employee IDs with names. The point here is to associate keys with values,
then retrieve values later based on keys. Test several valid and invalid ID’s and print the associated name.

ID        | Name
----------+--------
a1234     | Adrian
----------+--------
b4321     | Vlad
----------+--------
c3241     | Mihai
----------+--------
d1432     | Calin
----------+--------
e2431     | Iulian
-------------------
*/
public class MapOfEmployees {
    public static void main(String[] args) {
        Map<String, String> employee = new HashMap<>();
        employee.put("a1234", "Adrian");
        employee.put("b4321", "Vlad");
        employee.put("c3241", "Mihai");
        employee.put("d1432", "Calin");
        employee.put("e2431", "Iulian");

        System.out.println("Get the value for key: e2431 -> " + employee.get("e2431"));
        System.out.println("Get the value for key: b4321 -> " + employee.get("b4321"));
        System.out.println("Get invalid key: kkkk -> " + employee.get("kkkk"));

    }
}
