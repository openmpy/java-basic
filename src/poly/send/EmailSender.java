package poly.send;

public class EmailSender implements Sender {

    @Override
    public void sendMessage(String text) {
        System.out.println("메일을 발송합니다: " + text);
    }
}
