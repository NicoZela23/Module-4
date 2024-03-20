package org.example.StudentSorter;

public class CompareByAge implements ICompareMethod{
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getAge() - student2.getAge();
    }
}
