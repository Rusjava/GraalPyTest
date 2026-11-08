/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ruslan Feshchenko
 */

import org.graalvm.polyglot.Context;

public class Python_runner {
    public static void main(String[] args) {
        try (Context context = Context.newBuilder().build()) {
            context.eval("python", "print('Hello from GraalPy inside NetBeans!')");
        }
    }
}
