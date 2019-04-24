public class Toys {

    public enum Size{Small, Middle, Big}
    public enum Sex{Boy, Girl, Unisex}

    String name;
    double price;
    int children_age;
    Size size;
    Sex sex;
    String type;

    public Toys() {
        setName("none");
        setPrice(0.0);
        setChildren_age(0);
        setSize(Size.Small);
        setSex(Sex.Unisex);
        setType("default");
    }

    public Toys(String name, double price, int children_age, Size size, Sex sex, String type) {
        this.name = name;
        this.price = price;
        this.children_age = children_age;
        this.size = size;
        this.sex = sex;
        this.type = type;
    }

    public void Display()
    {
        System.out.println(getName()+" "+getPrice()+" "+getChildren_age()+" "+getSize()+" "+getSex()+" "+getType());
    }

    public void Search_less_than(double price)
    {
        if (this.price <= price)
        {
            Display();
        }
    }

    public void Search_using_type(String type)
    {
        if (this.type.equals(type))
        {
            Display();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getChildren_age() {
        return children_age;
    }

    public void setChildren_age(int children_age) {
        this.children_age = children_age;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
