import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Student extends PersonProfile{
    String [][] courseList;
    String [] grade;

    public Student(String name, String gender, String dateOfBirth, String filename) {
        super(name, gender, dateOfBirth);
        courseList = new String[countCourse(filename)][5];
        grade = new String[courseList.length];
        try{
            Scanner input = new Scanner(new FileInputStream(filename));
            while(input.hasNextLine()){
                for(int i=0;i<courseList.length;i++){
                    for(int j=0;j<courseList[i].length;j++) {
                        courseList[i][j] = input.nextLine();
                    }
                }
            }
            input.close();
        }catch (FileNotFoundException e){
            System.out.println("File was not found.");
        }
    }

    private int countCourse(String filename){
        int count = 0;
        try{
            Scanner input = new Scanner(new FileInputStream(filename));
            while(input.hasNextLine()){
                input.nextLine();
                count++;
            }
            input.close();
        }catch (FileNotFoundException e){
            System.out.println("File was not found.");
        }
        return count/5;
    }

    public void getGrade(){
        for(int i=0;i<courseList.length;i++){
            if (Integer.parseInt(courseList[i][4]) >= 85) {
                grade[i] = "A";
            } else if (Integer.parseInt(courseList[i][4]) >= 75) {
                grade[i] = "A-";
            } else if (Integer.parseInt(courseList[i][4]) >= 70) {
                grade[i] = "B+";
            } else if (Integer.parseInt(courseList[i][4]) >= 65) {
                grade[i] = "B";
            } else if (Integer.parseInt(courseList[i][4]) >= 60) {
                grade[i] = "B-";
            } else if (Integer.parseInt(courseList[i][4]) >= 55) {
                grade[i] = "C+";
            } else if (Integer.parseInt(courseList[i][4]) >= 50) {
                grade[i] = "C";
            } else if (Integer.parseInt(courseList[i][4]) >= 45) {
                grade[i] = "D";
            } else if (Integer.parseInt(courseList[i][4]) >= 35) {
                grade[i] = "E";
            } else {
                grade[i] = "F";
            }
        }
    }

    public void displayCourseList(){
        for(int j=0; j<courseList.length;j++){
            for(int i=0;i<courseList[j].length;i++){
                System.out.println(courseList[i][j]);
            }
        }
    }

    public void displayGrade(){
        for(String grade1 : grade){
            System.out.println(grade1);
        }
    }
}
