// Peter Gerdin
public class LabCourse extends CollegeCourse {

    public LabCourse(String department, int courseNum, int credits){
        super(department, courseNum, credits, credits * 120 + 50);
    }
    public void Display(){
        String message = ("This is a Lab course");
        System.out.println(message);
        super.Display();
    }
}
