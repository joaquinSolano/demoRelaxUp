package pe.edu.upc.demorelaxup.dtos;

public class TotalIngresosbyPlanDTO {

    public String namePlan;

    public double totalMoneyByPlan;

    public String getNamePlan() {
        return namePlan;
    }

    public void setNamePlan(String namePlan) {
        this.namePlan = namePlan;
    }

    public double getTotalMoneyByPlan() {
        return totalMoneyByPlan;
    }

    public void setTotalMoneyByPlan(double totalMoneyByPlan) {
        this.totalMoneyByPlan = totalMoneyByPlan;
    }
}
