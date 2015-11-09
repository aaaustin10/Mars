package mars;

import java.util.*;

class ARMProgram extends Program {
    ARMProgram(String leadFilename, String exceptionHandler) {
        super(leadFilename, exceptionHandler);
    }

    public ArrayList prepareFilesForAssembly(ArrayList filenames, String leadFilename, String exceptionHandler) throws ProcessingException{
        ArrayList unitsToAssemble = new ArrayList();
        for (int i = 0; i < filenames.size(); i++) {
            String filename = (String) filenames.get(i);
            TranslationUnit preparee = new ARMTranslationUnit(filename);
            preparee.tokenize();
            unitsToAssemble.add(preparee);
        }
        return unitsToAssemble;
    }

    public ErrorList assemble(ArrayList MIPSprogramsToAssemble, boolean extendedAssemblerEnabled)
    throws ProcessingException {
        return assemble(MIPSprogramsToAssemble, extendedAssemblerEnabled, false);
    }

    public ErrorList assemble(ArrayList MIPSprogramsToAssemble, boolean extendedAssemblerEnabled,
        boolean warningsAreErrors) throws ProcessingException {
        if (1 == 0) {
            throw new ProcessingException();
        }
        return null;
    }

    public boolean simulate(int maxSteps) throws ProcessingException {
        return false;
    }
}
