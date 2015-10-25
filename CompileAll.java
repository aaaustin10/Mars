import java.io.*;
import java.lang.*;
import java.util.*;

public class CompileAll {
    static ArrayList<String> args_to_compile = new ArrayList<String>();

    static void compileDir(File dir) {
        for (File f : dir.listFiles()) {
            if (f.isDirectory()) {
                compileDir(f);
                continue;
            }
            String path = f.toString();
            if (path.endsWith(".java")) {
                String class_file = path.substring(0, path.length() - 5) + ".class";
                if (new File(class_file).lastModified() < f.lastModified()) {
                    args_to_compile.add(path);
                }
            }
        }
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        int num_cores = Runtime.getRuntime().availableProcessors();
        args_to_compile.add("javac");
        int return_value = -1;
        try {
            compileDir(new File("."));
            if (args_to_compile.size() != 1) {
                ProcessBuilder compiler_builder = new ProcessBuilder(args_to_compile.toArray(new String[args_to_compile.size()]));
                compiler_builder.redirectErrorStream(true);
                Process compiler = compiler_builder.start();
                BufferedReader process_output = new BufferedReader(new InputStreamReader(compiler.getInputStream()));
                String line = null;
                while ((line = process_output.readLine()) != null) {
                    System.out.println(line);
                }
                process_output.close();
                compiler.waitFor();
                return_value = compiler.exitValue();
            } else {
                return_value = 0;
            }
        } catch (IOException e) {
            System.out.println("IOException has been thrown!" + e.toString());
        } catch (InterruptedException e) {
            System.out.println("InterruptedException has been thrown!" + e.toString());
        }
        long end = System.nanoTime();
        System.out.println("Completed in " + (end - start) / 1000000000.0 + " seconds.");
        System.exit(return_value);
    }
}
