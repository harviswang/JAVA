public class Syntax {
	public static void main(String[] args) {
		Semantic sc = new Semantic();
		sc.test();
		sc.testStringAPI("good", "luck", "work", "");
		sc.testStringAPI();
		sc.varArgsTest(6, "nice work");
	}

	static void testStringAPI(String... args)
	{
		for (String str : args) {
			if (!str.isEmpty()) {
				System.out.println(str);
			}

			if (str.contains("good")) {
				System.out.println(str + " contains " + "good");
			}
		}
	}

	static void varArgsTest(int i, String... args) {
		System.out.println("i = " + i);
		testStringAPI(args);
	}

	public /* static */ void test() {
		System.out.println("Syntax test() function");
	}
}
