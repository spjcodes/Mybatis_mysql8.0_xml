import com.spj.mybatis.action.PublicAction;

public class Main {

    public static void main(String[] args) {

        PublicAction publicAction = new PublicAction();
        publicAction.addStudent();
        publicAction.getStudent();
       /* System.out.println("............get one studnet ...........");
        publicAction.getStudent();
        System.out.println("............get all studnet ...........");
        publicAction.getStudents();*/

    }
}
