import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args){
        List<String>students=new ArrayList<>();
        students.addAll(Arrays.asList(

        "Ramiro", "Rodrigo","Matias", "Brisa",
        "Santiago", "Luisina", "Federico", "Romina",
        "Elizabeth", "Daiana", "Julia", "José"));

        List<List<String>> courses = new ArrayList<List<String>>();
        for (int i = 0; i<3;i++){
            courses.add(students.subList(0+ 4*i, 3+4*i));
        }
        System.out.println(courses);
        int count = 1;
        for(List<String> course : courses){
            System.out.println("course #"+(count++)+ ":"+ course);
        }
    }
    
}
