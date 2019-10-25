package by.iba.entity;

import javax.persistence.*;

@Entity
@Table(name = "command")
public class Command {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "subsystem_id")
    private Subsystem subsystem;
    private String command;
    private String result;
    private String timestamp;

    public Command(Subsystem subsystem, String command, String result, String timestamp) {
        this.subsystem = subsystem;
        this.command = command;
        this.result = result;
        this.timestamp = timestamp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Subsystem getSubsystem() {
        return subsystem;
    }

    public void setSubsystem(Subsystem subsystem) {
        this.subsystem = subsystem;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Command{" +
                "id=" + id +
                ", subsystem=" + subsystem +
                ", command='" + command + '\'' +
                ", result='" + result + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
