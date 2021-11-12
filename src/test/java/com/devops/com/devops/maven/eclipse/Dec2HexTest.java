package com.devops.com.devops.maven.eclipse;


@RunWith(Parameterized.class)
public class Dec2HexTest {

	@Test
	@Parameters
	public static void test() {
		int Arg1;

        if (args.length == 0){
            System.out.println("You cannot run this code without a command line argument");
        } else {
            try{
        Arg1 = Integer.parseInt(args[0]);
        }
        catch(Exception e) {
            System.out.println("You must enter a whole number.");
        }
	}}}

	



