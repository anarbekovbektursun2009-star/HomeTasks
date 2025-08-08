package HomeTaskPractContrc;

public class Reader {
        String fullName;
        int cardNumber;
        int phoneNumber;
        String library;
        String dateOfBirth;


        public void takeBook(int b) {
            System.out.println(fullName + " взял " + b + " книги.");
        }

        public void returnBook(int b) {
            System.out.println(fullName + " вернул " + b + " книги.");
        }


}
