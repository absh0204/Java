/*
-jvm+class liberaries(provides capbility required to run java prog.)=java runtime environment
-jdk includes development tools required for writing java program.
-JRE provides environment to run java applications
-jvm is java virtual machine that helps to convert java code to corressponding byte code
jvm is part of jre
-JVM allows bytecode to run on anydevice

jvm converts java byte code to machine code.
                        types of virtual machines:

-System based VM (SVM) -This creates the environment for you to work for multiple users or multiple instances over 
    that. These environments are completely independent.

-Application based VM (AVM) or Process based VM -In here It will allow you to run a single process 
    as an application on a host machine. You may have the software or application which helps us to run other programs.
    eg -JVM, CLR -Common Language Runtime →Helps .net to create a VM. ,
    PVM -Parrot Virtual Machine → Create a environment for dynamic language. 
    There is no hardware but it creates a platform or environment to run some kind of a language as input 
    and convert it to different language or different output which someone else can understand.


-When you download JRE, JVM comes with it. When you install JRE, it will deploy all the codes which can create a JVM. 
    If we are installing JRE on a windows machine, it will deploy the code, which will require to create the JVM for windows environment.
    If we install JRE on mac environment, it will deploy the code to create the JVM for mac environment.
-A Java Virtual Machine (JVM) instance will be built for each program.
 As a result, after the program is finished, the JVM instance is destroyed.

 -JVM will be destroyed under 2 circumstances such as,

-If there are no non-daemon threads running. At that moment, the JVM will forcefully terminate all the active daemon threads.
    If the Java app kills itself (by calling System.exit() method).    



                Components of JVM
JVM is made up of three components, They are

1)Class Loader -to load the class files
2)Memory Area -to store the classes
3)Execution Engine -to execute/provide run time environment



1. Class Loader
It is responsible for the following three activities

Loading
Linking
Initialization
Loading
This component will load classes for you. BootStrap ClassLoader, Extension ClassLoader, 
Application ClassLoader are the three class loader which will help in achieving it.

The JVM’s Classloader subsystem is in responsible of loading class files (.class) into memory. 
When we run a Java program, the class loader loads it first. When JVM loads a class, it stores the following
 information in the method area.

The fully qualified name of the loaded class.
The immediate parent class of the loaded class. (If there are no parent class JVM decides loaded class as a parent class)
Whether the “.class” file is a Class or Interface or Enum.
Details on the Modifier, Variables, and Method information, and so on.
After loading dot class file immediately JVM create an object for the loaded class on the heap memory 
of type java.lang.Class. 

This class type object is a predefined Class object in the java.lang package. A programmer can use the Class class object to get 
information about a class’s methods, variables, and constructors, among other things.

Linking
Verify -Bytecode verifier will verify whether the generated bytecode is proper or not if verification fails we will get verification error.
Prepare -For all static variables memory will be allocated and assigned with default values.
Resolve -All symbolic memory references are replaced with the original references from Method Area.
Initialization
This is the final step in the Class Loading process, where all static variables are assigned their original values and static blocks are executed.

2. Memory Area
The memory area of the JVM is where data is stored. Method Area, Heap Area, Stack, Program Counter(PC) Registers, and 
Native Method Area are the five sub-areas of the JVM memory area.


Class Area -Every class’s class level data is stored here, such as the runtime constant pool, field and method data, and method code.

Heap -The heap area, which is created during virtual machine startup and from which memory is allocated for all class instances and arrays, represents the runtime data area.

Stack -In Java, stack memory is used for static memory allocation and thread execution. It’s made for each thread. When threads start, the 
JVM creates a separate runtime stack in which method calls are stored. For each method call, a frame will be produced and pushed into the runtime stack’s storage.
 When a frame’s method invocation is finished, it is destroyed.

Program Counter Register -Each thread will have its own PC Register, which will store the address of the currently executing instruction. 
Once the instruction is completed, the PC register will be updated with the next instruction.

Native Method Area -This will store information about native methods, which are written in a language other than Java, such as C or C++. 
Every new thread will have its own native method stack, same like stack and PC register.
    */ 