#include <jni.h>
#include "pkg_Cls.h"

/*
 * Class:     pkg_Cls
 * Method:    f
 * Signature: (ILjava/lang/String;)D
 */
JNIEXPORT jdouble JNICALL Java_pkg_Cls_f(
		JNIEnv *env, /* jni interface pointer */
		jobject obj, /* "this" pointer, non-static method */
		jint i,      /* argument #1 */
		jstring s)   /* argument #2 */
{
	jboolean isCopy;
	/* Obtain a C-copy of the java string */
	const char *str = (*env)->GetStringUTFChars(env, s, &isCopy);

	/* Process the string */
	printf("jni: %s\n", str);
	printf("jni: %d\n", i);
	printf("jni: strlen(%s) = %d\n", str, (*env)->GetStringLength(env, s));
	printf("jni: isCopy = %s\n",  isCopy == JNI_FALSE ? "JNI_FALSE" : "JNI_TRUE");

	/* Now we are done with str, release it */
	(*env)->ReleaseStringUTFChars(env, s, str);

	return 0.1;
}

/*
 * Class:     pkg_Cls
 * Method:    pa
 * Signature: ([I)D
 */
JNIEXPORT jdouble JNICALL Java_pkg_Cls_pa(
		JNIEnv *env, /* C version jni interface pointer */
		jobject obj, /* "this" pointer, non-static method */
		jintArray intArray) /* argument #1 */
{
	jboolean isCopy;
	jint *array = (*env)->GetIntArrayElements(env, intArray, &isCopy);
	jsize arrayLength = (*env)->GetArrayLength(env, intArray);
	jint i;

	printf("jni: isCopy = %s\n",  isCopy == JNI_FALSE ? "JNI_FALSE" : "JNI_TRUE");
	for (i = 0; i < arrayLength; i++) {
		printf("jni: int array[%d] = %d\n", i, array[i]);
	}

	return 0.2;
}

/*
 * Class:     pkg_Cls
 * Method:    pStringArray
 * Signature: ([Ljava/lang/String;)D
 */
JNIEXPORT jdouble JNICALL Java_pkg_Cls_pStringArray(
		JNIEnv *env,
		jobject obj,
		jobjectArray stringArray)
{
	jsize index;
	jsize stringArrayLength = (*env)->GetArrayLength(env, stringArray);
	printf("jni: stringArrayLength = %d\n", stringArrayLength);

	for (index = 0; index < stringArrayLength; index++) {
		jboolean isCopy = JNI_FALSE;
		jobject jo = (*env)->GetObjectArrayElement(env, stringArray, index);
		const char *str = (*env)->GetStringUTFChars(env, jo, &isCopy);
		printf("jni: string array[%d] = %s\n", index, str);
	}

	return 0.3;
}

/*
 * Class:     pkg_Cls
 * Method:    accessNativeMethod
 * Signature: ()D
 */
JNIEXPORT jdouble JNICALL Java_pkg_Cls_accessMethod(
		JNIEnv *env,
		jobject obj)
{
	/*
	 * get class of the object
	 */
	jclass clazz = (*env)->GetObjectClass(env, obj);

	/*
	 * get the method id if native method f(jint, jstring)
	 */
	jmethodID mid = (*env)->GetMethodID(env, clazz, "f", "(ILjava/lang/String;)D");

	/*
	 * construct a jstring object
	 */
	const char str[] = "Accessing Native Mehtod From Native Method";
	jstring string = (*env)->NewStringUTF(env, str);

	/*
	 * invoke native method f(jint, jstring)
	 */
	jdouble result = (*env)->CallDoubleMethod(env, obj, mid, 10, string);
	printf("jni: %s result = %f\n", __func__, result);

	/*
	 * invoke a java normal method f(jint, jstring, jstring)
	 */
	jmethodID mid2 = (*env)->GetMethodID(env, clazz, "f", "(ILjava/lang/String;Ljava/lang/String;)D");
	jdouble result2 = (*env)->CallDoubleMethod(env, obj, mid2, 10, string, string);
	printf("jni: %s result2 = %f\n", __func__, result2);

	/*
	 * Release the jstring object referenced by string
	 * JVM 删除 Local Ref, 不能够读取 jstring 对象的长度了
	 */
	(*env)->DeleteLocalRef(env, string);

	return 0.4;
}

/*
 * Class:     pkg_Cls
 * Method:    staticNativeMethod
 * Signature: ()D
 */
JNIEXPORT jdouble JNICALL Java_pkg_Cls_staticNativeMethod(
		JNIEnv *en,   /* jni interface pointer */
		jclass clazz) /* "this" pointer, static method,
		               * it's type of jclass, not of jobject
		               */
{
	return 0.5;
}

/*
 * Class:     pkg_Cls
 * Method:    nativeException
 * Signature: ()D
 */
JNIEXPORT jdouble JNICALL Java_pkg_Cls_nativeException(
		JNIEnv *env,
		jobject obj)
{
	jclass clazz = (*env)->GetObjectClass(env, obj);
	(*env)->ThrowNew(env, clazz, "Execption");
	(*env)->ExceptionOccurred(env);
	return 0.6;
}
