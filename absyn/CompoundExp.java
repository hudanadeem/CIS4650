package absyn;

public class CompoundExp extends Exp {
	public int pos;
	public VarDecList decs;
	public ExpList exps;

	public CompoundExp( int pos, VarDecList decs, ExpList exps ) {
		this.pos = pos;
		this.decs = decs;
		this.exps = exps;
	}

	public void accept( AbsynVisitor visitor, int level, boolean flag ) {
		visitor.visit( this, level, false );
	}
}