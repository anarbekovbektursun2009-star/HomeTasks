package ConstrctorLMStask;

public class Main {
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass();

        String[] javaCours = {"Java", "..."};
        MyClass myClass2 = new MyClass("Bektursun", "Anarbekov", 16, javaCours);

        myClass1.getInfo();
        myClass2.getInfo();
    }
}
