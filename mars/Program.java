package mars;

import java.util.*;

public abstract class Program {
    String leadFilename;
    String exceptionHandler;

    Program() {
    }

    Program(String leadFilename, String exceptionHandler) {
        this.leadFilename = leadFilename;
        this.exceptionHandler = exceptionHandler;
    }

    public ArrayList prepareFilesForAssembly(ArrayList filenames, String leadFilename, String exceptionHandler) throws ProcessingException{
        // make prepareFilesForAssembly throw an error when not overridden
        ArrayList unitsToAssemble = new ArrayList();
        for (int i = 0; i < filenames.size(); i++) {
            String filename = (String) filenames.get(i);
            TranslationUnit preparee = new ARMTranslationUnit(filename);
            preparee.tokenize();
            unitsToAssemble.add(preparee);
        }
        return unitsToAssemble;
    }

    public abstract ErrorList assemble(ArrayList MIPSprogramsToAssemble, boolean extendedAssemblerEnabled)
    throws ProcessingException;

    public abstract ErrorList assemble(ArrayList MIPSprogramsToAssemble, boolean extendedAssemblerEnabled,
                              boolean warningsAreErrors) throws ProcessingException;
    
    public abstract boolean simulate(int maxSteps) throws ProcessingException;
}
