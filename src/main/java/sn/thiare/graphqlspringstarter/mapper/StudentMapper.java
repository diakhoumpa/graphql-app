package sn.thiare.graphqlspringstarter.mapper;

import org.mapstruct.Mapper;
import sn.thiare.graphqlspringstarter.dto.StudentDto;
import sn.thiare.graphqlspringstarter.entities.Student;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    public StudentDto toDto(Student student);
    public Student toEntity(StudentDto studentDto);
}
