package Question06;

public class SmartTest {
    public static void main(String[] args) {
        SmartSpeaker echo = new SmartSpeaker("Amazon Echo");
        
        System.out.println("--- Smart Home System ---");
        echo.getStatus();
        echo.connectToWifi();
        echo.processCommand("Play some music");
    }
}
