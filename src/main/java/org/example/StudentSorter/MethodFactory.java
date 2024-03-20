package org.example.StudentSorter;

import java.util.ArrayList;
import java.util.List;

public class MethodFactory {
    private static MethodFactory instance;

    private MethodFactory() {}

    public static MethodFactory getInstance() {
        if (instance == null) {
            instance = new MethodFactory();
        }
        return instance;
    }

    public List<ICompareMethod> createCompareMethodsList(String[] sortingFields) {
        List<ICompareMethod> compareMethods = new ArrayList<>();
        for (String field : sortingFields) {
            compareMethods.add(createSimpleCompareMethod(field));
        }
        return compareMethods;
    }

    private static ICompareMethod createSimpleCompareMethod(String field) {
        switch (field.toLowerCase()) {
            case "name":
                return new CompareByName();
            case "age":
                return  new CompareByAge();
            case "grade":
                return new CompareByGrade();
            default:
                System.out.println("Invalid sorting field: " + field);
                System.exit(1);
        }
        return null;
    }
}
