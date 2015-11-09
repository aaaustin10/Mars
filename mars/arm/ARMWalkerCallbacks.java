package mars.arm;
public class ARMWalkerCallbacks extends armBaseListener {
 
    @Override
    public void enterInstruction(armParser.InstructionContext ctx) {
        System.out.println("Operation: " + ctx.operation().getChild(0));
        System.out.println("Rd: " + ctx.REGISTER(0));
        System.out.println("Rn: " + ctx.REGISTER(1));
        if (ctx.op2().REGISTER() != null) {
            System.out.println("op2 is a register: " + ctx.op2().REGISTER());
        }
        if (ctx.op2().IMMEDIATE() != null) {
            System.out.println("op2 is an immediate: " + ctx.op2().IMMEDIATE());
        }
        System.out.println();
    }
}
