package by.tms.main;

import by.tms.helper.StringHelper;
import by.tms.model.Employee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringHelper.fromFirsAtoLastB("asfasfsafsaAdfsfsdB"));
        System.out.println(StringHelper.pos3ToPos0("123456"));
        System.out.println(Arrays.toString(StringHelper.palindromeCheck("sds sdasd reeer ewrew")));
        StringHelper.countOfSentences("Hello my friend.How are you doing sds.", 1, 3);
        System.out.println(StringHelper.middleOfWord("string"));
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(2241.421412, "Bogdan Dmitrievich Shcherbakov");
        employees[1] = new Employee(2248698691.421412, "Bogdan Dmitrievich Shcherbakov");
        employees[2] = new Employee(2247781.421412, "Bogdan Dmitrievich Shcherbakov");
        for (Employee employees1 : employees) {
            employees1.report();
        }
    }
}
