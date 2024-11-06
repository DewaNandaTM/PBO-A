import java.util.HashMap;
import java.util.Map;

class Responder {
  private Map<String, String> answer = new HashMap<>();

  public Responder() {
    answer.put("bye", "Thank you for using our support system. If you have any other questions, feel free to reach out again. Have a great day!");
    answer.put("network", "If you're having trouble connecting to the internet, try restarting your router. Also, check if other devices can connect to see if it's a network-wide issue.");
    answer.put("login", "If you're having trouble logging in, please double-check your username and password. If you've forgotten your password, try using the 'Forgot Password' option to reset it.");
    answer.put("slow", "Slow performance can be caused by multiple factors, including memory or storage issues. Try closing any unnecessary applications and restarting your device to free up resources.");
    answer.put("software", "Please ensure that your software is updated to the latest version. Updates often contain bug fixes and improvements that might resolve the issue you're experiencing.");
    answer.put("crash", "If an app keeps crashing on your mobile device, try restarting the device and updating the app to the latest version. If that doesn't work, uninstall and reinstall the app.");
    answer.put("device", "If a device isn’t working as expected, check to make sure it’s compatible with your system or software version. Compatibility issues can often be resolved by updating software or firmware.");
    answer.put("driver", "Outdated drivers can sometimes cause performance issues or errors. Make sure your graphics, network, and other essential drivers are up to date. You can usually find updates on the manufacturer's website.");
    answer.put("pay", "For any payment issues, double-check that your billing information is accurate and that there are sufficient funds in your account. If a charge was declined, please try another payment method.");
    answer.put("error", "If you’ve encountered a specific error code, please share it with us. We can look up the code and guide you through the steps to resolve it.");
  }

  public void generateResponse(String respond) {
    for (Map.Entry<String, String> entry : answer.entrySet()) {
      if (respond.contains(entry.getKey())) {
        System.out.println(entry.getValue());
        return;
      }
    }
   
    System.out.println("Hmm, that sounds intresting. Tell me more...");
  }
}
