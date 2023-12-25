
class ArtimetickaSredina {
	int a;
	int b;
	int c;
	
	ArtimetickaSredina (int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	void calculateAS() {
		System.out.println((a+b+c)/3);
	}

	public static void main(String[] args) {
	ArtimetickaSredina firstN= new ArtimetickaSredina (3,5,7);
	ArtimetickaSredina secondN= new ArtimetickaSredina (13,25,29);
	
	firstN.calculateAS();
	secondN.calculateAS();

	}

}
