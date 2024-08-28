/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends LabeledExprBaseVisitor<Double> {
    Map<String, Double> memory = new HashMap<String, Double>();

    @Override
    public Double visitAssign(LabeledExprParser.AssignContext ctx) {
        String id = ctx.ID().getText();  
        double value = visit(ctx.expr());  
        memory.put(id, value);           
        return value;
    }

    @Override
    public Double visitPrintExpr(LabeledExprParser.PrintExprContext ctx) {
        Double value = visit(ctx.expr());
        System.out.println(value);         
        return 0.0;                         
    }

    @Override
    public Double visitInt(LabeledExprParser.IntContext ctx) {
        return Double.valueOf(ctx.INT().getText());
    }
    
    @Override
    public Double visitFloat(LabeledExprParser.FloatContext ctx) {
        return Double.valueOf(ctx.FLOAT().getText());
    }

    @Override
    public Double visitId(LabeledExprParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if ( memory.containsKey(id) ) return memory.get(id);
        return 0.0;
    }
    @Override
    public Double visitMulDiv(LabeledExprParser.MulDivContext ctx) {
        double left = visit(ctx.expr(0));  // Obtener el valor de la subexpresión izquierda
        double right = visit(ctx.expr(1)); // Obtener el valor de la subexpresión derecha

        if (ctx.op.getType() == LabeledExprParser.MUL) {
            return left * right;  // Multiplicación
        } else {
            if (right == 0) {
                System.err.println("Error al dividir entre cero");
                return null;  // O puedes devolver un valor especial, como Double.NaN, dependiendo de cómo quieras manejarlo
            }
            return left / right;  // División
        }
    }
    
    @Override
    public Double visitAddSub(LabeledExprParser.AddSubContext ctx) {
        double left = visit(ctx.expr(0));  
        double right = visit(ctx.expr(1)); 
        if ( ctx.op.getType() == LabeledExprParser.ADD ) return left + right;
        return left - right; 
    }

    @Override
    public Double visitParens(LabeledExprParser.ParensContext ctx) {
        return visit(ctx.expr()); 
    }
}

