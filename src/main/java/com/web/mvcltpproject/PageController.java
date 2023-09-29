package com.web.mvcltpproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Controller
public class PageController {

    private List<Grade> studentGrades = new ArrayList<>();

    @GetMapping("grades")
    public String getGrades(Model model) {
        model.addAttribute("grades", studentGrades);
        return "grades";
    }

    @GetMapping("gradeForm")
    public String gradeForm(Model model, @RequestParam(required = false) String id) {
        Grade grade = getGrade(id);
        model.addAttribute("grade", grade);
        return "form";
    }

    @PostMapping("/handleSubmit")
    public String handleSubmit(Grade grade) {
        int index = getGradeIndex(grade.getId());
        if (index == Constants.NOT_FOUND) {
            // Если студента с таким именем нет, добавьте новый
            studentGrades.add(grade);
        } else {
            // Иначе удалите существующую запись и добавьте обновленную версию
            studentGrades.remove(index);
            studentGrades.add(grade);
        }
        return "redirect:/grades";
    }

    public int getGradeIndex(String id) {
        for (int index = 0; index < studentGrades.size(); index++) {
            if (studentGrades.get(index).getId().equals(id)) {
                return index;
            }
        }
        return Constants.NOT_FOUND; // Возвращайте -1 вместо -1000 для обозначения отсутствия элемента
    }

    public Grade getGrade(String id) {
        for (Grade grade : studentGrades) {
            if (grade.getId().equals(id)) {
                return grade;
            }
        }
        return new Grade(); // Если студента с таким именем нет, верните пустой объект Grade
    }
}
