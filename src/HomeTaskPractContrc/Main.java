package HomeTaskPractContrc;

public class Main {
        public static void main(String[] args) {
            Reader reader = new Reader();
            reader.fullName = "Буктурсун А.Б";
            reader.cardNumber = 123456;
            reader.phoneNumber = 953007;
            reader.library = "МБОУ СОШ Бибилиотека";
            reader.dateOfBirth = "09.01.08";

            reader.takeBook(3);
            reader.returnBook(3);




        }

}
