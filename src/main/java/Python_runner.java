/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ruslan Feshchenko
 */

import org.graalvm.polyglot.*;
import org.graalvm.python.embedding.GraalPyResources;

public class Python_runner {
    public static void main(String[] args) {
        try (Context context = GraalPyResources.createContext()) {
            context.eval("python", "print('Hello from GraalPy inside NetBeans!')");
        }
    }
}
