package org.example.StudentSorter;

public class CompareByGrade implements ICompareMethod{
    @Override
    public int compare(Student student1, Student student2) {
        return (int) (student1.getGrade() - student2.getGrade());
    }
}
