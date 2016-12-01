public class Graf {
	public static void main(String[] args) {
  
  int[] pole = new int[] { 7, 1, 3, 6};
  //int pole[] = new int[100];
  
  /*java.util.Scanner sc = new java.util.Scanner(System.in);
  while(sc.hasNextInt){
    pole[] = sc.nextInt();
    }*/
  
  for (int i = 0; i <= pole.length; i++){
    int hodnota = pole[i];
    System.out.printf("#", i*hodnota);
    }
  }
}