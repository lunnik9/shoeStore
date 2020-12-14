package config.kafka;

public class Message {
    private byte[] body;
    private String replyTo;

    public Message(byte[] body, String replyTo) {
        this.body = body;
        this.replyTo = replyTo;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }
}
