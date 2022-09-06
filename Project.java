public class Project {

    // Listing variable attributes for the 'Project' class.
    int projectNum;
    String projectName;
    String building;
    int erfnum;
    double paid;
    double totalCost;
    int date;

    // Writing a constructor method to create a project object.
    public Project(int projectNum, String projectName, String building, int erfnum, double paid, double totalCost,
            int date) {
        this.projectNum = projectNum;
        this.projectName = projectName;
        this.building = building;
        this.erfnum = erfnum;
        this.paid = paid;
        this.totalCost = totalCost;
        this.date = date;
    }

    public int getProjectNum() {
        return projectNum;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getBuilding() {
        return building;
    }

    public int getErfnum() {
        return erfnum;
    }

    public double getPaid() {
        return paid;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public int getDate() {
        return date;
    }

    public String DisplayProject() {
        String output = "Project number: " + projectNum;
        output += "\nProject name: " + projectName;
        output += "\nType of building: " + building;
        output += "\nErfnum: " + erfnum;
        output += "\nAmount paid already: " + paid;
        output += "\nFull amount: " + totalCost;
        output += "\nDeadline for project: " + date;

        return output;
    }

}