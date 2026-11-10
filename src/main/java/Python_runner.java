/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ruslan Feshchenko
 */

import java.io.File;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.io.IOAccess; // Import the updated IO access controls


public class Python_runner {
    public static void main(String[] args) {
        // Define the exact path to your GraalPy venv executable
        String venvPath = new File("C:\\Java\\Projects\\GraalPyTest\\src\\main\\resources\\venv\\Scripts\\graalpy.exe").getAbsolutePath();
        
        // Configure the polyglot context to leverage the environment
        try (Context context = Context.newBuilder("python")
                .allowIO(IOAccess.ALL)                  // Use the new type-safe replacement
                .allowAllAccess(true)                   
                .option("python.Executable", venvPath)  
                .option("python.ForceImportSite", "true") 
                .build()) {
            
            // Execute your logic safely
            context.eval("python", "import site");
            context.eval("python", 
                    "import termcolor\n"+
                    "termcolor.cprint('Hello from GraalPy inside NetBeans!', color='red', on_color='on_green', attrs='italic')");
        }
    }
}
