package absyn;

public class ReturnExp extends Exp {
	public int pos;
	public Exp exp;

	public ReturnExp( int pos, Exp exp ) {
		this.pos = pos;
		this.exp = exp;
	}

	public void accept( AbsynVisitor visitor, int level, boolean flag ) {
		visitor.visit( this, level, false );
	}
}