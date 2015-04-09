# AC_INIT is the first macro, need to indicate the name of the...
# project and its version, can also provide email address
AC_INIT(Student, 0.1, foo@bar.com)

# Initialise environment for Automake, is always needed in...
# projects with Automake  
AM_INIT_AUTOMAKE

# Identifying source directory where Makefile.am and code is found
AC_CONFIG_SRCDIR([src/])
AM_CONFIG_HEADER([src/config.h])

# Identifies the C preprocessor macro which allow identification...
# of header files
AC_DEFINE([PROGNAME],["Student"],["Student"])

# Checks for programs AND determines the C compiler to use
AC_PROG_CC

# Checks for header files
AC_HEADER_STDC

# Checks for typedefs. structures and compiler characteristics
AC_C_CONST
AC_TYPE_SIZE_T

# Checks for library functions
AC_FUNC_MALLOC

# Things to generate
AC_CONFIG_FILES([Makefile src/Makefile])

AC_OUTPUT

