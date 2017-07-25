#Java-Base



	public class Emperor extends Penguin {
	
		public Emperor(String name) {
			super(name, 28);
	
		}
	
		@Override
		public void slide() {
		
			System.out.println("Yeaaaaah");
		}
	
		public void slide(Penguin p) {
	
			System.out.println("Yeaaaaah mama " + p.name);
		}
	
		public void slide (Emperor p){
			System.out.println("Pas glop la glisse avec le gros "+ p.name);
		}
	}