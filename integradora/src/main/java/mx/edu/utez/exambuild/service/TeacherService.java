package mx.edu.utez.exambuild.service;

import java.util.List;
import mx.edu.utez.exambuild.entity.Teacher;

public interface TeacherService {

    public Teacher saveOrUpdate(Teacher teacher);

    public List<Teacher> findAllTeacher();

    public void delete(Integer id);

    public Teacher findTeacherById(Integer id);
}
