package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Workers {
    private String name;
    private WorkerLevel level;
    private double baseSalary;
 
    private Departament departament;
    private List<HoursContract> contracts = new ArrayList<>();

    public Workers(String name, WorkerLevel level, double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public Workers() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HoursContract> getContracts() {
        return contracts;
    }

    public void addContract(HoursContract contract){
        contracts.add(contract);
    }

    public void RemoveContract(HoursContract contract){
        contracts.remove(contract);
    }

    public double income(int year,int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        
        for (HoursContract c : contracts) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1+cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                sum += c.totalValue();    
            }
            
        }
        return sum;
    }
}
