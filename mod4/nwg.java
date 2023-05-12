public class nwg
{
	public static void main(String[] args) {
		System.out.print("What is the country with \"the high");
		int[] asciiCodes = {101, 115, 116};
		char ans1[] = {'N','o','r','w','e','g','i','a','n','.'};
		char ans2[] = {'G','a','d','i','(','R','a','i','j','i','n','\0','-','\0','N','C','I',')'};
		for (int i = 0; i < asciiCodes.length; i++) {
            char c = (char)asciiCodes[i];
            System.out.print(c);
        }
		System.out.print(" internet use\"?\n\t");
		for (int i = 0; i < ans1.length; i++) {
            System.out.print(ans1[i]);
        }
        System.out.print("\nWhat is \"the most powerful supercomputer in the southern hemisphere\"?\n\t");
        for (int i = 0; i < ans2.length; i++) {
            System.out.print(ans2[i]);
        }
	System.out.print("\n");
	}
}

