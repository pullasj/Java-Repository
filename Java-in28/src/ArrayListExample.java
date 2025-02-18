import java.util.ArrayList; // Importing ArrayList
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(4); // Corrected import issue
        arrayList.add("String5");
        arrayList.add("String3234244");
        arrayList.add("String343");
        arrayList.add("String3443433");
        arrayList.add("String343443");

        String FirstElement = arrayList.get(0); // Correct variable name
        System.out.println(FirstElement); // Correct variable name
        arrayList.remove(1); // Removing Index
        System.out.println();
        for(String name: arrayList){
            System.out.println(name);
        }
    }
}