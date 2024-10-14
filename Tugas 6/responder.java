class Responder {
  public void generateResponse(String respond) {
    if (!respond.equalsIgnoreCase("bye")) {
      System.out.println("That sounds interesting. Tell me more...");
    } else {
      System.out.println("Thank you for using for using our support system, Goodbye!");
    }
  }
}
