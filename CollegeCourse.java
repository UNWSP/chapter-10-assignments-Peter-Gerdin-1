// Peter Gerdrin
public class CollegeCourse {
    private String department;
    private int courseNum;
    private int credits;
    private int fee;

    public CollegeCourse(String department, int courseNum, int credits, int fee) {
        this.department = department;
        this.courseNum = courseNum;
        this.credits = credits;
        this.fee = fee;
    }
    public void Display(){
        String message = String.format("Department: %s \nCourse number: %d \nCredits: %d \nFee: $%d", department, courseNum, credits, fee);
        System.out.println(message);
    }
}
