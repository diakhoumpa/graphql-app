package com.groupeisi.mapper;

import com.groupeisi.dto.StudentDto;
import com.groupeisi.entities.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    public StudentDto toDto(Student student);
    public Student toEntity(StudentDto studentDto);
}
