import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Message extends ListenerAdapter {

    public String prefix = "%";

    // * Note From (MaxThakurCodes): You can only edit the message if the bot is the author of the message

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        MessageChannel channel = event.getChannel();
        String rawMessage = event.getMessage().getContentRaw();
        String[] message = rawMessage.substring(prefix.length(), rawMessage.length()).split(" ");

        switch (message[0]) {
            case "hello":
                System.out.println(message);
                channel.sendMessage("Hello " + event.getAuthor().getName()).queue();
                break;

            case "play":
                
        }
    }
}