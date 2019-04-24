import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class  Sort implements Comparator<Toys>
{
    @Override
    public int compare(Toys o1, Toys o2) {
        return (o1.getChildren_age()-o2.getChildren_age());
    }
}

public class Main {

    public static ArrayList<Toys> Creation()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("How much money do you have? \nInput: ");
        double money = scan.nextDouble();
        double amount = 0;
        int counter = 1;
        ArrayList<Toys>childrenroom = new ArrayList<>();

        while (true)
        {
            System.out.println("Please, input data (name, price, how old is your child, size Small/Middle/Big, sex Boy/Girl/Unisex and type");
            System.out.println(counter+" toy");
            String name = scan.next();
            double price = scan.nextDouble();
            int children_age = scan.nextInt();
            String size = scan.next();
            String sex = scan.next();
            String type = scan.next();
            amount += price;
            if (amount > money)
            {
                System.out.println("Your toys:");
                break;
            }
            else{
                childrenroom.add(new Toys(name, price, children_age, Toys.Size.valueOf(size), Toys.Sex.valueOf(sex), type));
                counter++;
            }
        }
        return childrenroom;
    }

    public static void main(String[] args)
    {
        ArrayList<Toys>toys = Creation();

        System.out.println("------------------------");
        for (Toys e: toys)
        {
            e.Display();
        }


        System.out.println("----------Sorted from young children to elder--------------");
        toys.sort(new Sort());

        for (Toys e: toys)
        {
            e.Display();
        }

        System.out.println("------------Search toys cheaper than 50--------------");
        for (Toys e : toys)
        {
            e.Search_less_than(50);
        }
    }
}
