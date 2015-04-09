#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "student.h"

int main()
{
  Student *stud1;
  
  stud1 = make_student(1001);
  make_student_active(stud1);
  set_student_name(stud1, "foobar");
  if (is_student_active(stud1)) {
    printf("student name is %s\n", stud1->name);
  }  
  free_student(stud1);
  
  return EXIT_SUCCESS;
}
