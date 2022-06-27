package com.cg.assignment;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Predicate;

public class Q4readWrite {
    public static void main(String[] args) throws IOException {
        String paths="C:\\Users\\AKANTKUS\\Downloads\\Java11Assignments_StudentList.txt";
        System.out.println("All the Students in the list are: ");
        Files.lines(Path.of(paths)).filter(Predicate.not(String::isEmpty)).forEach(System.out::println);
//      Files.lines(Path.of(paths)).filter(Predicate.not(String::isEmpty)).forEach(System.out::println);
        //Typecasting of type explicit with lossy conversion which will help us to count absolute no. of students in the sheet
        int x = (int)Files.lines(Path.of(paths)).filter(Predicate.not(String::isEmpty)).count();
        //        int x = (int)Files.lines(Path.of(paths)).filter(Predicate.not(String::isEmpty)).count();
        System.out.println("The numbers of students in the sheet is: "+x);
    }
}
