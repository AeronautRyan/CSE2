public class CodeTest{
public static void main(String[]args){
boolean arg = false;

for(int i = 0; i < 10; i++){
	if(i % 2 == 0 || arg){
		for(int j = 0; j < i + 1; j++){
			if(j > 4){
				continue;
				arg = true;
			}
			System.out.print(j);
			
		}
	}

	System.out.println();
}

}
}