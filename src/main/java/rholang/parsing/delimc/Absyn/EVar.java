package rholang.parsing.delimc.Absyn; // Java Package generated by the BNF Converter.

public class EVar extends Expr {
  public final String var_;
  public final Type type_;
  public EVar(String p1, Type p2) { var_ = p1; type_ = p2; }

  public <R,A> R accept(rholang.parsing.delimc.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.delimc.Absyn.EVar) {
      rholang.parsing.delimc.Absyn.EVar x = (rholang.parsing.delimc.Absyn.EVar)o;
      return this.var_.equals(x.var_) && this.type_.equals(x.type_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.var_.hashCode())+this.type_.hashCode();
  }


}