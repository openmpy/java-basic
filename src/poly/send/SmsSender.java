package poly.send;

public class SmsSender implements Sender {

    @Override
    public void sendMessage(String text) {
        System.out.println("SMS를 발송합니다: " + text);
    }
}
