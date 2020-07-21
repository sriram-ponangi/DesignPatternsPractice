package creational.builder.example1.a;

import java.util.Set;

public class Email {
    private String subject;
    private String fromAddress;
    private Set<String> toAddresses;
    private Set<String> ccAddresses;
    private Set<String> bccAddresses;
    private String content;

    public Email(String subject, String fromAddress, Set<String> toAddresses,
                 Set<String> ccAddresses, Set<String> bccAddresses, String content) {
        this.subject = subject;
        this.fromAddress = fromAddress;
        this.toAddresses = toAddresses;
        this.ccAddresses = ccAddresses;
        this.bccAddresses = bccAddresses;
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public Set<String> getToAddresses() {
        return toAddresses;
    }

    public void setToAddresses(Set<String> toAddresses) {
        this.toAddresses = toAddresses;
    }

    public Set<String> getCcAddresses() {
        return ccAddresses;
    }

    public void setCcAddresses(Set<String> ccAddresses) {
        this.ccAddresses = ccAddresses;
    }

    public Set<String> getBccAddresses() {
        return bccAddresses;
    }

    public void setBccAddresses(Set<String> bccAddresses) {
        this.bccAddresses = bccAddresses;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Email{" +
                "subject='" + subject + "\'," + "\n" +
                " fromAddress='" + fromAddress + "\',"+ "\n" +
                " toAddresses=" + toAddresses + ",\n" +
                " ccAddresses=" + ccAddresses + ",\n" +
                " bccAddresses=" + bccAddresses + ",\n" +
                " content='" + content + "\'" + "\n" +
                '}';
    }
}
