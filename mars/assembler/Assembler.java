package mars.assembler;

import java.util.ArrayList;

import mars.ErrorList;
import mars.Program;
import mars.ProcessingException;

public abstract class Assembler {
    public abstract ArrayList assemble(Program programsToAssemble,
                                       boolean extendedAssemblerEnabled,
                                       boolean warningsAreErrors)
    throws ProcessingException;

    public abstract ArrayList assemble(Program p, boolean extendedAssemblerEnabled)
    throws ProcessingException;

    public abstract ArrayList assemble(ArrayList tokenizedProgramFiles,
                                       boolean extendedAssemblerEnabled)
    throws ProcessingException;

    public abstract ArrayList assemble(ArrayList tokenizedProgramFiles,
                                       boolean extendedAssemblerEnabled,
                                       boolean warningsAreErrors)
    throws ProcessingException;

    public abstract ErrorList getErrorList();
}
