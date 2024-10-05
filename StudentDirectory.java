import java.awt.List;
import java.util.*;
/*
Задание 1. Студенческий справочник
Реализуйте программу для работы с простым справочником студентов.
Программа должна иметь следующие функции:
● addStudent(String name, Integer grade): Добавляет или
обновляет запись о студенте с именем name и оценкой grade. Если
студент уже существует, обновляет его оценку.
● findStudent(String name): Находит оценки студента по его имени.
Если студент существует, возвращает список его оценок. Если нет —
пустой список.
● getAllStudents(): Возвращает весь справочник студентов в виде
HashMap, где ключи — имена студентов, а значения — списки их оценок.
● removeStudent(String name): Удаляет запись о студенте по имени
из справочника. Если запись не существует, ничего не происходит.
 */

public class StudentDirectory {
    private static Map<Student, ArrayList<Integer>> directory = new HashMap<>();

    public static void addStudent(Student student, Integer grade){
        ArrayList<Integer> grades = new ArrayList<>();
        if (directory.containsKey(student)){
            grades.addAll(directory.get(student));
            grades.add(grade);
            directory.put(student, grades);
//            Collections.copy(grades, directory.get(student));
//            grades.add(grade);
            directory.put(student, grades);
        } else {
            grades.add(grade);
            directory.put(student, grades);
        }
    }
    public static ArrayList<Integer> findStudent(Student student){
        if (directory.containsKey(student)){
            return directory.get(student);
        }
        return new ArrayList<Integer>();
    }
    public static Map getAllStudents(){
        return directory;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (Student student: directory.keySet()){
            int sum = directory.get(student).stream().mapToInt(Integer::intValue).sum();
            double avgGrade = sum / directory.get(student).size();
            sb.append(student);
            sb.append(", grade: " + directory.get(student)+ ", ");
            sb.append("average grade: " + avgGrade + "\n");
        }
        sb.append("}\n");
        return sb.toString();
    }
    public static void removeStudent(Student student){
        if (directory.containsKey(student)) directory.remove(student);
    }
}
