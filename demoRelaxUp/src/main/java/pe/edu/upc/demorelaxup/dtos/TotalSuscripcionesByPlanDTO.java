package pe.edu.upc.demorelaxup.dtos;

public class TotalSuscripcionesByPlanDTO {

    public String namePlan;
    public int totalSusByPlan;

    public String getNamePlan() {
        return namePlan;
    }

    public void setNamePlan(String namePlan) {
        this.namePlan = namePlan;
    }

    public int getTotalSusByPlan() {
        return totalSusByPlan;
    }

    public void setTotalSusByPlan(int totalSusByPlan) {
        this.totalSusByPlan = totalSusByPlan;
    }
}
