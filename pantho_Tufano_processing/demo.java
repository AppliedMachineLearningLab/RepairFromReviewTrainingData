class Computer {
  Computer() {
    System.out.println("Constructor of Computer class.");
  }
 
  void computer_method(int a, int b, String c) {
    System.out.println("Power gone! Shut down your PC soon...");
  }
 
  public static void main(String[] args) {
    Computer my = new Computer();
    Laptop your = new Laptop();
   
    my.computer_method();
    your.laptop_method();
  }
}
class Laptop {
	int a=0;
	double b;
  Laptop() {
	 int laptp;
    System.out.println("Constructor of Laptop class.");
  }
 
  void laptop_method() {
    System.out.println("99% Battery available.");
  }
}