package mars.arm;
// Generated from arm.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link armParser}.
 */
public interface armListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link armParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(armParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link armParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(armParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link armParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(armParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link armParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(armParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link armParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(armParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link armParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(armParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link armParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(armParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link armParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(armParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link armParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(armParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link armParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(armParser.Op2Context ctx);
}
