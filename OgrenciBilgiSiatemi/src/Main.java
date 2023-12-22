// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","555","TRH");
        Teacher t2 = new Teacher("Graham","000","FZK");
        Teacher t3 = new Teacher("Külyutmaz", "111","BIO");

        Course tarih = new Course("TARİH","101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","101","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Şaban", "123", "4", tarih, fizik,biyo);
        s1.addBulkExamNote(100,70,50);
        s1.addOtherBulkExamNote(100,100,100);
        s1.isPass();

        Student s2 = new Student("Necmi", "444","4", tarih, fizik, biyo);
        s2.addBulkExamNote(50,30,70);
        s2.addOtherBulkExamNote(50,50,50);
        s2.isPass();
    }
}