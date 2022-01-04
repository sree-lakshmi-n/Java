package com.basics.beginnerprograms;

public class PackageExample {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

/*
* javac -d . PackageExample.java
* // Here current folder(.) is the target folder for class file.
* ls
*  - com PackageExample.java
* // Inside this com folder, the same com/zs/java/basics path is there which holds PackageExample.class file
* pwd
*  - /home/runner/Java/com/zs/basics
* cd com/zs/java/basics
* ls
* - PackageExample.class
* pwd
*  - /home/runner/Java/com/zs/basics/com/zs/basics
* */

/*
 * javac -d due PackageExample.java
 * // Here due is the target folder for class file.
 * ls
 *  - com PackageExample.java
 * // Inside this com folder, the same com/zs/java/basics path is there which holds PackageExample.class file
 * pwd
 *  - /home/runner/Java/com/zs/basics
 * cd ../../due // in due folder
 * ls
 * - com
 * java PackageExample // won't work as class file is not in current folder
 * java com.due.PackageExample // give path to class file
 *
 * javap com.due.PackageExample // Prints all methods in the class.
 *
 * com.domain/product.module.activities/actions
 * eg. com.medium.profile.addname
 * */