public class HelloWorldComman {

	public static void main(String[] args) {

		int i = 0;
		//if (args.length > 0) {

			while (i < args.length){ //- 1) {
				System.out.print(args[i] + ((i==args.length-1)? "" : " "));
				i++;
			}

		
	//	} else
		//	System.out.println("Não existem argumentos");

		

		
		
		
	/*	i = 0;
		for (String s : args) {
			if (i == args.length - 1)
				System.out.print(s);
			else
				System.out.print(s + " ");

			i++;
		}*/

	}

}
