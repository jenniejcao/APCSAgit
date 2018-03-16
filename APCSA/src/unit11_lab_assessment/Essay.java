package unit11_lab_assessment;

public class Essay {
	private Paragraph[] paragraphList;
	private int size;
	public Essay(int a){
		size=a;
		paragraphList = new Paragraph[a];
		setParagraphList(size);
	}
	public Paragraph[] setParagraphList(int a){
		for (int i=0; i<a; i++){
			paragraphList[i] = new Paragraph(5);
		}
		return paragraphList;
		
	}
	public String toString(){
			String output="";
			for (int i=0; i<size; i++){
				output+=paragraphList[i]+"\n"+"\n";
			}
			return output;
			
	
	}
	public static void main(String[] args){
		Essay test = new Essay(5);
		System.out.print(test);
		
	}
}
