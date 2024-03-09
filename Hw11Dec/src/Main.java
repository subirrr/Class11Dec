import Models.Student;


public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Student std1 = new Student();

        std1.setName("Yawat Malla");
        std1.setAge(17);
        int[] std1_marks = {50, 60, 70};
        std1.setMarks(std1_marks);

        Student std2 = new Student();

        std2.setName("Hari Lal");
        std2.setAge(16);
        std2.setGrade(11);
        int[] std2_marks ={40,80,60};
        std2.setMarks(std2_marks);

        Student std3 = new Student();

        std3.setName("Mika Lal");
        std3.setAge(15);
        std3.setGrade(10);
        int[] std3_marks ={30,20,50};
        std3.setMarks(std3_marks);

        std1.ResultDisplayer(std1.getName(), std1.getAge(), std1.getMarks(),std1.getGrade());
        std2.ResultDisplayer(std2.getName(), std2.getAge(), std2.getMarks(),std2.getGrade());
        std3.ResultDisplayer(std3.getName(), std3.getAge(), std3.getMarks(),std3.getGrade());
    }
}