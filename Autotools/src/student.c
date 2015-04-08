#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "student.h"

Student *make_student(unsigned id) {
  
  Student *stud;
  
  if ((stud = (Student *)malloc(sizeof(Student))) == NULL) {
    printf("Failed to allocate Student structure!\n");
    exit(EXIT_FAILURE);
  }
  stud->active = 0;
  stud->id = id;
  stud->name = NULL;
  
  return stud;
}

void free_student(Student *stud) {
  free(stud->name);
  free(stud);
}

void make_student_active(Student *stud) {
  stud->active = 1;
}

void set_student_name(Student *stud, char *name)
{
  stud->name = strdup(name);
}

int is_student_active(Student *stud) {
  return stud->active;
}
