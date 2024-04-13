package hwExt;

public class WriteTest {

	public static void main(String[] args) {
		Pen a =new Pencil("sss",100);
		Pen b =new InkBrush("ddsd",500);

		a.write();
		System.out.println(a.getPrice());
		System.out.println(b.getPrice());
		b.write();
		Pen[] g =new Pen[2];
		g[0] =new Pencil("ggg",100);
		g[1]=new InkBrush("fff",500);
		for(int i =0 ;i < g.length;i++) {
			g[i].write();
			System.out.println(g[i].getPrice());
		}
	}

}
