package creational.builder.example1.a;

import java.util.HashSet;
import java.util.Set;

public class EmailBuilder {
    private String subject;
    private String fromAddress;
    private Set<String> toAddresses = new HashSet<>();;
    private Set<String> ccAddresses = new HashSet<>();;
    private Set<String> bccAddresses = new HashSet<>();;
    private String content;

    public EmailBuilder addToAddress(String address){
        this.toAddresses.add(address);
        return this;
    }

    public EmailBuilder addCCAddress(String address){
        this.ccAddresses.add(address);
        return this;
    }

    public EmailBuilder addBCCAddress(String address){
        this.bccAddresses.add(address);
        return this;
    }

    public  EmailBuilder setSubject(String subject){
        this.subject = subject;
        return this;
    }

    public  EmailBuilder setFromAddress(String fromAddress){
        this.fromAddress = fromAddress;
        return this;
    }

    public  EmailBuilder setContent(String content){
        this.content = content;
        return this;
    }

    public Email build() {
        return new Email(subject, fromAddress, toAddresses, ccAddresses, bccAddresses, content);
    }
}
