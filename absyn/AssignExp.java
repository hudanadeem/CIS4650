package absyn;

public class AssignExp extends Exp {
	public int pos;
	public VarExp lhs;
	public Exp rhs;

	public AssignExp( int pos, VarExp lhs, Exp rhs ) {
		this.pos = pos;
		this.lhs = lhs;
		this.rhs = rhs;
	}

	public void accept( AbsynVisitor visitor, int level, boolean flag ) {
		visitor.visit( this, level, flag );
	}
}