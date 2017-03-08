package coop.rchain.syntax.rholang.Absyn; // Java Package generated by the BNF Converter.

public class StructConstr extends Struct {
  public final String var_;
  public final ListProc listproc_;
  public StructConstr(String p1, ListProc p2) { var_ = p1; listproc_ = p2; }

  public <R,A> R accept(coop.rchain.syntax.rholang.Absyn.Struct.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof coop.rchain.syntax.rholang.Absyn.StructConstr) {
      coop.rchain.syntax.rholang.Absyn.StructConstr x = (coop.rchain.syntax.rholang.Absyn.StructConstr)o;
      return this.var_.equals(x.var_) && this.listproc_.equals(x.listproc_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.var_.hashCode())+this.listproc_.hashCode();
  }


}