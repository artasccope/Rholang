package coop.rchain.syntax.rholang.Absyn; // Java Package generated by the BNF Converter.

public class PNew extends Proc {
  public final ListVar listvar_;
  public final Proc proc_;
  public PNew(ListVar p1, Proc p2) { listvar_ = p1; proc_ = p2; }

  public <R,A> R accept(coop.rchain.syntax.rholang.Absyn.Proc.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof coop.rchain.syntax.rholang.Absyn.PNew) {
      coop.rchain.syntax.rholang.Absyn.PNew x = (coop.rchain.syntax.rholang.Absyn.PNew)o;
      return this.listvar_.equals(x.listvar_) && this.proc_.equals(x.proc_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.listvar_.hashCode())+this.proc_.hashCode();
  }


}
