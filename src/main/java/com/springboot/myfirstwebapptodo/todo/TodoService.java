package com.springboot.myfirstwebapptodo.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(1, "taeseung", "learn aws",
                LocalDate.now().plusYears(1), false));
        todos.add(new Todo(1, "taeseung", "learn DevOps ",
                LocalDate.now().plusYears(2), false));
        todos.add(new Todo(1, "taeseung", "learn FullStackDevelopment",
                LocalDate.now().plusYears(3), false));
    } // 정적 변수를 초기화하기 위해 static 블록을 선언


    public List<Todo> findByUsername(String username){
        return todos;
    }

}
