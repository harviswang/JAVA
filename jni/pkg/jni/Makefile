#
# -D_REENTRANT : support multi thread
# -fPIC : support shared library
#

C_FLAGS := -D_REENTRANT \
	-I$(JAVA_HOME)/include \
	-I$(JAVA_HOME)/include/linux \
	-fPIC \
	-Wall \
	-Werror
all:
	$(CC) $(C_FLAGS) -c pkg_Cls.c
	$(CC) -shared pkg_Cls.o -o libpkg_Cls.so
