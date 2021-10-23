class Benford {

	/* METHODES UTILTAIRES FOURNIES*/

	// affichage  d'un tableau d'entiers
	public static void print(int[] tab) {
		for (int i = 0; i < tab.length; ++i) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}

	// affichage  d'un tableau de doubles
	public static void print(double[] tab) {
		for (int i = 0; i < tab.length; ++i) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] frequencies = new int[9];
		double[] numbers = new double[25];

		//  TEST 1.1
		System.out.println("Test 1.1 : ");
		fillWithSquare(numbers);
		print(numbers);
		System.out.println();
		// FIN TEST 1.1 

		//TEST 1.2
		System.out.println("Test 1.2 : ");
		System.out.println(extractMaxDigit(0));
		System.out.println(extractMaxDigit(632));
		System.out.println(extractMaxDigit(-221));
		System.out.println(extractMaxDigit(-554.15));
		System.out.println(extractMaxDigit(0.00421));
		System.out.println();
		// FIN TEST 1.2

		//  TEST 1.3
		System.out.println("Test 1.3 : ");
		analyze(numbers, frequencies);
		print(frequencies);
		System.out.println();
		// FIN TEST 1.3

		// TEST 1.4
		System.out.println("Test 1.4 : ");
		testBenford(frequencies, numbers.length);
		// FIN TEST 1.4
	}

	/**
	 * Remplis le tableau donné avec le carré des index incrémentés sur 100
	 * @param numbers Le tableau à remplir
	 */
	public static void fillWithSquare(double[] numbers) {
		for (int index = 0; index < numbers.length; index++) {
			numbers[index] = Math.pow(index + 1, 2) / 100.0;
		}
	}

	public static int extractMaxDigit(double number) {
		//La méthode utilisée se fera sur la valeur absolue
		if (number < 0.0) {
			number = -number;
		}

		//Si le nombre n'est toujours pas plus que 0, c'est qu'il est 0
		if (!(number > 0)) {
			return 0;
		}

		//Si le nombre est en-dessus de 0, le diviser par 10 jusqu'à ce qu'il soit à l'unité
		if (number > 1) {
			while (number % 10.0 > number || number % 10.0 < number) {
				number /= 10.0;
			}
		}
		//Si le nombre est en-dessous de 0, le multiplier par 10 jusqu'à ce qu'il soit à l'unité
		else if (number < 1) {
			while (number < 1) {
				number *= 10.0;
			}
		}
		//Sinon, il s'agit de 1
		else {
			return 1;
		}

		return (int) number;
	}

	public static void analyze(double[] numbers, int[] occurences) {
		for (int index = 0; index < numbers.length; index++) {
			int firstDigit = extractMaxDigit(numbers[index]);
			if (firstDigit != 0) {
				occurences[firstDigit - 1]++;
			}
		}
	}

	public static void testBenford(int[] occurences, int numbersLength) {
		int total = 0;
		for (int occurence : occurences) {
			total += occurence;
		}

		System.out.println("Pourcentage effectif / Predictions de la loi de Benford :");
		for (int index = 1; index <= occurences.length; index++) {
			System.out.println(index + " : " + occurences[index - 1] * 100 / total + "%, Benford : " + Math.log10(1.0 + 1.0 / index) * 100 + "%");
		}
	}
}

