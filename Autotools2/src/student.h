#include <stdio.h>
#include <stdlib.h>

typedef struct {
  unsigned id;
  int active;
  char *name;
} Student;

Student *make_student(unsigned id);

void free_student(Student *stud);

void make_student_active(Student *stud);

void set_student_name(Student *stud, char *name);

int is_student_active(Student *stud);
