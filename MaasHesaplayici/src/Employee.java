public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear ;

    //Vergi miktarı hesaplama
    public double tax(double salary){
        if(salary < 1000){
            return 0;
        }else {
            return salary * 3 / 100;
        }
    }

    //Bonus hesaplama
    public double bonus(int workHours){

        if(workHours > 40){
            return (workHours - 40) * 30;
        }
        return 0;
    }

    //Maaş artışı hesaplama
    public double raiseSalary(int hireYear, double salary){
        int year = 2021 - hireYear;
        if( year < 10){
            return salary * 5 /100;
        }else if ( year > 9 && year < 20){
            return salary * 10 / 100;
        }else {
            return salary * 15 / 100;
        }
    }
    // Bilgilerini stringe dönüştürme
    public String toString(){
        return "Adı: " + this.name + "\n"
                + "Maaşı: " + salary + "\n"
                + "Çalışma Saati: " + this.workHours + "\n"
                + "Başlangıç Yılı: " + this .hireYear + "\n"
                + "Vergi: " + tax(salary) + "\n"
                + "Bonus:" + bonus(workHours) + "\n"
                + "Maaş Artışı: " + raiseSalary(hireYear,salary) + "\n"
                + "Vergi ve Bonuslarla ile birlikte maaş: " + (salary - tax(salary) + bonus(workHours)) + "\n"
                + "Toplam maaş: " + (salary - tax(salary) + bonus(workHours) + raiseSalary(hireYear, salary));
    }
    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.workHours = workHours;
        this.hireYear =hireYear;
        this.salary = salary;
    }
}
