#
# -D_REENTRANT : support multi thread
# -fPIC : support shared library
#

OS_NAME := $(shell uname -o | tr A-Z a-z)

C_FLAGS := -D_REENTRANT \
	-I$(JAVA_HOME)/include \
	-I$(JAVA_HOME)/include/$(OS_NAME) \
	-fPIC \
	-Wall \
	-Werror
all:
	echo $(OS_NAME)
	$(CC) $(C_FLAGS) -c pkg_Cls.c
	$(CC) -shared pkg_Cls.o -o libpkg_Cls.so
