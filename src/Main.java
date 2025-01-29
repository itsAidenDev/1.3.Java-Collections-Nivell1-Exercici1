import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n----------Months without August----------");
        ArrayList<Month> months = new ArrayList<>();
        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        for (int i = 0; i < months.size(); i++){
            System.out.println("The month " + months.get(i).getName() + " is at the position " + i);
        }

        System.out.println("\n----------Months with August----------");
        months.add(7, new Month("August"));

        for (int i = 0; i < months.size(); i++){
            System.out.println("The month " + months.get(i).getName() + " is at the position " + i);
        }

        System.out.println("\n----------HashSet-----------");
        HashSet<Month> mHS = new HashSet<>(months);

        mHS.add(new Month("September"));
        mHS.add(new Month("November"));


        System.out.println("HashSet with unique months:");
        for (Month month : mHS) {
            System.out.println(month);
            }

        System.out.println("\nIterating through the HashSet using an a for loop:");
        for (Month month : mHS) {
            System.out.println(month);
        }

        System.out.println("\nIterating through the HashSet using an Iterator:");
        Iterator<Month> iterator = mHS.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}



