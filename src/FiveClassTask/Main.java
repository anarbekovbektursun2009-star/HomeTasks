package FiveClassTask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class1 class1=new Class1();
        Class2 class2=new Class2();
        Class3 class3=new Class3();
        Class4 class4=new Class4();
        Class5 class5=new Class5();

        class1.name="Beka";
        class1.surname="Anarbekov";
        class1.age=15;
        class1.address="Kalys-Ordo";
        class1.id=1234567890;


        class2.brand="NIKE";
        class2.model="Air Jordan I Retro";
        class2.year=1984;
        class2.price=12590;
        class2.color="Black White";

        class3.title="One-Piece";
        class3.author="Eiichro Oda";
        class3.pages=21540;
        class3.publishedYear=1997;
        class3.publisher="SenenJump";


        class4.countryName="Kyrgyzstan";
        class4.capital="Bishkek";
        class4.population=7225000;
        class4.area=199900;
        class4.president="Sadyr Japarov";

        class5.movieName="Иллюзия обмана";
        class5.director="Луи Летерье";
        class5.releaseYear=2013;
        class5.duration=95;
        class5.genre="Thriller,Crime";



        Object[] allclass={class1,class2,class3,class4,class5};
        for(Object qwer:allclass){
            System.out.println(qwer);
        }
    }
}