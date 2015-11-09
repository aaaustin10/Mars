package mars;

import java.util.*;
import java.io.*;

class TranslationUnit {
    String filename;
    ArrayList sourceList;
    
    TranslationUnit(String filename) {
        this.filename = filename;
        readSource();
    }

    public void tokenize() {
        System.out.println("tokenize is intended to be overridden");
    }

    private void readSource() {
        this.sourceList = new ArrayList();
        BufferedReader inputFile;
        String line;
        try {
            inputFile = new BufferedReader(new FileReader(filename));
            line = inputFile.readLine();
            while (line != null) {
                sourceList.add(line);
                line = inputFile.readLine();
            }
        } catch (Exception e) {
            // TODO fix exception error messages
            /*ErrorList errors = null;
            errors = new ErrorList();
            errors.add(new ErrorMessage((MIPSprogram)null,0,0,e.toString()));
            throw new ProcessingException(errors);*/
        }
        return;
    }
}