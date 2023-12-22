public class Employee {
    String name;
    double oldSalary;
    double salary;
    int workHours;
    int hireYear ;
    double taxQuantity;
    double bonusQuantity = 0;
    double raiseSalaryQuantity = 0;

    public double tax(double salary){
        if(salary < 1000){
            taxQuantity = 0;
        }else {
            taxQuantity = salary * 3 / 100;
        }
        return  taxQuantity;
    }

    public double bonus(int workHours){

        if(workHours > 40){
            bonusQuantity  = (workHours - 40) * 30;
        }
        return bonusQuantity;
    }

    public double raiseSalary(int hireYear, double salary){
        int year = 2021 - hireYear;
        if( year < 10){
            raiseSalaryQuantity = salary * 5 /100;
        }else if ( year > 9 && year < 20){
            raiseSalaryQuantity = salary * 10 / 100;
        }else {
            raiseSalaryQuantity = salary * 15 / 100;
        }
        return raiseSalaryQuantity;
    }
    public String toString(){
        return "Adı: " + this.name + "\n"
                + "Maaşı: " + this.oldSalary + "\n"
                + "Çalışma Saati: " + this.workHours + "\n"
                + "Başlangıç Yılı: " + this .hireYear + "\n"
                + "Vergi: " + this.taxQuantity + "\n"
                + "Bonus:" + this.bonusQuantity + "\n"
                + "Maaş Artışı: " + this.raiseSalaryQuantity + "\n"
                + "Vergi ve Bonuslarla ile birlikte maaş: " + (this.salary - this.raiseSalaryQuantity) + "\n"
                + "Toplam maaş: " + this.salary;
    }
    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.oldSalary = salary;
        this.workHours = workHours;
        this.hireYear =hireYear;
        this.taxQuantity = tax(salary);
        this.bonusQuantity = bonus(workHours);
        this.raiseSalaryQuantity = raiseSalary(hireYear, salary);
        this.salary = salary - taxQuantity + bonusQuantity + raiseSalaryQuantity;

    }
}
