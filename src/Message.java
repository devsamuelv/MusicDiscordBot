import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import util.Embeds;

public class Message extends ListenerAdapter {

    public String prefix = "%";

    // * Note From (MaxThakurCodes): You can only edit the message if the bot is the
    // bot is the author of the message

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Embeds embeds = new Embeds();
        MessageChannel channel = event.getChannel();
        String rawMessage = event.getMessage().getContentRaw();
        String[] message = rawMessage.substring(prefix.length(), rawMessage.length()).split(" ");

        if (!rawMessage.substring(0, 1).contains("%")) {
            return;
        }

        switch (message[0]) {
            case "hello":
                System.out.println(message);
                channel.sendMessage("Hello " + event.getAuthor().getName()).queue();
                break;

            case "help":
                channel.sendMessage("Commands: %play, %disconnect, %pause, %chill, %trap, %edm").queue();
                break;

            case "disconnect":
                channel.sendMessage("Not Finished").queue();
                break;

            case "pause":
                channel.sendMessage("Not Finished").queue();
                break;

            case "chill":
                channel.sendMessage("Not Finished").queue();
                break;

            case "trap":
                channel.sendMessage("Not Finished").queue();
                break;

            case "edm":
                channel.sendMessage("Not Finished").queue();
                channel.sendMessage(embeds.NotFinishedEmbed()).queue();
                break;

            default:
                channel.sendMessage("Commands: %play, %disconnect, %pause, %chill, %trap, %edm").queue();
                break;

        }
    }
}