package mars;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import mars.arm.*;

import java.io.*;

class ARMTranslationUnit extends TranslationUnit{
    ARMTranslationUnit(String filename) {
        super(filename);
    }

    public void tokenize() {
        ANTLRInputStream input = null;
        try {
            input = new ANTLRInputStream(new FileInputStream(new File(filename)));
        } catch (FileNotFoundException e) {
            System.out.format("File not found: %s", e.toString());
        } catch (IOException e) {
            System.out.format("IOException: %s", e.toString());
        }

        armLexer lexer = new armLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        armParser parser = new armParser(tokens);

        ParseTree tree = parser.root(); // begin parsing at root rule
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new ARMWalkerCallbacks(), tree);

        System.out.println("Abstract Syntax Tree");
        System.out.println(tree.toStringTree(parser));
    }
}
