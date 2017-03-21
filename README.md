# Java-Library-Issue-Example 

## *Resolved*

Demonstrate the issue with java library module and android application

## Steps to reproduce

1. Create a sample application
2. Use classpath 'com.android.tools.build:gradle:2.2.0-alpha1'
3. Add a java library module to your application (called `api` for example)
4. Create a random class (MyClass)
5. Add the library to your sample app (compile project(:api'))
6. Try to access MyClass from sample app
7. Observe: MyClass is not visible

## Expected:
MyClass should be accessible, as well as anything public from the java library.
