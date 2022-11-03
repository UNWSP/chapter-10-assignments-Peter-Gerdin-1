//Peter Gerdin

import java.util.Scanner;

public class UseCourse {

    public static void main(String[] arg){

        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Please enter course information:\nDepartment >>");
        String department = inputDevice.nextLine();
        System.out.print("course number >>");
        int courseNumber = Integer.parseInt(inputDevice.nextLine());
        System.out.print("credits >>");
        int credits = Integer.parseInt(inputDevice.nextLine());

        if(department.equals("BIO") || department.equals("CHM") || department.equals("CIS") || department.equals("PHY")){
            LabCourse myCourse = new LabCourse(department, courseNumber, credits);
            myCourse.Display();
        }
        else {
            CollegeCourse mycourse = new CollegeCourse(department, courseNumber, credits, credits*120);
            mycourse.Display();
        }
    }
}
