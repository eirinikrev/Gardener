package com.EiriniManu;

import org.python.util.PythonInterpreter;
import org.python.core.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

       try(PythonInterpreter pyInt = new PythonInterpreter()){
           pyInt.exec("import sys");
           pyInt.exec("print('hello world')");
       }
    }
}