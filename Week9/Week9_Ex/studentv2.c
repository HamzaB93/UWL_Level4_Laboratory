#include <stdio.h>

//Creating a structure called student

struct Student{
  int studentId;
  char *firstName;
  char *secondName;
  char *course;
  int startYear;
  //int endYear;
};

int main()
{
  int n, i;
  
  printf("Enter how many student you wish to enroll: ");
  scanf("%d", &n);

  struct Student s[n];
  
  printf("Enter the student details\n");
  for (i = 0; i < n ; ++i)
  {
    printf("   \n");
    printf("Enter the Student Id: \n");
    scanf("%d", &s[i].studentId);
    
    printf("Enter their First name: \n");
    scanf("%s", &s[i].firstName);

    printf("Enter their second name: \n");
    scanf("%s", &s[i].secondName);
    
    printf("Enter the course the student is enrolled for: \n");
    scanf("%s", &s[i].course);
    
    printf("Enter the start year: \n");
    scanf("%d", &s[i].startYear);

    // s[i].endYear = s[i].startYear + 3;
  }  


  printf("Here are all the entries\n");
  for(i = 0; i < n ; i++)
  {  
    printf("Student ID: %d\n", s[i].studentId);
    printf("Full name: %s %s\n", s[i].firstName , s[i].secondName);
    printf("Course: %s\n", s[i].course);
    printf("Start year: %d\n", s[i].startYear);
    //printf("End year: %d\n", endYear);
  }

  return 0;
}
