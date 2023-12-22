public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stdNo;
    String classes;

    double average;
    boolean isPass;

    Student(String name, String stdNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stdNo = stdNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3){
        if(note1 >=0 && note1 <= 100){
            this.c1.note = note1 * 0.8;
        }
        if(note2 >=0 && note2 <= 100){
            this.c2.note = note2 * 0.8;
        }
        if(note3 >=0 && note3 <= 100){
            this.c3.note = note3 * 0.8;
        }
    }

    void addOtherBulkExamNote(int note1, int note2, int note3){
        if(note1 >=0 && note1 <= 100){
            this.c1.note += note1 * 0.2;
        }
        if(note2 >=0 && note2 <= 100){
            this.c2.note += note2 * 0.2;
        }
        if(note3 >=0 && note3 <= 100){
            this.c3.note += note3 * 0.2;
        }
    }

    void calcAvarage(){
        this.average = (c1.note + c2.note + c3.note) / 3.0;
    }
    void isPass(){
        calcAvarage();
        if(average > 55){
            System.out.println("Sınıfı geçtiniz.");
            this.isPass = true;
        }else {
            System.out.println("Sınıfı geçemediniz.");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name + " Notu:\t" + this.c1.note);
        System.out.println(this.c2.name + " Notu:\t" + this.c2.note);
        System.out.println(this.c3.name + " Notu:\t" + this.c3.note);
        System.out.println("Ortalamanız: " + average);
    }
}
