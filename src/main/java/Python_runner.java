/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ruslan Feshchenko
 */

import java.nio.file.Path;
import java.nio.file.Paths;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.io.IOAccess; // Import the updated IO access controls


public class Python_runner {
    public static void main(String[] args) {
        // 1. Safely resolve the absolute path to your venv executable on Windows 11
        // NetBeans runs applications from the root project directory by default
        Path venvExecutablePath = Paths.get("venv", "Scripts", "graalpy.exe").toAbsolutePath();
        
        try (Context context = Context.newBuilder()
                .allowIO(IOAccess.ALL)
                .option("python.Executable", venvExecutablePath.toString()) // Points context to the venv
                .option("python.ForceImportSite", "true") // Ensures site-packages are actively loaded
                .build()) {
            
            // Execute your logic safely
            context.eval("python", "import termcolor");
            context.eval("python", "print('Hello from GraalPy inside NetBeans!')");
        }
    }
}
